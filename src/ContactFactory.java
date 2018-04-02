public class ContactFactory extends EntityFactory {
    @Override
    public Entity createEntity(String firstName, String lastName, String address, String phone, String email) {
        return new Contact(firstName, lastName, address, phone, email);
    }
}
