/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 16.03.11
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */

public class Queue {

    private LinkedList list = new LinkedList();

    public void put(Object element) {
        this.list.addLast(element);
    } //puts an element at the end of this Queue
    public Object get() {
       if(this.list.getSize()==0){
           return null;
       }

       //LinkedListElement item = (LinkedListElement) ((LinkedListElement) this.list.getFirst()).clone();
       this.list.removeFirst();

       return ((LinkedListElement) this.list.getFirst()).getObject();
    } //if the Queue is not empty, gets the first element from this Queue and removes it, otherwise returns null
    public Object peek() {
       return ((LinkedListElement)this.list.getFirst()).getObject();
    } //if the Queue is not empty, gets the first element from this Queue, otherwise returns null
}
