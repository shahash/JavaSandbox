/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 17.03.11
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */
public class HashTable {
    private Vector items = new Vector();

    public int indexOf(Object key){
        Object[] items = this.items.getValues();

        for(int i=0;i<items.length;i++){
            if(items[i]!=null){
                if(key.equals(((HashTableItem) items[i]).getKey())){
                    return i;
                }
            }
        }

        return -1;
    }

    public Object put(Object key, Object value) {
        int index = this.indexOf(key);

        if(index > 0) {
            HashTableItem prevObject = (HashTableItem) this.items.getElement(index);
            this.items.setElement(index, new HashTableItem(key, value));

            return prevObject.getValue();
        } else {
            this.items.addElement(new HashTableItem(key, value));
            return null;
        }
    } //associates a specified value with specified key, if the key was previously associated with another value, returns it, otherwise returns null


    public Object get(Object key) {
        int index = this.indexOf(key);
        if(index>0){
            return ((HashTableItem)this.items.getElement(index)).getValue();
        }

        return null;
     } //gets a value, associated with specified key, returns null if key is not associated with any value

    public Object remove(Object key) {
        int index = this.indexOf(key);
        if(index>0){
            this.items.removeAt(index);
            int prevIndex = index-1;
            Object[] arrayValues = this.items.getValues();
            while(prevIndex > 0){
                if(arrayValues[prevIndex]!=null){
                    return ((HashTableItem)arrayValues[prevIndex]).getValue();
                }
                prevIndex--;
            }

        }

        return null;
    } //removes association of the specified key, and returns previously associated value or null if key was not associated with any value
}

