package br.com.fiap.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileSample {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\rafae\\Desktop\\java-basics\\src\\main\\resources\\FileSample.txt";

        List<String> list = new ArrayList<>();

        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .filter( line -> !line.startsWith("0"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //functional to sout
        list.forEach(System.out::println);
    }
}
