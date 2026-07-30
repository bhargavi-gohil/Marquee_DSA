public class Lipstick {
    private String shade;
    private int price;

    public void setShade(String shade) {
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void applyDiscount(int discount) {
        price -= discount;
        if (price < 0) {
            price = 0;
        }
    }

    public static void main(String[] args) {
        Lipstick l = new Lipstick();

        l.setShade("Rose Quartz");
        l.setPrice(1800);
        System.out.println("Lipstick shade: " + l.getShade());
        System.out.println("Original price: " + l.getPrice());

        l.applyDiscount(300);
        System.out.println("Discounted price: " + l.getPrice());
    }
}
