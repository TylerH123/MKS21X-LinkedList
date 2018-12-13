public class MyLinkedList{

  private class Node{

    private int data;
    private Node next, prev;

    //constructor
    //sset current node to the num
    private Node(int num){
      data = num;
    }
    private Node next(){
      return next;
    }
    private Node prev(){
      return prev;
    }
    private void setNext(Node other){
      next = other;
    }
    private void setPrev(Node other){
      prev = other;
    }
    private int getData(){
      return data;
    }
    private int setData(int i){
      data = i;
    }
    private String toString(){
      return data + "";
    }
  }

  public String toString(){
    return "";
  }

}
