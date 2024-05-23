package Homework6.New;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedInputStreamRunnerNew {
    public static void main(String[] args) {

        try(FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("src/main/resources/text3.txt"))){
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
            for (int i = 0; i < fileChannel.size(); i++){
                System.out.print((char) mappedByteBuffer.get());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
