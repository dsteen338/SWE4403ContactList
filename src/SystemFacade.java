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

    public void addContact(String firstName, String lastName, String address, String phone, String email) {
        contactManager.addContact(firstName, lastName, address, phone, email);
    }

    public boolean deleteContact(int id) {
        return contactManager.deleteContact(id);
    }


    public List<Contact> searchContact(String name) {
        return contactFinder.findContact(name);        
    }

    public void saveContacts() throws IOException {
        dataManager.save();
    }

    public void loadContacts() throws IOException, ClassNotFoundException {
        dataManager.load();
    }
}