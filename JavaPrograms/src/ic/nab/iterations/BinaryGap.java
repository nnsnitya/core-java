package ic.nab.iterations;

public class BinaryGap {

	public static void main(String[] args) {
		int num = 529;
		int result = binaryGap(num);
		System.out.println("The Binary Gap is in "+num+" is "+result);
	}

	private static int binaryGap(int n) {
		//convert int to binary
		String binaryRepresentation = Integer.toBinaryString(n);
		
		//find the binary gap
		int maxGap = 0;
		int currentGap = 0;
		for(char digit: binaryRepresentation.toCharArray()) {
			if(digit == '0') {
				currentGap++;
			}
			else if(digit == '1') {
				maxGap = Math.max(maxGap, currentGap);
				currentGap = 0;
			}
		}
		
		//return the maximum binary gap
		return maxGap;
	}

}
