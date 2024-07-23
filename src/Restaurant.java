public class Restaurant {

    private String name;
    private String address;
    private MenuItem[] menuItems;
    private int itemCount;
    public Restaurant(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.menuItems = new MenuItem[capacity];
        this.itemCount = 0;
    }
    public void addMenuItem(String name, double price, double rating) {
        if (itemCount < menuItems.length) {
            menuItems[itemCount] = new MenuItem(name, price, rating);
            itemCount++;
            System.out.println("آیتم '" + name + "' به منوی " + this.name + " افزوده شد.");
        } else {
            System.out.println("خطا: ظرفیت منو پر است.");
        }
    }
    public void displayMenu() {
        System.out.println("منوی رستوران " + name + ":");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + menuItems[i].displayInfo());
        }
    }
    public void displayInfo() {
        System.out.println("نام رستوران: " + name);
        System.out.println("آدرس: " + address);
    }

}
