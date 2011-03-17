/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 16.03.11
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
public class Vector {
    private Object[] _values;
    private int _position;
    private int _realsize;
    private int _capacity;

    public Vector() {
        this(10);
    }

    public Vector(int initialCapacity) {
        this._capacity = initialCapacity;
        this._values = new Object[initialCapacity];
    }
    public int getCurrentSize() {
        return this._realsize;
    }

    private void enlarge(){
        this.enlarge(this._capacity);
    }

    private void enlarge(int count){
        // System.out.println("Enalarging vector");
        Object[] buffer = this._values;
        this._capacity = this._capacity+count;   //Enlarge array
        this._values = new Object[this._capacity];
        System.arraycopy(buffer, 0, this._values, 0, buffer.length);
    }

    public void addElement(Object element) {
        if(this._position > this._capacity){
            this.enlarge();
        }

        this._values[this._position] = element;
        this._position++;

        this._realsize++;
    }
    public boolean removeAt(int index) {
        if(index>=0 && index<this._capacity && this._values[index]!=null){
            this._values[index] = null;
            this._realsize--;

            return true;
        }else{
            return false;
        }
    }

    public void removeLast(){
        if(this._realsize>0){
            this._values[this._position] = null;
        }
    }

    public void removeFirst(){
        if(this._realsize>0){
            this._values[0] = null;
        }
    }

    public boolean insertAt(int index, Object element) {
        if(index >= 0 && index < this._capacity){

            this.enlarge(1);
            System.arraycopy(this._values, index, this._values, index + 1, this._capacity - index-1);
            this._values[index] = element;

            return true;
        }else{
            return false;
        }
    }
    public Object getElement(int index){
        if(index>=0 && index < this._capacity){
            return this._values[index];
        }

        return null;
    }

    public boolean setElement(int index, Object element){
        if(index<0){
            return false;
        }

        if(this._capacity-1 < index){
            this.enlarge();
        }

        if(index > this._position){
            this._position = index;
        }

        this._values[index] = element;
        return true;
    }

    public void dump(){
        System.out.println("\nVector listing:");
        for(int i=0;i<this._capacity;i++){
            System.out.println(" "+i+": "+this.getElement(i));
        }
    }

    public Object[] getValues(){
        return this._values;
    }

}

