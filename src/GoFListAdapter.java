import java.io.Serializable;
import java.util.ArrayList;


public class GoFListAdapter implements GoFList, Serializable {


    public ArrayList<Entity> arrayList;
    public GoFListAdapter() {
        this.arrayList = new ArrayList<Entity>();
    }

    public GoFListAdapter(ArrayList<Entity> inList) {
        arrayList = inList;
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

}