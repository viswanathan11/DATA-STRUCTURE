
import java.util.*;

public class PowerSet {

    private static void generator(List<List<Integer>> rl, List<Integer> lt, int[] nums, int i) {
        if (i == nums.length) {
            rl.add(new ArrayList<>(lt));
            return;
        }
        // Include nums[i]
        lt.add(nums[i]);
        generator(rl, lt, nums, i + 1);
        // Exclude nums[i]
        lt.remove(lt.size() - 1);
        generator(rl, lt, nums, i + 1);
    }

    public static List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> rl = new ArrayList<>();
        generator(rl, new ArrayList<>(), nums, 0);
        return rl;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = powerSet(nums);
        System.out.println("Power set:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}