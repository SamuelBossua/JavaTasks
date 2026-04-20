public class CoinFlip {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1_000_000; i++) {
            if (Math.random() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);




























}
}