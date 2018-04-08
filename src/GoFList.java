import java.util.ArrayList;

public abstract class GoFList {
    abstract int count();  //return the current number of elements in the list
    abstract Entity get(int index);  //return the object at the index in the list
    abstract Entity first();  //return the first object in the list
    abstract Entity last();   //return the last object in the list
    abstract boolean include(Entity obj);  //return true is the object in the list
    abstract void append(Entity obj); //append the object to the end of the list
    abstract void prepend(Entity obj);  //insert the object to the front of the list
    abstract void delete(Entity obj);  //remove the object from the list
    abstract void deleteLast();  //remove the last element of the list
    abstract void deleteFirst();  //remove the first element of the list
    abstract void deleteAll();  //remove all elements of the list
    ArrayList<Entity> arrayList;



}