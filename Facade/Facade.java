public class Facade {
    private Class1 class1;
    private Class2 class2;
    private Class3 class3;

    public Facade() {
    }

    public void facadeMethod() {
        class1.someMethod();
        class2.someMethod();
        class3.someMethod();
        // other actions
    }

}