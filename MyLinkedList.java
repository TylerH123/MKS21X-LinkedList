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
  //default length = 0
  //empty list
  public MyLinkedList(){
  }
  //return size of list
  public int size(){
    return length;
  }
  //make a new node that contains the value
  //then set the end to the new node
  //if the first element is null, then set the start to value
  public boolean add(int value){
    if (start == null){
      start = new Node();
      start.setData(value);
      length++;
      return true;
    }
    Node newNode = new Node();
    newNode.setData(value);
    end = newNode;
    return true;
  }

  public int get(int index){

    return 1;
  }
  public String toString(){
    String out = "[";
    Node current = start;
    for (int i = 0; i < length; i++){
      out += current.toString();
      current.next();
    }
    return out += "]";
  }

}
