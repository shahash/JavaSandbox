public class LinkedList {
    private LinkedListElement _head;
    private LinkedListElement _tail;
    private int _size;

    private Vector _values = new Vector();

    public void addLast(Object element) {
        LinkedListElement item = new LinkedListElement(element);

        if(this._size==0){
            this._tail = item;
            this._head = item;
        }else{
            item.setPrev(this._tail);
            this._tail.setNext(item);
            this._tail = item;
        }

        this._values.addElement(item);

        this._size++;

    } //adds an element at the end of this List

    public void addFirst(Object element) {
        LinkedListElement item = new LinkedListElement(element);

        if(this._size==0){
            this._tail = item;
            this._head = item;
        }else{
            item.setNext(this._head);
            this._head.setPrev(item);
            this._head = item;
        }

        this._values.addElement(item);

        this._size++;
    } //adds an element at the beginning of this List

    public Object getFirst() {
        if(this._size==0){
            return null;
        }

        return this._head;
    } //returns first Element of the List if the List is not empty, otherwise returns null

    public Object getLast() {
        if(this._size==0){
            return null;
        }

        return this._tail;
    } //returns last Element of the List if the List is not empty, otherwise returns null

    public boolean removeAt(int index) {
        if(index < 0 || index >= this._size){
            return false;
        }

        this._size--;

        if(this._size==0){
            this._head = null;
            this._tail = null;
        }else{

            LinkedListElement item = (LinkedListElement) this.getElement(index);
            if(item.getPrev()!=null){
                item.getPrev().setNext(item.getNext());
            }

            if(item.getNext()!=null){
                item.getNext().setPrev(item.getPrev());
            }

        }

        return this._values.removeAt(index);
    } //if index is within arrayboundary, removes element at specified index

    public boolean insertAt(int index, Object element) {

        if(index<0 || index>=this._size){
            return false;
        }

        LinkedListElement item = new LinkedListElement(element);

        item.setNext(((LinkedListElement) this.getElement(index)).getNext());
        item.setPrev(((LinkedListElement) this.getElement(index)).getPrev());

        this._size++;

        return this._values.insertAt(index, item);
    } //if index is within array boundary, inserts an element at specified index and returns true, otherwise returns false

    public Object getElement(int index){
         Object item = this._values.getElement(index);

        if(item==null){
            return null;
        }else{
           return (LinkedListElement) item;
        }
    } //if index is within array boundary, returns Element at specified index, otherwise returns null

    public boolean setElement(int index, Object element){
        LinkedListElement item = new LinkedListElement(element);

        item.setNext(((LinkedListElement) this.getElement(index)).getNext());
        item.setPrev(((LinkedListElement) this.getElement(index)).getPrev());

        return this._values.setElement(index, item);
    } //if index is within array boundary, places specified Element at¬specified position and returns true, otherwise returns false

    public Vector toVector() {
        return this._values;
    } //returns a Vector containing elements of this List


    public void removeFirst(){
        this._values.removeFirst();
    }


    public void removeLast(){
        this._values.removeLast();
    }


    public int getSize(){
        return this._size;
    }
}
