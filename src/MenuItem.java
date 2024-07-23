public class MenuItem {
    private String name;
    private double price;
    private double rating;
    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String displayInfo() {
        return name + " - قیمت: " + price + " تومان - امتیاز: " + rating;
    }

}
