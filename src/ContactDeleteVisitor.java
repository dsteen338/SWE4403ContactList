public class ContactDeleteVisitor implements EntityVisitor {
    private DataManager dataManager = DataManager.getInstance();


    @Override
    public void visit(Contact contact) {
        dataManager.getContactList().delete(contact);
    }
}
