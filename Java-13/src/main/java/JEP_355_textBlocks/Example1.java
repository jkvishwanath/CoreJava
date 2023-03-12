package JEP_355_textBlocks;

public class Example1 {
    public static void main(String[] args){
        // ORIGINAL
        String message = "A-143, 9th Floor, Sovereign Corporate Tower,\n" +
                "Sector-136, Noida,\n" +
                "Uttar Pradesh - 201305";

// BETTER : Using text blocks
// gets rid of lots of the clutter
        String messageNew = """
	A-143, 9th Floor, Sovereign Corporate Tower,
	Sector-136, Noida,
	Uttar Pradesh - 201305""";
        System.out.println(message);
        System.out.println(messageNew);

    }
}
