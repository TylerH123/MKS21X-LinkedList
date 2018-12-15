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
  //loops through the array until at the desired index
  //then sets the next() of the previous node to the desired value
  //also sets the prev() of the forward node to desired value
  public int set(int index, int value){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    int idx = 0;
    Node current = start;
    Node tgt = new Node();
    tgt.setData(value);
    while(current != null){
      if (idx == index-1){
        current.setNext(tgt);
      }
      if (idx == index + 1){
        current.setPrev(tgt);
      }
      idx++;
      current = current.next();
    }
    return 1;
  }
  //loops through the linked list
  //if the data of the current node is equal to the value then return true
  public boolean contains(int value){
    Node curr = start;
    while (curr != null){
      if(curr.getData() == value){
        return true;
      }
      curr = curr.next();
    }
    return false;
  }
  //if the current node is at the desired index, return that node, otherwise go next
  public int get(int index){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
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
  //loop through the linked list
  //if the data at current is equal to value return the index
  public int indexOf(int value){
    int idx = 0;
    Node curr = start;
    while (curr != null){
      if(curr.getData() == value){
        return idx;
      }
      curr = curr.next();
      idx++;
    }
    return -1;
  }
  //if length is 0 or at the end then add the value
  //if index is 0 insert at the beginning and set the next to the old start. set the prev to the new value
  //else at the deisred index set the previous node's next to the node with the desired value
  //also set forward node's prev to the node with the desired value
  public void add(int index, int value){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    Node current = new Node();
    current.setData(value);
    if (length == 0 || index == length - 1){
      add(value);
    }
    if (index == 0){
      Node tgt = start;
      start = current;
      start.setNext(tgt);
      tgt.setPrev(start);
      length++;
    }
    else{
      Node tgt = start;
      int idx = 0;
      while (tgt != null){
        if (idx == index -1){
          tgt.setNext(current);
        }
        if (idx == index + 1){
          tgt.setPrev(current);
          length++;
        }
        tgt = tgt.next();
        idx++;
      }
    }
  }
  //get the nth node of the linked MyLinkedList
  //similar to method get
  private Node getNthNode(int idx){
    if (idx >= length || idx < 0) throw new IndexOutOfBoundsException();
    Node current = start;
    int index = 0;
    while (current != null){
      if (index == idx){
        return current;
      }
      current = current.next();
      index++;
    }
  }

  public int remove(int index){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    idx = 0;
    Node current = start;
    while(current != null){
      if (idx == index - 1){
        current.setNext(current.get(idx+1));
      }
      current = current.next();
    }
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
