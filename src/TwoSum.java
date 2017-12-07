
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int[] result = new TwoSum().twoSum(nums, 9) ;
		for (int i : result)
            System.out.println(i);	}

	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
