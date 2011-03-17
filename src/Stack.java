/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 16.03.11
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */

public class Stack {
    private LinkedList list = new LinkedList();

    public void push(Object element) {
        this.list.addLast(element);
    } //adds an element at the top¬

    public Object pop() {
        if(this.list.getSize()==0){
           return null;
        }

       //LinkedListElement item = (LinkedListElement) ((LinkedListElement) this.list.getLast()).clone();

        this.list.removeLast();
        return ((LinkedListElement) this.list.getLast()).getObject();
    } //if Stack is not empty, returns the topmost element of the Stack and removes it from the Stack, otherwise returns null

    public Object peek() {
       if(this.list.getSize()==0){
           return null;
       }

       return ((LinkedListElement)this.list.getLast()).getObject();
    } //if Stack is not empty, returns the topmost element of the Stack, otherwise returns null

}
