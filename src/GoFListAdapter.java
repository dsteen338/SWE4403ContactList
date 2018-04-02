import java.util.ArrayList;
import java.util.stream.Stream;


public class GoFListAdapter implements GoFList {

    private ArrayList<Contact> arrayList;

    public GoFListAdapter() {
        arrayList = new ArrayList<Contact>();
    }

    @Override
    public int count() {
        return arrayList.size();
    }

    @Override
    public Contact get(int index) {
        return arrayList.get(index);
    }

    @Override
    public Contact first() {
        return arrayList.get(0);
    }

    @Override
    public Contact last() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public boolean include(Contact contact) {
        return arrayList.contains(contact);
    }

    @Override
    public void append(Contact contact) {
        arrayList.add(contact);

    }

    @Override
    public void prepend(Contact contact) {
        arrayList.add(0, contact);

    }

    @Override
    public void delete(Contact obj) {
        arrayList.remove(obj);

    }

    @Override
    public void deleteLast() {
        arrayList.remove(arrayList.size() - 1);

    }

    @Override
    public void deleteFirst() {
        arrayList.remove(0);

    }

    @Override
    public void deleteAll() {
        arrayList.clear();

    }

    @Override
    public Stream<Contact> stream() {
        return arrayList.stream();

    }

    //needed for save
    public ArrayList<Contact> getArrayList() {
        return arrayList;
    }
}