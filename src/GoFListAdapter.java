import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Stream;


public class GoFListAdapter implements GoFList, Serializable {

    private ArrayList<Entity> arrayList;

    public GoFListAdapter() {
        arrayList = new ArrayList<Entity>();
    }

    @Override
    public int count() {
        return arrayList.size();
    }

    @Override
    public Entity get(int index) {
        return arrayList.get(index);
    }

    @Override
    public Entity first() {
        return arrayList.get(0);
    }

    @Override
    public Entity last() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public boolean include(Entity contact) {
        return arrayList.contains(contact);
    }

    @Override
    public void append(Entity contact) {
        arrayList.add(contact);

    }

    @Override
    public void prepend(Entity contact) {
        arrayList.add(0, contact);

    }

    @Override
    public void delete(Entity obj) {
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
    public Stream<Entity> stream() {
        return arrayList.stream();

    }

}