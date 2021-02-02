
import java.util.*;
class Prog01{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		int [] b={1,3,2,4,5,1,4,5,6,7,4,3};
		System.out.println(a+" " + a[0]);
		System.out.println(b+" "+b.length);
		System.arraycopy(b,4,a,0,5);
		System.out.println(a+" "+a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
	}
}