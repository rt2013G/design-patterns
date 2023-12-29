public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void colleagueMethod() {
        mediator.action1();
        mediator.action2();
    }
}