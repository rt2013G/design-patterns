public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void colleagueMethod() {
        mediator.action1();
        mediator.action2();
    }
}