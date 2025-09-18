package movestrats;

public class Walking implements MoveStrategy {
    @Override
    public void checkKind() {
        System.out.println("I'm walking");
    }
}
