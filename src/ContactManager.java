public class ContactManager {

    private DataManager dataManager = DataManager.getInstance();
    EntityFactory factory = new ContactFactory();

    public void addContact(String firstName, String lastName, String address, String phone, String email) {
        Entity contact = factory.createEntity(firstName, lastName, address, phone, email);
        contact.setId(dataManager.getNextId());
        contact.accept(new ContactAddVisitor());

    }


    public boolean deleteContact(int id) {
        GoFListEntityIterator iter = new GoFListEntityIterator(dataManager.getContactList());

        for(iter.first(); !iter.isDone(); iter.next()) {
            Entity currentContact = iter.currentItem();

            if (currentContact.getId() == id) {
                currentContact.accept(new ContactDeleteVisitor());
                return true;
            }
        }
        return false;
    }
}