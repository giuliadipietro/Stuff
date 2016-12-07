
public class NineBottles {

	public static void song(int n) {
		if (n == 0) {
			System.out.println("fuck you Im not singing anymore");
		} else {
			System.out.println(n+" bottles of beer on the wall, "+n+" bottles of beer, ya’ take one down, ya’ pass it around, "+(n-1)+" bottles of beer on the wall.");
			song(n-1);
		}
	}


	public static void main(String[] args) {
		song(5);
	}

}
