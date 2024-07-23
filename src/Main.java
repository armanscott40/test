
public class Main {
    public static void main(String[] args) {
        AirTrip flight1 = new AirTrip("Tehran", "IR123", "2023-10-25 16:30");
        System.out.println("Flight Status: " + flight1.getFlightStatus());
        flight1.changeFlightStatus("Delayed", 1, 30);
        System.out.println("Flight Status: " + flight1.getFlightStatus());
        flight1.changeFlightStatus("On Time", 18, 0);
        System.out.println("Flight Status: " + flight1.getFlightStatus());

        Restaurant restaurant = new Restaurant("رستوران آرمان ", "تهران، ناهید شرقی ", 5);
        restaurant.displayInfo();
        restaurant.addMenuItem("پیتزا", 500000, 4.0);
        restaurant.addMenuItem("برگر", 290000, 3.2);
        restaurant.addMenuItem("سالاد", 2500000, 5.0);
        restaurant.addMenuItem("پاستا", 39000, 4.7);
        restaurant.addMenuItem("سوپ", 100000, 4.3);
        restaurant.addMenuItem("دسر تیرامیسو ", 28000, 4.1);
        restaurant.displayMenu();

    }

}
