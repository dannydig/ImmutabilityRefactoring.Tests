package object_in;

public class TestMutatorWithCallExpressions {
	int i;

	int getInt() { 
		System.out.println("Returning int");
		return 42;
	}

	void mutateFields() {
		i = getInt();
	}
}
