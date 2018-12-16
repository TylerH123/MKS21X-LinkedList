public class Node{

  private int data;
  private Node next, prev;

  //returns the next node
  public Node next(){
    return next;
  }
  //return the previous node
  public Node prev(){
    return prev;
  }
  //sets next node to param other
  public void setNext(Node other){
    next = other;
  }
  //sets prev node to param other
  public void setPrev(Node other){
    prev = other;
  }
  //return data
  public int getData(){
    return data;
  }
  //set data to i
  public int setData(int i){
    return data = i;
  }
  //return string representation of node
  public String toString(){
    return data + "";
  }
}
