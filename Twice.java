package gk;

public class Twice {
  public static void main(String args[]) {
	int k=0;
	int a[]= {3,2,6,5,8,9,10,15,47,98};
	for( int i=0;i<a.length;i++) {
		k=a[i]|k%3;
		}
	System.out.println(k);
}
  }
