import java.util.List;
import java.util.ArrayList;


public class ContactFinder {


    private DataManager dataManager = DataManager.getInstance();

    public List<Contact> findContact(String firstName) {
        List<Contact> returnList = new ArrayList<>();
        GoFListEntityIterator iter = new GoFListEntityIterator(dataManager.getContactList());
        for(iter.first(); !iter.isDone(); iter.next()) {
            Contact currentContact = (Contact) iter.currentItem();

            if (currentContact.getFirstName().equals(firstName)) {
                returnList.add(currentContact);
            }
        }

        return returnList;
    }
}