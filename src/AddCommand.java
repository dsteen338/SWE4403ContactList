
public class AddCommand extends CListCommand  {
   private GoFList contactList;
   private DataManagerProxy dataManager = DataManagerProxy.getInstance();
   private SystemFacade systemFacade = SystemFacade.getInstance();
   private CListMomento cListMomento;
   private String firstName;
   private String lastName;
   private String address;
   private String phone;
   private String email;


   AddCommand(String inFirstName, String inLastName, String inAddress, String inPhone, String inEmail) {
       this.contactList = dataManager.getContactList();
       this.firstName = inFirstName;
       this.lastName = inLastName;
       this.address = inAddress;
       this.phone = inPhone;
       this.email = inEmail;
   }

    public AddCommand() {
       super();
    }

    @Override
    void execute() {
       this.cListMomento = systemFacade.createMomento();
       systemFacade.addContact(firstName, lastName, address, phone, email);
    }

    @Override
    void unExecute() {
        systemFacade.setMomento(cListMomento);
    }

    @Override
    CListCommand cloneMe() {
        return new AddCommand();
    }
}
