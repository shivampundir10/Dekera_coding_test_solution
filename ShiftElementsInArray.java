package exam;

public class ShiftElementsInArray {

public void shift(int[] arr) {
//TODO write your code here to achieve the desired result as explained in Readme file for this problem.
int n = arr.length;
for (int i=0;i<n;i++) {
int temp = arr[0];
arr[0] = arr[i];
arr[i] = temp;
}
}
public static void main(String args[]) {
int[] a = {1,2,3,4,5,6};
// int[] a = {1};
// int[] a = {};

if (a.length == 0) {
throw new IllegalArgumentException("Array must have at least 1 element");
} else {

  ShiftElementsInArray obj = new ShiftElementsInArray();
  obj.shift(a);
  
  for (int i=0;i<a.length;i++) {
	  System.out.print(a[i] + " ");
  }		  
}
}
}
