
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12341234;
		int result = new ReverseInteger().reverse(num) ;
        System.out.println(result);
	}

	public int reverse(int x) {
        int result = 0;
        int result2 = 0;
        int least = 0;
        while (x != 0) {
            least = x % 10;
            result2 = result * 10 + least;
            x = x / 10;
            if ((result2 - least) / 10 != result){ 
                return 0; 
            }
            result = result2;
        }
        return result;
    }
}
