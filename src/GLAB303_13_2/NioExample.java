package bootcamp13.Assignments.GLAB303_13_2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles =
                {"/Users/nick/Documents/JavaPerScholas/src/bootcamp13/Assignments/GLAB303_13_2/file1.txt",
                "/Users/nick/Documents/JavaPerScholas/src/bootcamp13/Assignments/GLAB303_13_2/file2.txt"};

        // Specify out file with path location
        //Files contents will be written in these files
        String outputFile =
                "/Users/nick/Documents/JavaPerScholas/src/bootcamp13/Assignments/GLAB303_13_2/nioOutput.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {

            // Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel = fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.println((char)buf.get());
            while (inputchannel.read(buf) > 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    // System.out.println((char)buf.get());
                    targetChannel.write(buf);
                    // fis.close();
                }
            }
        }
    }
}
