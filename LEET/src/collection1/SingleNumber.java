package collection1;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

	public static int singleNumber(int[] A) {
        int result=A[0];
		for(int i = 1;i<A.length;i++){
        	result = result^A[i];
        }
		return result;
    }

	public static void main(String[] args) {
		System.out.println(1^2);
		int[] arr = {1,2,2,3,4,1,3,4,7,8,8};
		System.out.println(singleNumber(arr));
	}

}
