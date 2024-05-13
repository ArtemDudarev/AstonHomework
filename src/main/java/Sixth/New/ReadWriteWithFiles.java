package Sixth.New;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteWithFiles {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src\\main\\resources\\TestFiles.txt");
            //Files.createFile(path);
            Files.write(path, "aaaa".getBytes());
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
