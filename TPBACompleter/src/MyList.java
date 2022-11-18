public abstract class MyList<A> {
	abstract boolean myNull();
	abstract A myHead();
	abstract MyList<A> myTail();
	//metodo para definir funcion myAppend que concatena arreglos
	abstract MyList<A> myAppend(MyList<A> ys);
	//metodo para definir funcion myConcat que concatena arreglos
	abstract MyList<A> myConcat(MyList<MyList<A>> ys);
	abstract boolean equals(MyList<A> ys);
	// TODO 1: define the method myConcat
	// TODO 2: defined the STATIC method myConcat2 WITHOUT warning
	public static void main(String[] args) {
		MyList<String> l1 = new MyCons<String>("a",new MyCons<String>("b",new MyNil<String>()));
		MyList<String> l2 = new MyCons<String>("c",new MyCons<String>("d",new MyNil<String>()));
		System.out.println(l1);
		System.out.println(l2);
		//concatena l1 con l2
		//para ello usa la funcion myAppend
		System.out.println(l1.myAppend(l2));
		System.out.println("###########################");
		System.out.println(l1);
		System.out.println(l2);
		MyList<MyList<String>> l3 = new MyCons<MyList<String>>(l1,new MyCons<MyList<String>>(l2, new MyNil<MyList<String>>()));
		System.out.println(l3);
		System.out.println("###########################");
		//concatena l1 con l2
		//para ello usa la funcion myConcat
		System.out.println();
		//System.out.println(l3.myConcat());
		//System.out.println(MyList.myConcat2(l3));
		//System.out.println(l3.myConcat().equals(MyList.myConcat2(l3)));
	}
}
