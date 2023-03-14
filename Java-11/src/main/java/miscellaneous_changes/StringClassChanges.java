package miscellaneous_changes;

public class StringClassChanges {

    public static void main(String[] args) {
        String s = "  test string  ";
        System.out.printf("'%s'%n", s);
        String striped = s.strip();
        System.out.printf("strip():%n '%s'%n", striped);

        striped = s.stripLeading();
        System.out.printf("stripLeading():%n '%s'%n", striped);

        striped = s.stripTrailing();
        System.out.printf("stripTrailing():%n '%s'%n", striped);

        String s2 = "test string\u205F";
        String striped2 = s2.strip();
        System.out.printf("'%s'%n", striped2);

        String trimmed = s2.trim();
        System.out.printf("'%s'%n", trimmed);



    }
}