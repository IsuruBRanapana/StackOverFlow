import java.util.*;
import java.lang.*;
public class Stack2{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1<num2){
			System.out.println("Number 1 is less than number 2");
			System.exit(1);
		}
		int x=num1-num2;
		int y=num1;
		//System.out.print(num1+" - "+num2+" --> is equal to "+ num1+" " );
		/*while(num1!=x){
			System.out.print("-1 ");
			num1--;
		}*/
		while(num1!=x){
			System.out.println(num1+" -1 = "+(num1-1));
			num1--;
		}
		System.out.println(y+" - "+num2+" = "x);
	}
}