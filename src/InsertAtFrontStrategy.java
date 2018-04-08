public class InsertAtFrontStrategy implements InsertionStrategy {
    private DataManagerProxy dataManager = DataManagerProxy.getInstance();

    @Override
    public void insert(Entity contact) {
        dataManager.getContactList().prepend(contact);
    }
}
