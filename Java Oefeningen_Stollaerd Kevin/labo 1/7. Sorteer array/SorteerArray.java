import java.lang.*;

public class SorteerArray{
	public static void main(String args[]){
		int a[] = {12, 34, 56, 78, 123, 234, 99, 88};
		int b[] = new int[a.length];
		int max = 0;
		int positie = 0;
		
		for (int i = 0; i < b.length; i++){
			for (int j = 0; j < a.length; j++){
				if(a[j] > max){
					max = a[j];
					positie = j;
				}
			}
			
			b[i] = max;
			a[positie] = 0;
			max = 0;
		}
		
		System.out.println("\nOUTPUT:\n");
		
		for (int number : b)
			System.out.println(number);
	}
}