import javax.xml.crypto.Data;

public class DeleteCommand extends CListCommand  {
    private GoFList contactList;
    private DataManagerProxy dataManager = DataManagerProxy.getInstance();
    private SystemFacade systemFacade = SystemFacade.getInstance();
    private int id;
    private CListMomento cListMomento;


    public DeleteCommand(int inId) {
        this.contactList = dataManager.getContactList();
        this.id = inId;
    }

    public DeleteCommand() {
        super();
    }

    @Override
    void execute() {
        this.cListMomento = systemFacade.createMomento();
        systemFacade.deleteContact(id);

    }

    @Override
    void unExecute() {
        systemFacade.setMomento(cListMomento);

    }

    @Override
    CListCommand cloneMe() {
        return new DeleteCommand();
    }
}
