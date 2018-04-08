public class SquareBracketsDecorator extends EntityDecorator {

    public SquareBracketsDecorator(Entity entity) {
        super(entity);
    }

    @Override
    public Entity getDecoratedEntity() {
        decoratedEntity.setFirstName("[" + decoratedEntity.getFirstName() + "]");
        decoratedEntity.setLastName("[" + decoratedEntity.getLastName() + "]");
        decoratedEntity.setAddress("[" + decoratedEntity.getAddress() + "]");
        decoratedEntity.setPhone("[" + decoratedEntity.getPhone() + "]");
        decoratedEntity.setEmail("[" + decoratedEntity.getEmail() + "]");
        return decoratedEntity;
    }

    @Override
    public void accept(EntityVisitor entityVisitor) {
        //empty code
    }
}
