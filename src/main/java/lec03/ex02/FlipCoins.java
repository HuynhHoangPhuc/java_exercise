package lec03.ex02;

public class FlipCoins {
    private final int numberOfCoins;

    public FlipCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public void flips() {
        String[] coins = new String[this.numberOfCoins];

        for (int i = 0; i < coins.length; i++) {
            if (Math.random() < 0.5) {
                coins[i] = "heads";
            } else {
                coins[i] = "tails";
            }
        }

        for (String coin : coins) {
            System.out.printf("%s ", coin);
        }

        System.out.println();
    }
}
