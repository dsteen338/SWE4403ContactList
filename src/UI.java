import java.util.Scanner;


public class UI {

    private SystemFacade systemFacade = new SystemFacade();

    public void handleChoice(String input) throws Exception {
        Scanner scan = new Scanner(System.in);

        if (input.equals("add")) {
            System.out.println("enter in the first information of the contact you wish to add");
            System.out.println("expected format: FirstName LastName Address Phone Email (each field separated by spaces)");
            systemFacade.addContact(scan.nextLine());

        } else if (input.equals("delete")) {
            System.out.println("enter in the Id of the contact you wish to delete");
            systemFacade.deleteContact(Integer.parseInt(scan.nextLine()));

        } else if (input.equals("search")) {
            System.out.println("enter in the first name of the contact you wish to find");
            systemFacade.searchContact(scan.nextLine());

        } else if (input.equals("save")) {
            systemFacade.saveContacts();

        } else if (input.equals("load")) {
            systemFacade.loadContacts();

        } else if (input.equals("quit")) {
            systemFacade.loadContacts();

        } else {
            throw new Exception("invalid input");
        }
    }
}
