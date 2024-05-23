package Homework6.New;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedOutputStreamRunnerNew {
    public static void main(String[] args) {
        String text = "Hello new world!";
        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("src/main/resources/text3New.txt"), StandardOpenOption.WRITE, StandardOpenOption.READ)) {
            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, text.length());
            mappedByteBuffer.put(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
