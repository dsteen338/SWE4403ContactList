
import java.io.*;

public class DataManager {

    private GoFList contactList = new GoFListAdapter();
    private static final String FILENAME = "contacts.txt";
    private int nextId = 1;

    private DataManager() {
        super();
    }

    private static DataManager singleInstance;

    public static DataManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new DataManager();
        }

        return singleInstance;

    }


    public GoFList getContactList() {
        return contactList;
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

    public int getNextId() {
        nextId++;
        return this.nextId -1;
    }
}