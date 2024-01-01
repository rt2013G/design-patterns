public class Fries extends Topping {
    public Fries(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Fries";
    }

    public double cost() {
        return pizza.cost() + 1.5;
    }
}