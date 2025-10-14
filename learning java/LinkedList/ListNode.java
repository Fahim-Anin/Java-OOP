
public class Listnode {
    // These fields are public for easy access from other classes
    public int data;
    public Listnode link;

    // Constructor to create a new node
    public Listnode(int data) {
        this.data = data;
        this.link = null;
    }
}