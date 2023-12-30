public class NonTerminalExpression implements AbstractExpression {
    private AbstractExpression expression1;
    private AbstractExpression expression2;

    public NonTerminalExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    public void interpret(Context context) {
        expression1.interpret(context);
        expression2.interpret(context);
        // etc..
    }
}