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
// မျိုးရိုးဆက်ခံပိုင်ခွင့်ရှိပေမဲ့လဲ အဆင့်ဆင့်မျိုးရိုးဆက်ခံပိုင်ခွင့်ကို သတိပြုပါ
class C extends B{
	
}
