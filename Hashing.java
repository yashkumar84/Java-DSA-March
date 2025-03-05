import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 4, 5, 6, 2, 3, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1, 1);
        // map.put(1, 5);

        // map.put(1, map.get(1) + 1);

        // System.out.println(map.get(1) + 1);
        // System.out.println(map);
        // System.out.println(map.containsKey(2));
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);
        System.out.println(map.get(3));

    }
}
