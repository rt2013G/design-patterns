public class Task implements Component {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public void add(Component component) {
        System.out.println("Leaf nodes should not have children");
    }

    public void printComponent() {
        System.out.println(description);
    }
}