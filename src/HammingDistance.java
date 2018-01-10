
public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		int num2 = 234;
		int result = new HammingDistance().hammingDistance(num1, num2);
		System.out.print(result);
	}

	public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
