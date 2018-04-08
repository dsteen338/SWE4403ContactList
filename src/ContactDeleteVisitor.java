public class ContactDeleteVisitor implements EntityVisitor {
    private DataManagerProxy dataManager = DataManagerProxy.getInstance();


    @Override
    public void visit(Contact contact) {
        dataManager.getContactList().delete(contact);
    }
}
