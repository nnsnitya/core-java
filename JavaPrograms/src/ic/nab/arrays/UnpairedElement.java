package ic.nab.arrays;

public class UnpairedElement {

	public static void main(String[] args) {

		int[] arr = {2, 4, 3, 3, 9, 4, 9};
		int unpairedElement = findUnpairedElement(arr);
		System.out.println("Unpared Element: "+unpairedElement);
	}

	private static int findUnpairedElement(int[] arr) {
		int result = 0;
		for(int num: arr) {
			System.out.println(result);
			System.out.println(num);
			result = result ^ num;
			System.out.println(result);
			System.out.println("---");
		}
		return result;
	}

}
