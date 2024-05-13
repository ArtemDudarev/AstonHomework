package Sixth.New;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ByteArrayOutputStreamRunnerNew {
    public static void main(String[] args) {

        String text = "Hello World!";
        byte[] buffer = text.getBytes();

        ByteBuffer byteBuffer = ByteBuffer.wrap(buffer);

        // превращаем массив байтов в строку
        System.out.println(new String(byteBuffer.array()));

        // получаем массив байтов и выводим по символьно
        for (byte b : byteBuffer.array()) {
            System.out.print((char) b);
        }

    }
}
