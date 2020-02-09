import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String args[]){
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        list1.add(3);
        list1.add(4);
        list1.add(2);

        list2.add(4);
        list2.add(6);
        list2.add(5);

        System.out.println("List1 elements: "+list1.toString());
        System.out.println("List2 elements: "+list2.toString());

        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        List<Integer> list3 = new LinkedList<Integer>();
        while(iterator1.hasNext() && iterator2.hasNext()){
            int element1 = iterator1.next();
            int element2 = iterator2.next();

            int element3 = element1 + element2;
            list3.add(element3);
        }

        Iterator<Integer> iterator3 = list3.iterator();

        while(iterator3.hasNext()){
            int element4 = iterator3.next();
            System.out.println(element4);
        }
    }
}
