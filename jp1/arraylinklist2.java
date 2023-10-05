package jp1;

import java.util.ArrayList;

public class arraylinklist2 {
	public static void main(String[] args) {
		ArrayList<String> subject=new ArrayList<String>();
		subject.add("Tamil");
		subject.add("English");
		subject.add("Maths");
		subject.add("Science");
		subject.add("Social");
		for(int i=0;i<subject.size();i++) {
			System.out.println(subject.get(i));
	  
		}
	}

}