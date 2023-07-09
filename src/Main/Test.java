package Main;

public class Test {
	public int a=10;
	int b=20;
	protected int c=30;
	private int d=40;
	
	public void show(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		System.out.println("hiii");
	//	System.out.println("github uploaded");
		System.out.println("again git push");
		System.out.println("this is fourth commit");
		new x.MyClass().meth();
		new y.MyClass().meth();
		new Test().show();
	}

}
