/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 17.03.11
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class TreeObject {
    static int keySequence = 0;

    private TreeObject left;
    private TreeObject right;
    private Object value;
    private int key;

    public TreeObject(Object value){
        this.value = value;
        this.key = keySequence++;
    }

    public Object find(int key){
        if(key==this.key){
            return this.value;
        }else if(key>this.key){
            return this.right.find(key);
        }else{
            return this.left.find(key);
        }
    }

    public void insert(Object object){
        if(this.left == null){
            this.left = new TreeObject(object);
        }else if(this.right == null){
            this.right = new TreeObject(object);
        }else{
            if(this.getLeftDepth() >= this.getRightDepth()){
                this.right.insert(object);
            }else{
                this.left.insert(object);
            }
        }
    }

    private int treeDepth(TreeObject tree){
        int depth;
        if(tree != null){
          depth = 1 + Math.max(this.treeDepth(this.left),this.treeDepth(this.right));
        }else{
          depth = 0;
        }

        return depth;
    }

    public void addToVector(Vector vector){
        vector.addElement(this.value);
        if(this.left!=null){
            this.left.addToVector(vector);
        }

        if(this.right!=null){
            this.right.addToVector(vector);
        }
    }

    public int getLeftDepth(){
       return this.treeDepth(this.left);
    }

    public int getRightDepth(){
        return this.treeDepth(this.right);
    }

}
