package staticDemo;

public class StaticDemo {
static int i;
int j;
	static {
		System.out.println("Static block");
		i=9;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int m1() {
		int k;
		k=9;
		k+=1;
		return 10;
	}
}
