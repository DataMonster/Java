package collection3;

public class FirstMissingPositive {

	public static void pre (int n){
		int result = 1;
		for(int i=2;i<=n;i++){
			if(i!=4)
			result=i;
		}
		System.out.println(result);
	}
	
	public static int firstMissingPositive(int[] A) {
		if(A.length==0){
			return 1;
		}
        for(int i =0;i<A.length;i++){
        	if(A[i]>0){
        		if(A[i]>A.length){
        			A[0] = A[i];
        		} else {
        		int temp = A[i]-1;
        		A[i] = A[temp];
        		A[temp] = temp+1;}
        	}else {
        		A[i] = 0;
        	}
        }
        for(int i = 0;i<A.length;i++){
        	System.out.print(A[i]+" ");
        }
        if(A[0]>1) return 1;
        for(int i =1;i<A.length;i++){
        	if(A[i]!=i+1){
        		return i+1;
        	}
        }
        if(A[0]==1) return A.length+1;
        return A.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=2;i<12;i++){pre(i);}
		System.out.println(firstMissingPositive(new int[] {2}));
		System.out.println(firstMissingPositive(new int[] {1}));
		System.out.println(firstMissingPositive(new int[] {1,2,3,4}));
		System.out.println(firstMissingPositive(new int[] {2,2}));
		System.out.println(firstMissingPositive(new int[] {3,2}));
		System.out.println(firstMissingPositive(new int[] {1,3,4}));
		System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
		System.out.println(firstMissingPositive(new int[] {1000,-1}));
		System.out.println(firstMissingPositive(new int[] {1,1000}));
	}

}
