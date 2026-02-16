public class BaseObject {
    String id;
    String name;
    String description;
    String dateCreated;
    String dateUpdated;

    @Override
    public String toString() {
        return "BaseObject [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated="
                + dateCreated + ", dateUpdated=" + dateUpdated + "]";
    }
}
