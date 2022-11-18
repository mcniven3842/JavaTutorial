package SetterAndGetterB;

public class Main {

	
	//Instead, we use the getName() and setName() methods to access and update the variable:
	public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("John");
	    System.out.println(myObj.getName());
	}

}
