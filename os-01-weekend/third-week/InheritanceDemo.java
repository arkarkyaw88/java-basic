package com.jdc.akk;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.doSomething();
	}
}


class A {
	
	String name;
	
	void showName() {
		System.out.println(name);
	}
}

class B extends A{
	void doSomething() {
		name = "Snoopy Doggie";
		showName();
	}
}

class C extends A{
	
}
