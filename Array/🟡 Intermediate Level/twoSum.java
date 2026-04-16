import java.util.Arrays;

public class twoSum {

    static int[] findTwoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int i = 0, j = n - 1;
        while (i < j) {
            int sum = arr[i][0] + arr[j][0];
            if (sum == target) {
                int idx1 = arr[i][1];
                int idx2 = arr[j][1];
                return new int[] { Math.min(idx1, idx2), Math.max(idx1, idx2) };
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { -3, 4, 3, 90 };
        int target = 0;
        int[] result = findTwoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}