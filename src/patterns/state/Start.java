package patterns.state;

import patterns.state.context.TransformerContext;
import patterns.state.state.FireState;
import patterns.state.state.MoveState;
import patterns.state.state.TransformerState;

public class Start {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
    }
}
