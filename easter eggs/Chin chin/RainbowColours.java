public class RainbowColours {
    public static void main(String[] args) {

        // Generate random number between 1 and 7
        int number = (int)(Math.random() * 7) + 1;

        System.out.println("Generated number: " + number);

        switch (number) {
            case 1:
                System.out.println("Violet");
                break;
            case 2:
                System.out.println("Indigo");
                break;
            case 3:
                System.out.println("Blue");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Yellow");
                break;
            case 6:
                System.out.println("Orange");
                break;
            case 7:
                System.out.println("Red");
                break;
        }
    }
}