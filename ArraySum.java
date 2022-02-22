/**
 * 
 * @author vanessa
 *
 */
public class ArraySum {
	/**
	 * sum the values in an array of intgers
	 * @param a the integer of arrays
	 * @param index the number in the array 
	 * @return sum
	 */
	public int sumOfArray(Integer[] a, int index) {
		
		if (index == 0) {
			return a[0];
		}
		
		return a[index] + sumOfArray(a, index-1);
	}

}
