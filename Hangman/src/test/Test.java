package test;

public class Test {

	public static void main(String[] args) {

		System.out.println(false ? "yes" : "no");
		
		int value = 56;
		
		value =  value > 60 ? 60 : value;
		
		System.out.println(value);
		
		int[] values = {1,2,3,4,5,6,7,8,9};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int currentValue: values) {
			max = currentValue > max ? currentValue : max;
			min = currentValue < min ? currentValue : min;
		}
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
