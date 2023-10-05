package jp1;

public class This {
	int number;
	
	This( int number){
		this.number =number;
		System.out.println("Number :"+this.number);
	}
	public static void main(String[] args) {
		This obj = new This(16);
		System.out.println("id :"+obj);
	}


}
