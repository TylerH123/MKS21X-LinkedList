public class MyLinkedList{

  private class Node{

    private int data;
    private Node next, prev;

    //constructor
    //sset current node to the num
    private Node(int num){
      data = num;
    }
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

  
  public String toString(){
    return "";
  }

}
