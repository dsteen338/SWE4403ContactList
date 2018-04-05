import java.util.List;
import java.util.ArrayList;


public class ContactFinder {


    private DataManager dataManager = DataManager.getInstance();

    public List<Entity> findContact(String firstName) {
        List<Entity> returnList = new ArrayList<>();
        GoFListEntityIterator iter = new GoFListEntityIterator(dataManager.getContactList());
        for(iter.first(); !iter.isDone(); iter.next()) {
            Entity currentContact = iter.currentItem();

            if (currentContact.getFirstName().equals(firstName)) {
                returnList.add(currentContact);
            }
        }

        return returnList;
    }
}