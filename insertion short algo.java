public class Main {
	public static void main(String[] args) {
		System.out.println("Insertion short algotithem");
		int arr[] = {12,36,07,5,7,1};
			int i,j, current;
		System.out.println("Before shorting:");
		for(i=0; i<arr.length;i++){
		    System.out.print(arr[i]+", ");
		}
	System.out.println();
		for(i=1;i<arr.length;i++){
		    current = arr[i];
		    j=i-1;
		    while (j>=0 && current <arr[j]){
		        arr[j+1] = arr[j];
		        j--;
		    }
		    arr[j+1] = current;
		}
		
				System.out.println("After shorting:");
		for(i=0; i<arr.length;i++){
		    System.out.print(arr[i]+", ");
		}
	}
}