import java.util.*;

public class Q1_ReverseList {
    // Reverse an ArrayList
    public static List<Integer> reverseArrayList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    // Reverse a LinkedList
    public static List<Integer> reverseLinkedList(List<Integer> list) {
        List<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {+
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}
