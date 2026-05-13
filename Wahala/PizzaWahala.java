import java.util.Scanner;

public class PizzaWahala {

    public static int getSlices(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Sapa size")) return 4;
        if (pizzaType.equalsIgnoreCase("Small Money")) return 6;
        if (pizzaType.equalsIgnoreCase("Big boys")) return 8;
        if (pizzaType.equalsIgnoreCase("Odogwu")) return 12;
        return 0;
    }

    public static int getPrice(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Sapa size")) return 2500;
        if (pizzaType.equalsIgnoreCase("Small Money")) return 2900;
        if (pizzaType.equalsIgnoreCase("Big boys")) return 4000;
        if (pizzaType.equalsIgnoreCase("Odogwu")) return 5200;
        return 0;
    }

    public static int calculateBoxes(int people, int slicesPerBox) {
        return (people + slicesPerBox - 1) / slicesPerBox;
    }

    public static int calculateLeftOverSlices(int people, int boxes, int slicesPerBox) {
        return (boxes * slicesPerBox) - people;
    }

    public static int calculatePrice(int boxes, int pricePerBox) {
        return boxes * pricePerBox;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type: ");
        String pizzaType = input.nextLine();

        int slicesPerBox = getSlices(pizzaType);
        int pricePerBox = getPrice(pizzaType);

        int boxes = calculateBoxes(people, slicesPerBox);
        int leftOver = calculateLeftOverSlices(people, boxes, slicesPerBox);
        int totalPrice = calculatePrice(boxes, pricePerBox);

        System.out.println("Number of boxes of pizza to buy = " + boxes + " boxes");
        System.out.println("Number left over slices after serving = " + leftOver + " slices");
        System.out.println("Price = " + totalPrice);
    }
}