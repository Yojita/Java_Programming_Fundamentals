package keyWordsAndIdentifiers;

public class ScopeOfVariables {
	int i = 34; // instance variable
	static int z; // class variable;
	static {
		z = 10;
		System.out.println("Inside static block : " + z);
	}

	void test() {
		int k = 200; // local variable;
		System.out.println("Local variable : " + (k + i));
	}

	public static void main(String[] args) {
		ScopeOfVariables obj = new ScopeOfVariables();
		obj.test();
		System.out.println(obj.i);
	}
}
