package linkedList;
import java.util.*;
public class LLCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        System.out.println(list);
        list.addFirst("b");
        System.out.println(list);


        list.addLast("c");
        System.out.println(list);
    }
}
