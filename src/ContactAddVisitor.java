public class ContactAddVisitor implements EntityVisitor {
    private DataManager dataManager = DataManager.getInstance();

    @Override
    public void visit(Contact contact) {
        dataManager.getContactList().append(contact);
    }
}
