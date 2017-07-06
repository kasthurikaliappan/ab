package gk;
import java.util.*;
public class concatenation {
 public static void main(String args[]) {
	 int i,j,n,temp;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the array");
	 n=s.nextInt();
	 System.out.println("Enter the element");
	 int a[]=new int[2];
	 for(i=0; i<n; i++) {
		 a[i]=s.nextInt();
	 }
	 j=i-1;
	 i=0;
	 while(i>j) {
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i++;
		 j--;
   }
	 System.out.println("reversed  array");
	 for(i=0; i<n; i++) {
		 System.out.println(a[i]+"");
	 }
 }
}
