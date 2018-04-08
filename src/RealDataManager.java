
import java.io.*;

public class RealDataManager implements DataManager {

    private GoFList contactList;
    private static final String FILENAME = "contacts.txt";

    private RealDataManager() {
        super();
        this.contactList = new GoFListAdapter();
    }

    private static RealDataManager singleInstance;

    public static RealDataManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new RealDataManager();
        }

        return singleInstance;

    }


    public GoFList getContactList() {
        return contactList;
    }

    public void setContactList(GoFList inContactList) {
        this.contactList = inContactList;
    }


    public void load() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(FILENAME);
        ObjectInputStream ObjectInStream = new ObjectInputStream(fileInputStream);

        contactList = (GoFList) ObjectInStream.readObject();

        fileInputStream.close();
        ObjectInStream.close();
    }

    public void save() throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        fileOutputStream.close();
        objectOutputStream.close();

        fileOutputStream = new FileOutputStream(FILENAME);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(contactList);

        fileOutputStream.close();
        objectOutputStream.close();

    }
}