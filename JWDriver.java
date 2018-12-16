public class JWDriver {
    public static void main(String[] forntite) {
        int[] AliA = {0,1,2,3,4,5,6,7,8,9};
        MyLinkedList bean = new MyLinkedList(AliA);
        System.out.println("Created new MyLinkedList: " + bean.toString());
        System.out.println("Size: " + bean.size());
        System.out.println("Added element 10: " + bean.add(10));
        System.out.println(bean.toString());
        System.out.println("Added element 12: " + bean.add(12));
        System.out.println(bean.toString());
        System.out.println("Element changed, old element: " + bean.set(11, 11));
        System.out.println(bean.toString());
        System.out.println("Contains element 7? " + bean.contains(7));
        System.out.println(bean.toString());
		System.out.println("Index of 6: " + bean.indexOf(6));
		bean.add(2,12);
		System.out.println("Added 12 to index 2");
		System.out.println(bean.toString());
		System.out.println("Element at index 2 removed, old value: " + bean.remove(2));
		System.out.println(bean.toString());

		int[] fortnight = {};
		MyLinkedList jeff = new MyLinkedList(fortnight);
        System.out.println("Created new MyLinkedList: " + jeff.toString());
		System.out.println("Size: " + jeff.size());
		System.out.println("Added element 10: " + jeff.add(10));
        System.out.println(jeff.toString());
		System.out.println("Contains element 7? " + jeff.contains(7));
		System.out.println(jeff.toString());
		System.out.println("Index of 6 (this should be -1): " + jeff.indexOf(6));

		//Checking exceptions, remove comment to activate
		/*jeff.set(100,11);
		jeff.remove(-1);
		jeff.remove(55);
		*/

		System.out.println("nothing failed congrats");
    }
}
