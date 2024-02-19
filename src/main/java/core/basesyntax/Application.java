package core.basesyntax;

public class Application {
    // create three balls using class Lottery and print information about them in console
    public static final int AMOUNT_OF_LOTTERY_GAMES = 10;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        for (int i = 0; i < AMOUNT_OF_LOTTERY_GAMES; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
