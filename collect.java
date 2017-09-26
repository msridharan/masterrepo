import java.util.*;

class collect {
public static void main(String args[]) {
	LinkedList list = new LinkedList();
		list.add(8);
		list.add(9);
		list.add(2);
		list.add(3);
		Collections.sort(list);
		int[] arr={0,0,0,0};
		int i=0;
			System.out.println("ORIGINAL ARRAY");
			System.out.println("================");		
		for(Object st:list) {

			System.out.println((int)(st));
			arr[i] = (int)st;
			i++;
		}
			System.out.println("SORTED ARRAY");
			System.out.println("================");		
		//for(int j=arr.length-1;j>=0;j--) {
		//	System.out.println(arr[j]);
		//}
		for(int k:arr) {
			System.out.println(k);
		}
		System.out.println("First Biggest Number is is = "+arr[arr.length-1]);
		System.out.println("Second Biggest Number is = "+arr[arr.length-2]);
	}
}