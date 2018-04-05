public class InsertionContext {

    private InsertionStrategy strategy;

    public InsertionContext(InsertionStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Entity contact){
         strategy.insert(contact);
    }
}
