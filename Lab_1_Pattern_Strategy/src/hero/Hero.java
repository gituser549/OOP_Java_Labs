package hero;

import movestrats.*;
import point.Point;

public class Hero {

    private MoveStrategy currentStrategy;
    private Point currentPosition;

    public Hero() {
        currentStrategy = new Walking();
        currentPosition = new Point(0, 0);
    }

    public void changeStrategy(int newStrategy) {

        if (newStrategy == STRATEGIES.WALKING.ordinal()) {
            currentStrategy = new Walking();
        } else if (newStrategy == STRATEGIES.HORSE_RIDING.ordinal()) {
            currentStrategy = new HorseRiding();
        } else if (newStrategy == STRATEGIES.FLYING.ordinal()) {
            currentStrategy = new Flying();
        } else if (newStrategy == STRATEGIES.CRAWLING.ordinal()) {
            currentStrategy = new Crawling();
        } else {
            System.out.println("You've typed an incorrect number of moving strategy\n");
            return;
        }
        System.out.println("Successfully changed move strategy");
    }

    public void move(int x, int y) {
        currentStrategy.checkKind();
        currentPosition.setX(x);
        currentPosition.setY(y);
        System.out.println("My new position is: (" + currentPosition.getX() + ", " + currentPosition.getY() + ")");
    }

    public enum STRATEGIES {
        WALKING, HORSE_RIDING, FLYING, CRAWLING
    }

}
