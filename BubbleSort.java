package Sort;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is Before Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The array is After Sort");
		for(int i=0;i<arr.length-1;i++) {
			boolean isSwap=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwap=true;
				}
			}
			if(isSwap==false) {
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
