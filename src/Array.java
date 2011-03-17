/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 16.03.11
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public class Array {
    private Object[] _values;
    private int _size;

    public Array(int size) {
        this._size = size;
         this._values = new Object[size];
    }

    public int getSize() {
        return this._size;
    }

    public Object getElement(int index){
        return _values[index];
    }

    public boolean setElement(int index, Object element){
        if(index >= 0 && index < this._size){
            this._values[index] = element;
            return true;
        } else {
            return false;
        }
    }

}
