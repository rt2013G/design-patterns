public abstract class Pizza {
    String description = "Unkwnon Pizza";
    double price = 0.0;

    public String getDescription() {
        return this.description;
    }
    public abstract double cost();
}