
public class CheckFermat {
	
		
	public static void checkFermat(int a, int b, int c, int n) {

		double powerA = Math.pow(a, n);
		double powerB = Math.pow(b, n);
		double powerC = Math.pow(c, n);		


		if (powerA + powerB == powerC) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else {
			System.out.println("No, that doesn’t work. Are you stupid?");
		}
	}


	public static void main(String[] args) {
		checkFermat(2, 2, 2, 2);
	}



}
