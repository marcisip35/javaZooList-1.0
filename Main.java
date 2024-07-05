import java.util.Scanner;

public class Main {
    static boolean exit = false;

    public static void main(String[] args){
        runProgram();
    }

    public static void runProgram() {
        menuStatement();
        showSelectedMenu(selectedMenu());
    }

    public static void menuStatement() {
        System.out.println(
                "\nZoo Menu \n1. Rates (Buy Tickets Here!) \n2. Hours \n3. Animals \n4. Locations \n5. Contact Info \n6. Exit");
    }

    public static String selectedMenu() {
        System.out.print("Select a page by typing out the name or number of the page: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        return input;
    }

    public static void showSelectedMenu(String selected) {
        
        if (selected.equals("1") || selected.equalsIgnoreCase("Rates")) {
            ratesMenu();
        } else if (selected.equals("2") || selected.equalsIgnoreCase("Hours")) {
            hoursMenu();
        } else if (selected.equals("3") || selected.equalsIgnoreCase("Animals")) {

        } else if (selected.equals("4") || selected.equalsIgnoreCase("Locations")) {

        } else if (selected.equals("5") || selected.equalsIgnoreCase("Contact Info")) {

        } else if (selected.equals("6") || selected.equalsIgnoreCase("Exit")) {
            exit = true;
        } else {
            System.out.println("\n\nInvalid input please try again");
            runProgram();
        }
    }

    public static void ratesMenu(){
        Scanner inputScanner = new Scanner(System.in);
        String input;
        Rates rates = new Rates();

        System.out.println(rates.toString());
        System.out.println("-Home");
        System.out.print("Select a ticket by typing the ticket name type or it's corresponding number (type \"Home\" to go back to the Main Menu):");
        input = inputScanner.nextLine();

        if(input.equalsIgnoreCase("Home")){
            runProgram();
        } else {
            
        }

        inputScanner.close();
    }

    public static void hoursMenu(){
        Scanner inputScanner = new Scanner(System.in);
        String input;
        Hours hours = new Hours();
        System.out.println(hours.toString());
        System.out.println("\nType \"Home\" to return to the Main Menu");
        input = inputScanner.nextLine();

        if(input.equalsIgnoreCase("Home")){
            runProgram();
        }

        inputScanner.close();
    }

}