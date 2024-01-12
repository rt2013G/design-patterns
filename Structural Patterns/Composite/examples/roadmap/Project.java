import java.util.*;

public class Project implements Component {
    private List<Component> components = new ArrayList<>();
    private String description;

    public Project(String description) {
        this.description = description;
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public Component getChild(int index) {
        return this.components.get(index);
    }

    public void printComponent() {
        System.out.println(description);
        for(Component component : components) {
            component.printComponent();
        }
    }
}