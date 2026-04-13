import java.util.Scanner;

public class NokiaPhone {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("\n--- NOKIA 3310 MENU ---");
            System.out.println("1. Phone Book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call Divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
            System.out.println("0. Exit");

            String choice = input.nextLine();

            switch (choice) {
                case "1": phoneBook(); break;
                case "2": messages(); break;
                case "3": System.out.println("Opening Chat..."); break;
                case "4": callRegister(); break;
                case "5": System.out.println("Opening Tones..."); break;
                case "6": settings(); break;
                case "7": System.out.println("Opening Call Divert..."); break;
                case "8": System.out.println("Opening Games..."); break;
                case "9": System.out.println("Opening Calculator..."); break;
                case "10": System.out.println("Opening Reminders..."); break;
                case "11": clock(); break;
                case "12": System.out.println("Opening Profiles..."); break;
                case "13": System.out.println("Opening SIM Services..."); break;
                case "0":
                    System.out.println("Goodbye!!!");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void phoneBook() {
        while (true) {
            System.out.println("\n--- Phone Book ---");
            System.out.println("1. Search");
            System.out.println("2. Add Name");
            System.out.println("3. Erase");
            System.out.println("4. Edit");
            System.out.println("5. Back");

            String choice = input.nextLine();

            switch (choice) {
                case "1": System.out.println("Searching..."); break;
                case "2": System.out.println("Adding Name..."); break;
                case "3": System.out.println("Erasing..."); break;
                case "4": System.out.println("Editing..."); break;
                case "5": return;
                default: System.out.println("Invalid option");
            }
        }
    }

    public static void messages() {
        while (true) {
            System.out.println("\n--- Messages ---");
            System.out.println("1. Write Message");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Templates");
            System.out.println("5. Back");

            String choice = input.nextLine();

            switch (choice) {
                case "1": System.out.println("Writing message..."); break;
                case "2": System.out.println("Opening Inbox..."); break;
                case "3": System.out.println("Opening Outbox..."); break;
                case "4": System.out.println("Opening Templates..."); break;
                case "5": return;
                default: System.out.println("Invalid option");
            }
        }
    }

    public static void callRegister() {
        while (true) {
            System.out.println("\n--- Call Register ---");
            System.out.println("1. Missed Calls");
            System.out.println("2. Received Calls");
            System.out.println("3. Dialled Numbers");
            System.out.println("4. Back");

            String choice = input.nextLine();

            switch (choice) {
                case "1": System.out.println("Missed Calls..."); break;
                case "2": System.out.println("Received Calls..."); break;
                case "3": System.out.println("Dialled Numbers..."); break;
                case "4": return;
                default: System.out.println("Invalid option");
            }
        }
    }

    public static void settings() {
        while (true) {
            System.out.println("\n--- Settings ---");
            System.out.println("1. Call Settings");
            System.out.println("2. Phone Settings");
            System.out.println("3. Security Settings");
            System.out.println("4. Back");

            String choice = input.nextLine();

            switch (choice) {
                case "1": System.out.println("Call Settings..."); break;
                case "2": System.out.println("Phone Settings..."); break;
                case "3": System.out.println("Security Settings..."); break;
                case "4": return;
                default: System.out.println("Invalid option");
            }
        }
    }

    public static void clock() {
        while (true) {
            System.out.println("\n--- Clock ---");
            System.out.println("1. Alarm Clock");
            System.out.println("2. Clock Settings");
            System.out.println("3. Stopwatch");
            System.out.println("4. Back");

            String choice = input.nextLine();

            switch (choice) {
                case "1": System.out.println("Alarm Clock..."); break;
                case "2": System.out.println("Clock Settings..."); break;
                case "3": System.out.println("Stopwatch..."); break;
                case "4": return;
                default: System.out.println("Invalid option");
            }
        }
    }
}