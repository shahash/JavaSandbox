/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 17.03.11
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class HashTableItem {
    private Object _key;
    private Object _value;

    public HashTableItem(Object key, Object value){
        this._key = key;
        this._value = value;
    }

    public Object getKey(){
        return this._key;
    }

    public Object getValue(){
        return this._value;
    }

}
