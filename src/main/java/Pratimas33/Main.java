package Pratimas33;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] extensions = new String[] { "jpg", "png" };
        String dir ="C:/Users/Dariu/Downloads";
        List<File> files = (List<File>) FileUtils.listFiles(new File(dir),extensions,false);
        for (File file: files) {
            System.out.println(file);
        }

    }
}
