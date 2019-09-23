

public class AlternatingTrees {
	public static int checkAlternatingTrees(int A[]) {
		int temp=0;
		for(int i=0;i<A.length-1;i++) {
		int diff=A[i]-A[i+1];
		if(i==0) {
			temp= -diff;
		}
		if(diff<0 && temp>0) {
			temp= diff;
			continue;			
		}else if(diff>0 && temp<0) {
			temp= diff;
			continue;
		}else if(diff ==0) {
			return -1;
		}else {
			return -1;
		}
		
		}
		
		return 1;
	}
	
	public static  int solutions(int A[]) {
		int count=0;
		if(checkAlternatingTrees(A)==1) {
			return 0;
		}
		int B[]=A.clone();
		for(int i=0;i<A.length;i++) {
		 A=B;
         A=removeElement(A,i);
         if(checkAlternatingTrees(A)==1) {
        	 count++;
         }
         
		}
		
		if(count>0) {
			return count;
		}else {
			return -1;
		}
		
	}
	
	public static int[] removeElement(int arr[], int index) {
		int temp[]= new int[arr.length-1];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(i== index) {
				continue;
			}
			temp[count++]=arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,3,7};

		System.out.println(solutions(arr));		

	}

}
