public class ContactManager {

    private DataManager dataManager = DataManager.getInstance();
    EntityFactory factory = new ContactFactory();

    public void addContact(String inContact) {
        GoFList contactList = dataManager.getContactList();
        String[] lineArr = inContact.split(" ");
        Entity contact = factory.createEntity(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4]);
        contact.setId(dataManager.getNextId());
        contact.accept(new ContactAddVisitor());

    }


    public void deleteContact(int id) {

        GoFListEntityIterator iter = new GoFListEntityIterator(dataManager.getContactList());

        for(iter.first(); !iter.isDone(); iter.next()) {
            Entity currentContact = iter.currentItem();

            if (currentContact.getId() == id) {
                currentContact.accept(new ContactDeleteVisitor());
            }
        }

    }
}