public abstract class Topping extends Pizza {
    Pizza pizza;
    String description = "Unknown topping";

    public abstract String getDescription();
}