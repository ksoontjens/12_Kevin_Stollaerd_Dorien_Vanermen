import java.lang.*;

public class PI{
	public static void main(String args[]){
		final short END = 10000;
		float array[] = new float[END];
		float index = 1;
		float answer = 0f;
		
		for (short i = 0; i < END; i++){
			if (i > 0){
				if(array[i - 1] > 0)
					array[i] = ((1/index) * -1.0f);
				else
					array[i] = 1/index;
			}
			else {
				array[i] = 1/index;
			}
			
			index += 2;
		}
		
		for(float x : array){
			answer += x;
		}
		
		answer *= 4;
		
		System.out.println(answer);
	}
}