public class Contact extends Entity {

    public Contact(String firstName, String lastName, String address, String phone, String email) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAddress(address);
        super.setPhone(phone);
        super.setEmail(email);
    }

}