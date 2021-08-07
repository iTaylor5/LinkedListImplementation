package main;

/*
* A list implementation  of the interface  main.MyList.
* Provides a single LinkedList.
*
* version 1.0
* Author iTaylor5
*
*/

//import main.MyList;

public class DefaultMyList implements MyList {

    private Node head;

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     */
    @Override
    public void add(Object e) {
        Node newNode = new Node(e);

        if(head == null)
            head = newNode;
        else{
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        head = null;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain
     * the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
    @Override
    public boolean remove(Object o) {
        if(head != null){
            if(head.data == o){
                head = head.next;
                return true;
            }
        }

        Node runner = head;

        while(runner.next != null){
            Node prevNode = runner;
            runner = runner.next;

            if(runner.data == o){
                prevNode.next = runner.next;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     */
    @Override
    public Object[] toArray() {
        int index = 0;
        if(head == null){
            return new Object[0];
        }

        Object[] array = new Object[size()];
        Node runner = head;
        array[index] = runner.data;
        index++;

        while(runner.next != null){
            runner = runner.next;
            array[index] = runner.data;
            index++;
        }

        return array;
    }

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than Integer.MAX_VALUE elements, returns
     * Integer.MAX_VALUE.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        int size = 0;

        if (head == null){
            return size;
        }else {
            size++;
        }

        Node runner = head;

        while(runner.next != null){
            runner = runner.next;
            size++;
        }
        return size;
    }
    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element e such that.
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
    @Override
    public boolean contains(Object o) {
        Node node = new Node(o);

        if(head == null){
            return false;
        }
        if(head.data == node.data){
            return true;
        }
        System.out.println("beginning loop");
        Node runner = head;

        while (runner.next != null){
            runner = runner.next;
            if(runner.data == node.data){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c object that implements main.MyList to be checked for containment in this list
     * @return true if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements
     */
    @Override
    public boolean containsAll(MyList c) {
        Object [] list = c.toArray();

        for(Object obj : list){
            if(!this.contains(obj)){
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a string of the list {1, 2, ...,n}
     * @return main.DefaultMyList{1, 2, ...,n}
     */
    @Override
    public String toString() {
        if(head == null){
            return "main.DefaultMyList{" + " }";
        }

        Node runner = head;
        StringBuilder sb = new StringBuilder();

        sb.append("main.DefaultMyList{"+ "head=");
        while(runner.next != null){
            sb.append(runner.data).append(", ");
            runner = runner.next;
        }
        sb.append("tail=").append(runner.data);
        sb.append('}');

        return sb.toString();
    }

    /**
     * Node class to specify a node.
     */
    private static class Node {
        Object data;
        Node next;

        public Node(Object e){
            data = e;
            next = null;
        }
    }
}
