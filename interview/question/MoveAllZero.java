/*Given an array of random numbers, Push all the zero’s of a given array to the end of the array. 
For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to 
{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time 
complexity is O(n) and extra space is O(1).
*/

public class MoveAllZero {
	//This will use O(n^2) time and O(1) space
	public int[] moveall (int[] arr){
		int[] re = arr;
		int i,j;
		for (i=0;i<arr.length;i++){
			j=0;
			if(arr[i]==0){
				while(arr[i+j]==0 && i+j<arr.length-1){
					j++;
				}
				int temp = re[i+j];
				re[i+j] = arr[i];
				re[i] = temp;
			}
		}
		return re;
	}
	
	//This will use O(n) time and O(1) space
	public int[] moveall (int[] arr){
		int[] re = arr;
		int i,j;
		for (i=0,j=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[j++] = arr[i];
			}
		}
		for(i=j;i<arr.length;i++){
			arr[i] =0;
		}
		return re;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int[] re = arr;
		MoveAllZero maz = new MoveAllZero();
		re = maz.moveall(arr);
		for (int i : re){
		System.out.print(i+" ");
		}
	}

}
