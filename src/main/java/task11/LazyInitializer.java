package task11;

public class LazyInitializer implements Entity {

    private final int id;
    private VeryHeavyEntity entity;

    public LazyInitializer(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String find(String query) {
        if (entity == null) {
            entity = VeryHeavyEntity.load(id);
        }
        return entity.find(query);
    }
}
