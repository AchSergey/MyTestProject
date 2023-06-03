package ru.inno.course.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestClass {
    public static void main(String[] args) throws IOException {
        String fileName = "counter.txt";
        if(Files.exists(Path.of(fileName))) {
            String content = Files.readString(Path.of(fileName));
            int value = Integer.parseInt(content);
            value +=1;

            Files.writeString(Path.of(fileName),Integer.toString(value));
        }else {
            Files.writeString(Path.of(fileName),"1");
        }

    }
}
