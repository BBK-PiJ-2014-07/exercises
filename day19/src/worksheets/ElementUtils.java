package worksheets;

public class ElementUtils {
	// Uninstantiatable class
	private ElementUtils() {
	}

	public static <T> T betterElement(T element1, T element2,
			TwoElementPredicate<T> tester) {
		if (tester.isBetter(element1, element2)) {
			return (element1);
		} else {
			return (element2);
		}
	}
}
