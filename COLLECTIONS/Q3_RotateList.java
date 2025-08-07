import java.util.*;

public class Q3_RotateList {
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        System.out.println("Rotated List: " + rotateList(list, rotateBy));
    }
}
