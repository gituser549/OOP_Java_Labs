package movestrats;

public class Crawling implements MoveStrategy {
    @Override
    public void checkKind() {
        System.out.println("I'm crawling");
    }
}
