public class ContactAddVisitor implements EntityVisitor {
    private InsertionContext context;

    public ContactAddVisitor() {
        //Default to prepend, because new contacts will presumably be read more often
        this.context = new InsertionContext(new InsertAtFrontStrategy());
    }

    @Override
    public void visit(Contact contact) {
        context.executeStrategy(contact);
    }
}
