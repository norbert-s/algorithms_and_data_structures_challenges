package modern_java.review.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise06 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!
        String text = "KisEsNagyBetuk";

        //my solutions
        List<Character> listChar =List.of(text.split(""))
                .stream()
                .map(s->s.charAt(0))
                .filter(Character::isUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

        text.chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isUpperCase)
                .forEach(System.out::println);
    }
}
