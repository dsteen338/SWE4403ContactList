import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SystemFacade {
    private ContactManager contactManager = new ContactManager();
    private ContactFinder contactFinder;
    private DataManager dataManager;

    private static SystemFacade singleInstance;

    public static SystemFacade getInstance() {
        if (singleInstance == null) {
            singleInstance = new SystemFacade();
        }

        return singleInstance;

    }

    private SystemFacade() {
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

    public CListMomento createMomento() {
        CListMomento cm = new CListMomento();
        ArrayList<Entity> tempContacts = new ArrayList<>();

        GoFListEntityIterator iter = new GoFListEntityIterator(dataManager.getContactList());
        for(iter.first(); !iter.isDone(); iter.next()) {
            tempContacts.add(dataManager.getContactList().get(0));

        }

        GoFList copiedList = new GoFListAdapter(tempContacts);
        cm.setState(copiedList);
        return cm;
    }

    public void setMomento(CListMomento cListMomento) {
        this.dataManager.setContactList(cListMomento.getState());
    }
}