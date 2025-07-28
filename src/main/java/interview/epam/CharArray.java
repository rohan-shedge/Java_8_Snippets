package interview.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharArray {

    public static void main(String[] args) {
        String s1 = "rohanrohan";
        //  s1.chars().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //  s1.chars().forEach(System.out::println);
        Map<Character, Long> map = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((x, y) -> System.out.println(" " + x + " " + y));
    }
}