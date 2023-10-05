package jp1;

public class Static {
	 static int Var = 10;

	  
	    public static class StaticNestedClass {
	         int nestedVariable;

	        StaticNestedClass(int value) {
	            nestedVariable = value;
	        }
	        public void display() {
	            System.out.println("Static Variable from OuterClass: " + Var);
	            System.out.println("Nested Variable: " + nestedVariable);
	        }
	    }

	    public static void main(String[] args) {
	    	 StaticNestedClass nestedObj = new StaticNestedClass(20);
	    	 nestedObj.display();
	    }
	        

}
