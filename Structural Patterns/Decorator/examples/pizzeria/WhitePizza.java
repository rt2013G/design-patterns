public class WhitePizza extends Pizza {
    public WhitePizza() {
        this.description = "White Pizza";
        this.price = 3.50;
    }

    public double cost() {
        return this.price;
    }
}