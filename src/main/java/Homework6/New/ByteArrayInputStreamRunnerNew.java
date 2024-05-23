package Homework6.New;

import java.nio.ByteBuffer;

public class ByteArrayInputStreamRunnerNew {
    private static void readAllBytes() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(array1);
        while (byteBuffer1.hasRemaining()) {
            System.out.println(byteBuffer1.get());
        }
    }
    private static void readFiveChars() {
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(array2, 0, 5);
        while (byteBuffer2.hasRemaining()) {
            System.out.println((char) byteBuffer2.get());
        }
    }

    public static void main(String[] args) {
        readAllBytes();
        readFiveChars();
    }
}
