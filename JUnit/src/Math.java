
public class Math {
	public int add(int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	/**
	 * takes 2 numbers and multiplies them
	 * 
	 * @Angikar
	 */
	int multiply(int... numbers) {
		int pro = 1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				throw new IllegalArgumentException();
			} else {
				pro = pro * numbers[i];
			}
		}
		return pro;
	}
}
