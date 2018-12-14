public class MyLinkedList{

  private class Node{

    private int data;
    private Node next, prev;

    //returns the next node
    private Node next(){
      return next;
    }
    //return the previous node
    private Node prev(){
      return prev;
    }
    //sets next node to param other
    private void setNext(Node other){
      next = other;
    }
    //sets prev node to param other
    private void setPrev(Node other){
      prev = other;
    }
    //return data
    private int getData(){
      return data;
    }
    //set data to i
    private int setData(int i){
      return data = i;
    }
    //return string representation of node
    public String toString(){
      return data + "";
    }
  }

  private Node start,end;
  private int length;

  //constructor
  //empty list
  public MyLinkedList(){
    start = new Node();
    end = new Node();
  }
  //return size of list
  public int size(){
    return length;
  }
  //make a new node that contains the value
  //then set the end to the new node
  //if the first element is null, then set the start to value
  public boolean add(int value){
    Node newNode = new Node();
    newNode.setData(value);
    if (length == 0){
      start = newNode;
      end = newNode;
      length++;
      return true;
    }
    end.setNext(newNode);
    newNode.setPrev(end);
    end = newNode;
    return true;
  }
  public int set(int index, int value){
    if (index >= length || index < 0) throw new ArrayIndexOutOfBoundsException();
    return 1;
  }
  //if the current node is at the desired index, return that node, otherwise go next
  private int get(int index){
    if (index >= length || index < 0) throw new ArrayIndexOutOfBoundsException();
    Node current = start;
    int idx = 0;
    while(current != null){
      if (idx == index){
        return current.getData();
      }
      current = current.next();
      idx++;
    }
    return 0;
  }
  //string representation of the linked list
  public String toString(){
    String out = "[";
    Node current = start;
    for (int i = 0; i < length; i++){
      out += current.toString() + ", ";
      current.next();
    }
    return out.substring(0, length - 2) + "]";
  }

}
