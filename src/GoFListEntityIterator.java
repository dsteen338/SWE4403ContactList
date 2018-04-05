public class GoFListEntityIterator {
    GoFList list;
    int index;

    public GoFListEntityIterator(GoFList list) {
        index = 0;
        this.list = list;
    }

    void first(){index = 0;}
    void next(){index++;}
    boolean isDone() {
        return list.count() <= index;
    }

    Entity currentItem() {
        return list.get(index);
    }

}
