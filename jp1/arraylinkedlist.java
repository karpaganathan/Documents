package jp1;

import java.util.ArrayList;

public class arraylinkedlist {
	public static void main(String[]args) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num.get(3));
		System.out.println(num.set(1,10));
		System.out.println(num.remove(0));
		System.out.println(num);
		System.out.println(num.size());
	}

}
