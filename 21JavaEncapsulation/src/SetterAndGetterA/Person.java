package SetterAndGetterA;

public class Person {

	   private String name;

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
	   //If the variable was declared as public, we would expect the following output: John
	   //However, as we try to access a private variable, we get an error
}
