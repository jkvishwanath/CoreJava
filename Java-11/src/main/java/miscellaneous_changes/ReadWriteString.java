package miscellaneous_changes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteString {

    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(
                Files.createTempFile("test", ".txt"), "test file content");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
    }
}