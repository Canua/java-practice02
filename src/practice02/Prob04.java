package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		char[] ch = str.toCharArray();
		String change = "";
		for (int i = str.length() - 1; i > -1; i--) {
			change += str.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			ch[i] = change.charAt(i);
		}
		return ch;
	}

	public static void printCharArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
