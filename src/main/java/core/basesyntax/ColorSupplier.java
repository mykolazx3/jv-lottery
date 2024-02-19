package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int AMOUNT_OF_COLORS = Color.values().length - 1;
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(AMOUNT_OF_COLORS);
        return Color.values()[index].name();
    }
}
