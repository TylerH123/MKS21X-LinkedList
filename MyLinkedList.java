public class MyLinkedList{

  private Node start,end;
  private int length;

  //constructor
  //empty list
  public MyLinkedList(){
    start = new Node();
    end = new Node();
  }
  //constructor takes array as param
  public MyLinkedList(int[] ary){
    for (int i = 0; i < ary.length; i++){
      add(ary[i]);
    }
    length = ary.length;
  }
  //return size of list
  public int size(){
    return length;
  }
  //make a new node that contains the value
  //then set the end to the new node
  //if the first element is null, then set the start to value
  public boolean add(Integer value){
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
    length++;
    return true;
  }
  //use getNthNode to get the node at the desired index
  //then set the data at the node to the new value
  public int set(int index, Integer value){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    int num = getNthNode(index).getData();
    getNthNode(index).setData(value);
    return num;
  }
  //loops through the linked list
  //if the data of the current node is equal to the value then return true
  public boolean contains(Integer value){
    Node current = start;
    while (current != null){
      if(current.getData() == value){
        return true;
      }
      current = current.next();
    }
    return false;
  }
  //use getNthNode to get the node at the index then return data
  public int get(int index){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    return getNthNode(index).getData();
  }
  //loop through the linked list
  //if the data at current is equal to value return the index
  public int indexOf(Integer value){
    int idx = 0;
    Node current = start;
    while (current != null){
      if(current.getData() == value){
        return idx;
      }
      current = current.next();
      idx++;
    }
    return -1;
  }
  //if length is 0 or at the end then add the value
  //if index is 0 insert at the beginning and set the next to the old start. set the prev to the new value
  //else at the deisred index set the previous node's next to the node with the desired value
  //also set forward node's prev to the node with the desired value
  public void add(int index, Integer value){
    if (index > length || index < 0) throw new IndexOutOfBoundsException();
    Node current = new Node();
    current.setData(value);
    if (length == 0 || index == length){
      add(value);
      length--;
    }
    if (index == 0){
      Node tgt = start;
      start = current;
      start.setNext(tgt);
      tgt.setPrev(start);
    }
    if (index > 0 && index < length){
      Node prevNode = getNthNode(index-1);
      Node oldNode = getNthNode(index);
      prevNode.setNext(current);
      oldNode.setPrev(current);
      current.setNext(oldNode);
      current.setPrev(prevNode);
    }
    length++;
  }
  //get the nth node of the linked MyLinkedList
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
    return current;
  }
  //if the index is at the beginning or the end, then set the start or end to the next/prev Node
  //else getNthNode of the prev node and next node and set the next and prev
  public int remove(int index){
    if (index >= length || index < 0) throw new IndexOutOfBoundsException();
    int num = getNthNode(index).getData();
    if (index == length - 1){
      end = getNthNode(index - 1);
      getNthNode(index-1).setNext(null);
      length--;
      return num;
    }
    if (index == 0){
      start = getNthNode(index + 1);
      getNthNode(index+1).setPrev(null);
      length--;
      return num;
    }
    else{
      Node prevNode = getNthNode(index-1);
      Node nextNode = getNthNode(index+1);
      prevNode.setNext(nextNode);
      nextNode.setPrev(prevNode);
      length--;
    }
    return num;
  }
  //if the list contains the value the remove it
  //else return false
  public boolean remove(Integer value){
    if (contains(value)){
      remove(indexOf(value));
      return true;
    }
    return false;
  }
  //string representation of the linked list
  public String toString(){
    String out = "[";
    Node current = start;
    for (int i = 0; i < length; i++){
      if (i == length - 1){
        out += current.getData();
      }
      else{
        out += current.getData() + ", ";
        current = current.next();
      }
    }
    return out + "]";
  }
  public String toStringBack(){
    String out = "[";
    Node current = end;
    for (int i = 0; i < length; i++){
      if (i == length - 1){
        out += current.getData();
      }
      else{
        out += current.getData() + ", ";
        current = current.prev();
      }
    }
    return out + "]";
  }
  public String nodesToString(){
    String out = "[";
    Node current = start;
    for (int i = 0; i < length; i++){
      if (i == length - 1){
        out += "(" + current.prev() + ")" + current.getData() + "(" + current.next() + ")";
      }
      else{
        out += "(" + current.prev() + ")" + current.getData() + "(" + current.next() + ")" + ", ";
        current = current.next();
      }
    }
    return out + "]";
  }
  //concatenate two lists
  //set the start, end, length of the other list to null/0 to erase it
  //set the prev of the first node of other to the last node of the first list
  //set the next of the last node of the first list to the first node of other
  //set end to the last node of other
  public void extend(MyLinkedList other){
    if (length == 0){
      start = other.start;
      end = other.end;
    }
    else if (other.length > 0){
      other.getNthNode(0).setPrev(getNthNode(length - 1));
      getNthNode(length - 1).setNext(other.getNthNode(0));
      end = other.getNthNode(other.length - 1);
    }
    length += other.length;
    other.length = 0;
  }
}
