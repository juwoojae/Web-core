package lunch.server.domain;

public class Menu {
    private String name;
    private String spicy;
    private int price;

    public Menu(String name, String spicy, int price) {
        this.name = name;
        this.spicy = spicy;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getSpicy() {
        return spicy;
    }
    public int getPrice() {
        return price;
    }
}
