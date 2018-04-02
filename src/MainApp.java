import java.util.Scanner;


public class MainApp {


    public static void main(String[] args) throws Exception {
        UI myUi = new UI();
        System.out.println("Welcome to contact list, Enter in desired function: add/delete/search/save/load");

        while (true) {

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                myUi.handleChoice(input);
            }
            System.out.println("Enter in desired function: add/delete/search/save/load/quit");

        }

    }

}
