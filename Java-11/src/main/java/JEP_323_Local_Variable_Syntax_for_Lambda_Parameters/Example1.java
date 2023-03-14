package JEP_323_Local_Variable_Syntax_for_Lambda_Parameters;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var i) -> i % 3 == 0)
                .forEach(System.out::println);

/*        One benefit of uniformity is that modifiers, notably annotations,
    can be applied to local variables and lambda  expressions */

        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

    }
}