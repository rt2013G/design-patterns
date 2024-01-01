/**
 * To be fair Builder is probably a better pattern than Decorator to use for a Pizzeria, but whatever
 */
public class Pizzeria {
    public static void main(String... args) {
        Pizza pizza = new Cheese(
                new Fries(
                        new WhitePizza()
                )
        );

        System.out.println(pizza.getDescription() + ", cost: " + pizza.cost());
    }
}