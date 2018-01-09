
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234321;
		boolean result = new PalindromeNumber().isPalindrome(num);
		System.out.print(result);
	}

	public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reserve = 0;
        int reserve2 = 0;
        int units = 0;
        int x2 = x;
        while (x2 != 0) {
            units = x2 % 10;
            reserve2 = reserve * 10 + units;
            if ((reserve2 - units) / 10 != reserve){ 
                return false; 
            }
            x2 = x2 / 10;
            reserve = reserve2;
        }

        if (reserve == x) {
            return true;
        }else {
            return false;
        }
    }
}
