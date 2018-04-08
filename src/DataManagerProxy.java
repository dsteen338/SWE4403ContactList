import java.io.IOException;

public class DataManagerProxy implements DataManager {

    private static DataManagerProxy singleInstance;
    private RealDataManager dataManager;
    private int nextId = 1;


    public static DataManagerProxy getInstance() {
        if (singleInstance == null) {
            singleInstance = new DataManagerProxy();
        }
        return singleInstance;
    }

    private DataManagerProxy() {
        super();
    }

    private RealDataManager realDataManager;

    @Override
    public void load() throws IOException, ClassNotFoundException {
        if(realDataManager == null) {
            realDataManager = RealDataManager.getInstance();
        }

        realDataManager.load();

        GoFListEntityIterator iter = new GoFListEntityIterator(realDataManager.getContactList());
        for(iter.first(); !iter.isDone(); iter.next()) {
            Entity currentContact = iter.currentItem();
            if(currentContact.getId() >= nextId) {
                nextId = currentContact.getId() + 1;
            }
        }


    }

    @Override
    public void save() throws IOException {
        if(realDataManager == null) {
            realDataManager = RealDataManager.getInstance();
        }

        realDataManager.save();

    }

    @Override
    public GoFList getContactList() {
        if(realDataManager == null) {
            realDataManager = RealDataManager.getInstance();
        }

        return realDataManager.getContactList();
    }

    @Override
    public void setContactList(GoFList contactList) {
        if(realDataManager == null) {
            realDataManager = RealDataManager.getInstance();
        }

        realDataManager.setContactList(contactList);
    }

    public int getNextId() {
        nextId++;
        return this.nextId -1;
    }
}
