package new_java;

public class C extends B {
	public void test3() {
		System.out.println(300);
	}
public static void main(String[] args) {
	C c1 = new C();
	c1.test();
	c1.test2();
	c1.test3();
}
}
