

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private GoFList contactList = new GoFListAdapter();
    Gson gson = new Gson();
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

    public void load() throws IOException {
        JsonReader reader = new JsonReader(new FileReader(FILENAME));


        Type collectionType = new TypeToken<List<Contact>>(){}.getType();
        List<Contact> inContactList = (List<Contact>) new Gson().fromJson(reader, collectionType);


        for (Contact contact : inContactList) {
            contactList.append(contact);

            if(contact.getId() >= nextId) {
                nextId = contact.getId() + 1;
            }
        }


        reader.close();
    }

    public void save() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME));
        writer.close();

        writer = new BufferedWriter(new FileWriter(FILENAME));

        gson.toJson(contactList.getArrayList(), writer);

        writer.close();

    }

    public int getNextId() {
        nextId++;
        return this.nextId -1;
    }
}