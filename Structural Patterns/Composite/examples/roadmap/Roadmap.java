public class Roadmap {
    public static void main(String... args) {
        Component roadmap = new Project("Design patterns project");

        Component compositeProject = new Project("Composite pattern example");
        Component buildComposite = new Task("The Composite pattern is...");
        Component usecaseComposite = new Task("The Composite pattern is used when...");
        compositeProject.add(buildComposite);
        compositeProject.add(usecaseComposite);

        Component singletonProject = new Project("Singleton pattern example");
        Component buildSingleton = new Task("The Singleton pattern is...");
        Component usecaseSingleton = new Task("The Singleton pattern is used when...");
        singletonProject.add(buildSingleton);
        singletonProject.add(usecaseSingleton);

        roadmap.add(compositeProject);
        roadmap.add(singletonProject);

        roadmap.printComponent();
    }
}