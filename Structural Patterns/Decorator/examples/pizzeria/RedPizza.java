public class RedPizza extends Pizza {
    public RedPizza() {
        this.description = "Red Pizza";
        this.price = 4.00;
    }

    public double cost() {
        return this.price;
    }
}