public class driver {
        public static void main(String[] args) {
                //Instantiating stuff:
                String[] errorMessages = new String[16];
                for(int i = 0; i < errorMessages.length; i++) {
                        errorMessages[i] = "No error for this!";
                }
                int wrong = 0;
                MyLinkedList l = new MyLinkedList();
                Node a = new Node();
                a.setData(3);
                Node b = new Node();
                b.setData(4);
                Node c = new Node();
                c.setData(2);
                System.out.println("");
                System.out.println("");
                System.out.println("#### STARTING INSTANCE VARIABLES ####");
                System.out.println("Node a = new Node(3);");
                System.out.println("Node b = new Node(4);");
                System.out.println("Node c = new Node(2);");
                System.out.println("MyLinkedList l = new MyLinkedList()");
                System.out.println("");
                System.out.println("");
                System.out.println("### TESTING NODE METHODS: (Node constructor only takes in data for this case.) ###");
                System.out.println("");
                System.out.println("1. Testing toString() for Node: (NOTE: Some tests for node may not work if this isn't working.)");
                System.out.print("Does a.toString() equal 3?");
                if(!a.toString().equals("3")) {
                        errorMessages[wrong] = "Node toString is wrong.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                else {
                        System.out.print(" Yup! ");
                }
                System.out.println("Your Result: " + a);
                System.out.println("");
                System.out.println("");
                System.out.println("2. Testing data() for Node:");
                System.out.print("Does a.data() equal 3?");
                if(a.getData() != 3) {
                        errorMessages[wrong] = "Node data method is wrong.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                else {
                        System.out.print(" Yup! ");
                }
                System.out.println("Your Result: " + a.getData());
                System.out.println("");
                System.out.println("");
                System.out.println("3. Testing next() and setNext() for Node:");
                System.out.print("Does a.next() equal b?");
                a.setNext(b);
                if(a.next().getData() != 4) {
                        errorMessages[wrong] = "Node next() is wrong.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                else {
                        System.out.print(" Yup! ");
                }
                System.out.println("Your Result " + a.next());
                System.out.println("");
                System.out.println("");
                System.out.println("4. Testing prev() and setPrev() for Node:");
                System.out.print("Does a.prev() equal c?");
                a.setPrev(c);
                if(a.prev().getData() != 2) {
                        errorMessages[wrong] = "Node prev() is wrong.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                else {
                        System.out.print(" Yup! ");
                }
                System.out.println("Your Result " + a.prev());



                System.out.println("");
                System.out.println("");
                System.out.println("");



                System.out.println("### TESTING MYLINKEDLIST METHODS ###");
                System.out.println("");
                System.out.println("5. Testing MyLinkedList toString()");
                System.out.print("Does l.toString() equal []?");
                //System.out.println(l.toString());
                if(!l.toString().equals("[]")) {
                        errorMessages[wrong] = "MyLinkedList toString() is wrong";
                        wrong++;
                        System.out.print(" No :( ");
                }
                else {
                        System.out.print(" Yup! ");
                }
                System.out.println("");
                System.out.println("");
                System.out.println("6. Testing MyLinkedList add(int value): ");
                System.out.print("Does l.add(3), l.add(4), l.add(5) print out [3,4,5]?");
                l.add(3);
                l.add(4);
                l.add(5);
                if(l.toString().equals("[3,4,5]") || l.toString().equals("[3, 4, 5]")){
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "add(int value) doesn't work OR your toString prints an extra comma? or no brackets.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.println("Your Result: " + l);
                System.out.println("");
                System.out.println("");
                System.out.println("7. Testing MyLinkedList get(int value)");
                System.out.print("Does l.get(2) equal 5?");
                if(l.get(2) == 5) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "get(int value) doesn't work.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your Result: " + l.get(2));
                System.out.println("");
                System.out.println("");
                System.out.println("8. Testing MyLinkedList size()");
                System.out.print("Does l.size() return 3?");
                if(l.size() == 3) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "size() doesn't work!";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("9. Testing set()");
                System.out.print("Does l.set(0, 9) change l to [9,4,5] or [9, 4, 5]");
                l.set(0,9);
                if(l.toString().equals("[9,4,5]") || l.toString().equals("[9, 4, 5]")){
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "set(int index, Integer value) doesn't work OR your toString prints an extra comma? or no brackets.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your Result when running l.set(0,9): " + l.set(0,9));
                System.out.println(" AND l when printed after the change: " + l);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("10. Testing add(int index, Integer value)");
                System.out.println("Does l.add(2,36) change l to [9,4,36,5] or [9, 4, 36, 5]?");
                l.add(2,36);
                if(l.toString().equals("[9,4,36,5]") || l.toString().equals("[9, 4, 36, 5]")) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "Your add(int index, Integer value isn't working properly";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your result: " + l);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("11. Testing contains(Integer value)");
                System.out.println("Does l.contains(36) return true?");
                if(l.contains(36)) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "Your contains() method isn't working.";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your result: " + l.contains(36));
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("12. Testing indexOf(Integer value)");
                System.out.println("Does l.indexOf(36) return 2?");
                if(l.indexOf(36) == 2) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "Your indexOf() method isn't working";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your result: " + l.indexOf(36));
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("13. Testing remove(int value)");
                System.out.println("Does l.remove(2) return 36 and print [9,4,5] or [9, 4, 5]?");
                int removed = l.remove(2);
                if(removed == 36 && (l.toString().equals("[9,4,5]") || l.toString().equals("[9, 4, 5]"))) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "Your remove(int value) isn't working!";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your list is: " + l);
                System.out.print(" AND your removed value was " + removed);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("14. Testing remove(Integer value)");
                System.out.println("Does l.remove(new Integer(5)) return true and print [9,4] or [9, 4]?");
                if(l.remove(new Integer(5)) && (l.toString().equals("[9,4]") || l.toString().equals("[9, 4]"))) {
                        System.out.print(" Yup! ");
                }
                else {
                        errorMessages[wrong] = "Your remove(Integer value) isn't working!";
                        wrong++;
                        System.out.print(" No :( ");
                }
                System.out.print("Your Result is: " + l);


                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");


                System.out.println("#### EXCEPTION TESTING ####");
                l.add(788);
                l.add(99);
                l.add(121);
                l.add(232);
                System.out.println("Added 788, 99, 121, and 232 ==> Your list: " + l);
                System.out.println("15. Trying to get(-1), should print IndexOutOfBounds Exception..");
                try {
                        l.get(-1);
                }
                catch(IndexOutOfBoundsException e) {
                        System.out.println("Correct exception caught! (I used a try and catch with that specific exception.)");
                }
                catch(Exception e) {
                        errorMessages[wrong] = "Incorrect Exception caught for get() or NONE";
                        wrong++;
                        System.out.println("Incorrect Exception Caught for get().");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("16. Trying to remove(-1) using remove(index), should print IndexOutOfBounds Exception..");
                try {
                        l.remove(-1);
                }
                catch(IndexOutOfBoundsException e) {
                        System.out.println("Correct exception caught! (I used a try and catch with that specific exception.)");
                }
                catch(Exception e) {
                        errorMessages[wrong] = "Incorrect Exception caught for remove() or NONE";
                        wrong++;
                        System.out.println("Incorrect Exception Caught.");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("### END RESULTS ###");
                System.out.println("You have " + wrong + " errors!");
                System.out.println("They are:");
                int count = 1;
                for(int i = 0; i < errorMessages.length; i++) {
                        if(!errorMessages[i].equals("No error for this!")) {
                        System.out.println(count + ". " + errorMessages[i]);
                        count++;
                        }
                }
        }
}
