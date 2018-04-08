public abstract class EntityDecorator extends Entity {
    protected Entity decoratedEntity;

    public EntityDecorator(Entity entity) {
        this.decoratedEntity = entity;
    }

    public Entity getDecoratedEntity() {
        return decoratedEntity;
    }
}
