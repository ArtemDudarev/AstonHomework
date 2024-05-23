package Homework6.New;

import java.nio.ByteBuffer;

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
