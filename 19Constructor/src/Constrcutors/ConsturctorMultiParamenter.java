package Constrcutors;

public class ConsturctorMultiParamenter {
	int modelYear;
	String modelName;
	
	//constructor
	 public ConsturctorMultiParamenter(int year, String name) {
		 modelYear = year;
		 modelName = name;
		 }
	
	public static void main(String[] args) {
		ConsturctorMultiParamenter myCar = new ConsturctorMultiParamenter(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
