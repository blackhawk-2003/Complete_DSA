import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Permutation_of_an_array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        permute(nums);
    }

    public static void permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, nums.length - 1, result);
        print(result);
    }

    public static void permute(int[] nums, int l, int r, List<List<Integer>> result) {
        if (l == r) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(nums, l, i);
            permute(nums, l + 1, r, result);
            swap(nums, l, i);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void print(List<List<Integer>> result) {
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
