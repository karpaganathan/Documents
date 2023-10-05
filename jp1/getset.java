package jp1;

public class getset {
	int Person_id;
	String Person_name;
	int Person_no;
	
	public int getPerson_id() {
		return Person_id;
	}
	public String getPerson_name() {
		return Person_name;
	}
	public int getPerson_no() {
		return Person_no;
	}
	public void setPerson_id1(int personid) {
		Person_id=personid;
	}
	public void setPerson_name(String personname) {
		Person_name=personname;
	}
	public void setPerson_no(int personno) {
		Person_no=personno;
	}	


	
public static void main(String args[]) {
		getset k=new getset();
		k.setPerson_id1(16);
		k.setPerson_name("karpaganathan");
		k.setPerson_no(987654321);
		System.out.println("Id : "+k.getPerson_id());
		System.out.println("Name: "+k.getPerson_name());
		System.out.println("Mobile No : "+k.getPerson_no());
		
	}
}

