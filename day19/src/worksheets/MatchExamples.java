package worksheets;

import java.util.stream.Stream;

public class MatchExamples {
    public static void main(String[] args) {
        String[] test1 = {"a", "b", "   "};
        System.out.println("isAnyMissing(test1): " + isAnyMissing(test1));
        String[] test2 = {"a", "b", null};
        System.out.println("isAnyMissing(test2): " + isAnyMissing(test2));
        String[] test3 = {"a", "b", "c"};
        System.out.println("isAnyMissing(test3): " + isAnyMissing(test3));
    }

    private static boolean isMissing(String value) {
        return ((value == null) || (value.trim().isEmpty()));
    }

    private static boolean isAnyMissing(String... values) {
        return (Stream.of(values).anyMatch(s -> isMissing(s)));
    }

    private static boolean isAnyMissing2(String... values) {
        return (Stream.of(values).anyMatch(MatchExamples::isMissing));
    }
}
