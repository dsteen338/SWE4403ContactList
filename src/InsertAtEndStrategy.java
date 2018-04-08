public class InsertAtEndStrategy implements InsertionStrategy {
    private DataManagerProxy dataManager = DataManagerProxy.getInstance();


    @Override
    public void insert(Entity contact) {
        dataManager.getContactList().append(contact);
    }
}
