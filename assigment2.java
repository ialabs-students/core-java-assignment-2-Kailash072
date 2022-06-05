package assigment2;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(24);
		list.add(543534);
		list.add(545);
		list.add(2342);
		list.add(9);

		System.out.println("Sample Input: "+ list);

	    Collections.sort(list, Collections.reverseOrder());

	    System.out.println("Output: "+ list);
	}
}
