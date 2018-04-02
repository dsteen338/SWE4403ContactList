import java.util.ArrayList;


public class ContactManager {

    private DataManager dataManager = DataManager.getInstance();


    public void addContact(String inContact) {
        GoFList contactList = dataManager.getContactList();
        String[] lineArr = inContact.split(" ");
        Contact contact = new Contact();
        contact.setId(dataManager.getNextId());
        contact.setFirstName(lineArr[0]);
        contact.setLastName(lineArr[1]);
        contact.setAddress(lineArr[2]);
        contact.setPhone(lineArr[3]);
        contact.setEmail(lineArr[4]);
        contactList.append(contact);
    }


    public void deleteContact(int id) {
        Contact c = dataManager.getContactList().stream().filter(contact -> contact.getId() == id).findFirst().orElse(null);
        dataManager.getContactList().delete(c);
    }
}