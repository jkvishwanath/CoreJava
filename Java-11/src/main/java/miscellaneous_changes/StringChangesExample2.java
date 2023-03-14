package miscellaneous_changes;

public class StringChangesExample2 {


    public static void main(String[] args) {
    String s = "  ";
    //old isEmpty() method
    boolean empty = s.isEmpty();
      System.out.println(empty);
    //new isBlank()
    boolean blank = s.isBlank();
      System.out.println(blank);

/*Streaming lines*/
        String streamingLines= "jujube\nsatsuma\nguava";
        streamingLines.lines()
                .forEach(System.out::println);
/*Repeating*/
        String sRepeat = "-";
        String newString = sRepeat.repeat(10);
        System.out.println(newString);
    }
}
