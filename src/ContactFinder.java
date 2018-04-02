import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ContactFinder {


    private DataManager dataManager = DataManager.getInstance();

    public List<Entity> findContact(String firstName) {
        GoFList contactList = dataManager.getContactList();
        return contactList.stream().filter(contact -> contact.getFirstName().equals(firstName)).collect(Collectors.toList());

    }
}