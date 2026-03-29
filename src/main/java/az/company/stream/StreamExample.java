package az.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    static void main(String[] args) {
        List<String> names = Arrays.asList("Ilkin", "Feqan", "Amin");

        List<String>filteredNames = names.stream()
                .filter(name -> name.endsWith("n") )
                .map(String :: toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
