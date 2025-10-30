package factorial;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	/** 
	 *  Méthode qui met en œuvre la notion de factorielle telle que n ! = n*(n-1) …*
	 * @param n
	 * @return
	 */
	public static int  factorial(int n) {
		if(n == 0) {
			return 1;
		} 
			return n * factorial(n -1);
	
	}
}
