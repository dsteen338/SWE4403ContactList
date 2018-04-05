public class InsertAtFrontStrategy implements InsertionStrategy {
    private DataManager dataManager = DataManager.getInstance();

    @Override
    public void insert(Entity contact) {
        dataManager.getContactList().prepend(contact);
    }
}
