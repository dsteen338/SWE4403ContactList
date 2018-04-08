import java.io.IOException;

public interface DataManager {

    void load() throws IOException, ClassNotFoundException;
    void save() throws IOException;
    GoFList getContactList();
    void setContactList(GoFList contactList);
}
