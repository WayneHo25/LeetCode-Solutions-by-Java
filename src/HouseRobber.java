
public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 4, 5, 1, 3, 4, 7, 1};
		int result = new HouseRobber().rob(nums);
		System.out.print(result);
	}

	public int rob(int[] nums) {
		int prevNo = 0;
	    int prevYes = 0;
	    for (int n : nums) {
	        int temp = prevNo;
	        prevNo = Math.max(prevNo, prevYes);
	        prevYes = n + temp;
	    }
	    return Math.max(prevNo, prevYes);
    }
}
