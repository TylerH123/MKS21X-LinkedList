public class time{

  public static void main(String[] args){
    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for (int x = 0; x < 5; x++) {
      a.add(x);
      b.add(x+5);
    }
    System.out.println("linkedlist a should be [0, 1, 2, 3, 4]: " + a);
    System.out.println("linkedlist b should be [5, 6, 7, 8, 9]: " + b);
    a.extend(b);
    System.out.println(a + " \n" + b);
    System.out.println(a.toStringBack() + " \n" + b.nodesToString());
  }
}
