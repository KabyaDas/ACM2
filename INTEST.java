import java.util.*;
import java.lang.*;

// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int count=0;
		for(int i = 0;i<n;i++){
		    int ti = input.nextInt();
		   if(ti%k==0){
		    count++;
		   
		}
		 
		}
	System.out.println(count);
	}
}
		
	 