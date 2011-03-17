/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 17.03.11
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class AVLTree {
    private TreeObject root;

    public AVLTree(Object rootValue){
        this.root = new TreeObject(rootValue);
    }

    public void put(Object element) {
        this.root.insert(element);
    } //puts an element into the Tree, maintaing order and height conditions
    public Vector toVector() {
        Vector v = new Vector();
        this.root.addToVector(v);

        return v;
    } //returns a Vector containing elements of this Tree in their search order

}
