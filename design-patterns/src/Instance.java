public class Instance extends BaseObject implements Referenceable {
    public Instance(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean referenceTo(Referenceable other) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void applyAction() {
        // TODO Auto-generated method stub

    }
}
