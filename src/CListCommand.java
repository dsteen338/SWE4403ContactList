public abstract class CListCommand {
    abstract void execute();
    abstract void unExecute();

    abstract CListCommand cloneMe();

}
