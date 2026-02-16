public class NodeInstance extends BaseNode {
    @Override
    Referenceable creatReferenceable() {
        return new Instance("id", "name", "description");
    }
}
