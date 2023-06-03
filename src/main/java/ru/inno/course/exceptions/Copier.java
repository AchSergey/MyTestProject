package ru.inno.course.exceptions;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Copier {

    public static void copyTextFile(String sourceFilePath, String destinationFilePath) throws IOException {
        List lines = (List) Files.readAllLines(Path.of(sourceFilePath));
        Files.write(Path.of(destinationFilePath), (Iterable<? extends CharSequence>) lines);
    }
}


