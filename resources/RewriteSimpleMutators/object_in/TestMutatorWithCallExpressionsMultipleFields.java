package object_in;

public class TestMutatorWithCallExpressionsMultipleFields {
	int i, j;

	int getInt() { 
		System.out.println("Returning int");
		return 42;
	}

	// Retain call order in case the method has side effects - must also create a getter
	void mutateFields() {
		i = getInt();
		j = getInt();
	}
}
