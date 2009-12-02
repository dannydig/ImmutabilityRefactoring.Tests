package object_out;

public class TestChainedSetterWithThis {
	private final int i, j;

	TestChainedSetterWithThis setI(int anInt) {
		return new TestChainedSetterWithThis(anInt, anInt);
	}
}
