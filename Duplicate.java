import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void findDuplicate(int nums[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > max) {
                max = nums[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 4, 2, 2, 2 };
        findDuplicate(nums);
    }

}
