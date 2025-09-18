package game;

import hero.Hero;

import java.util.Scanner;

public class Game {

    private Hero hero;

    public Game() {
        hero = new Hero();
    }

    public void executeCommands() {

        SIGNALS currentSignal = getCommand();

        while (!currentSignal.equals(SIGNALS.STOP_PROGRAM)) {
            switch (currentSignal) {
                case MOVE_HERO: {
                    System.out.println("Give coordinates to move hero:");
                    int x = 0, y = 0;
                    Scanner systemInScanner = new Scanner(System.in);
                    x = systemInScanner.nextInt();
                    y = systemInScanner.nextInt();
                    hero.move(x, y);
                    break;
                }
                case CHANGE_STRATEGY: {
                    System.out.println("0 - Walking; 1 - HorseRiding; 2 - Flying; 3 - Crawling");
                    Scanner systemInScanner = new Scanner(System.in);
                    int numberStrategy = systemInScanner.nextInt();
                    hero.changeStrategy(numberStrategy);
                    break;
                }
            }
            currentSignal = getCommand();
        }

    }

    public SIGNALS getCommand() {
        System.out.println("0 - move hero; 1 - change strategy; 2 - stop program");
        SIGNALS currentSignal = SIGNALS.STOP_PROGRAM;
        Scanner systemInScanner = new Scanner(System.in);
        int signalNumber = systemInScanner.nextInt();

        if (signalNumber == SIGNALS.MOVE_HERO.ordinal()) {
            currentSignal = SIGNALS.MOVE_HERO;
        } else if (signalNumber == SIGNALS.CHANGE_STRATEGY.ordinal()) {
            currentSignal = SIGNALS.CHANGE_STRATEGY;
        } else if (signalNumber == SIGNALS.STOP_PROGRAM.ordinal()) {
            currentSignal = SIGNALS.STOP_PROGRAM;
        } else {
            System.out.println("You've typed an incorrect signal number");
        }
        return currentSignal;
    }

    public enum SIGNALS {
        MOVE_HERO, CHANGE_STRATEGY, STOP_PROGRAM
    }

}
