import java.io.IOException;
import java.util.List;

public class SystemFacade {
    private ContactManager contactManager = new ContactManager();
    private ContactFinder contactFinder;
    private DataManager dataManager;


    public SystemFacade() {
        this.contactManager =  new ContactManager();
        this.contactFinder = new ContactFinder();
        this.dataManager =  DataManager.getInstance();
    }

    public void addContact(String contactInfo) {
        contactManager.addContact(contactInfo);
    }

    public void deleteContact(int id) {
        contactManager.deleteContact(id);
    }


    public void searchContact(String name) {
        List<Entity> contacts = contactFinder.findContact(name);
        if (contacts.isEmpty())
            System.out.println("No contact found.");
        else {
            for (Entity contact : contacts) {
                System.out.println(contact.toString());
            }
        }
    }

    public void saveContacts() throws IOException {
        dataManager.save();
    }

    public void loadContacts() throws IOException, ClassNotFoundException {
        dataManager.load();
    }
}