public class AirTrip {
    private String destination;
    private String flightNumber;
    private String departureTime;
    private String flightStatus;
    private int delayHours;
    private int delayMinutes;

    public AirTrip(String destination, String flightNumber, String departureTime) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.flightStatus = "On Time"; // وضعیت پیش‌فرض
        this.delayHours = 0;
        this.delayMinutes = 0;
    }
    public String getFlightStatus() {
        if (flightStatus.equals("Delayed")) {
            return "Flight is delayed by " + String.format("%02d:%02d", delayHours, delayMinutes);
        } else {
            return "Flight is " + flightStatus;
        }
    }

    public void changeFlightStatus(String newStatus, int hours, int minutes) {
        this.flightStatus = newStatus;
        if (newStatus.equals("Delayed")) {
            this.delayHours = hours;
            this.delayMinutes = minutes;
        }
    }
}