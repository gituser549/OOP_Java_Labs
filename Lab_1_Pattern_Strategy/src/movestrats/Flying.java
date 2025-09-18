package movestrats;

public class Flying implements MoveStrategy {
    @Override
    public void checkKind() {
        System.out.println("I'm flying");
    }
}