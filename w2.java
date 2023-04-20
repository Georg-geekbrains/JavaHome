public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int sum = 0;
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] > 0 && nums[i + 1] < 0) {
                sum += nums[i];
            }
            i++;
        }

        System.out.println(sum);
    }
}
