import java.io.Serializable;

public class Contact extends Entity implements Serializable, Comparable<Contact> {

    public Contact(String firstName, String lastName, String address, String phone, String email) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setAddress(address);
        super.setPhone(phone);
        super.setEmail(email);
    }

    @Override
    public  void accept(EntityVisitor entityVisitor) {
        entityVisitor.visit(this);
    }

    @Override
    public int compareTo(Contact o) {
        return super.getId() - o.getId();
    }
    
     public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getAddress() + " " + this.getPhone() + " " + this.getEmail() + " " + this.getId();
    }


}