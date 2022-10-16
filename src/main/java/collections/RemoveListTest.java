package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveListTest {
    public static void main(String[] args) {
        List<String> listA = new LinkedList<>();
        listA.add("0");
        listA.add("1");
        listA.add("2");
        for (String elem : listA) {
            if (elem.equals("2")) {
                listA.remove(elem);
            }
            System.out.printf("curStr = %s, listA = %s\n", elem, listA);
        }
    }
}
