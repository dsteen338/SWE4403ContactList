import java.util.ArrayList;
import java.util.stream.Stream;

public interface GoFList {
    int count();  //return the current number of elements in the list
    Object get(int index);  //return the object at the index in the list
    Object first();  //return the first object in the list
    Object last();   //return the last object in the list
    boolean include(Entity obj);  //return true is the object in the list
    void append(Entity obj); //append the object to the end of the list
    void prepend(Entity obj);  //insert the object to the front of the list
    void delete(Entity obj);  //remove the object from the list
    void deleteLast();  //remove the last element of the list
    void deleteFirst();  //remove the first element of the list
    void deleteAll();  //remove all elements of the list
    Stream<Entity> stream(); //needed to stream objects for filter
    ArrayList<Entity> getArrayList(); //needed for json save
}