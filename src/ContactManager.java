public class ContactManager {

    private DataManager dataManager = DataManager.getInstance();
    EntityFactory factory = new ContactFactory();

    public void addContact(String inContact) {
        GoFList contactList = dataManager.getContactList();
        String[] lineArr = inContact.split(" ");
        Entity contact = factory.createEntity(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4]);
        contact.setId(dataManager.getNextId());
        contactList.append(contact);
    }


    public void deleteContact(int id) {
        Entity c = dataManager.getContactList().stream().filter(contact -> contact.getId() == id).findFirst().orElse(null);
        dataManager.getContactList().delete(c);
    }
}