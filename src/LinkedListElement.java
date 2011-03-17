/**
 * Created by IntelliJ IDEA.
 * User: student5
 * Date: 16.03.11
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */

public class LinkedListElement{
    private Object _object;
    private LinkedListElement _next;
    private LinkedListElement _prev;

    public LinkedListElement(Object object){
        this._object = object;
    }

    public Object getObject(){
        return this._object;
    }

    public LinkedListElement getNext(){
        return this._next;
    }

    public LinkedListElement getPrev(){
        return this._prev;
    }

    public void setNext(LinkedListElement item){
        this._next = item;
    }

    public void setPrev(LinkedListElement item){
        this._prev = item;
    }

//    public Object clone(){
//        try{
//          return super.clone();
//        }catch( CloneNotSupportedException e ){
//          return null;
//        }
//    }

}
