package InnerClasses;

public class InnerClassesD {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
}

class OuterClass {
	int x = 10; 

	class InnerClass {
		public int myInnerMethod() {
			return x;
		}
	}
}