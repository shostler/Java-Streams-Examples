package Streams_09;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsSorting {

    public static List<Programmer> initializeProgrammers() {
        return Arrays.asList(
                new Programmer("Bob", 15, Language.CPP),
                new Programmer("John", 1, Language.JAVA),
                new Programmer("Susan", 40, Language.FORTRAN),
                new Programmer("Susan", 3, Language.GOLANG),
                new Programmer("Stuart", 10, Language.JAVA),
                new Programmer("Krystal", 6, Language.CPP),
                new Programmer("Krystal", 25, Language.GOLANG)
        );
    }

    public static void main(String[] args) {
        List<Programmer> programmers = initializeProgrammers();

        String lineBreak = "\n----------------------\n";

        //sorted by years exp
        programmers.stream()
                .sorted((programmer1, programmer2) -> programmer1.getYearsExperience() > programmer2.getYearsExperience() ? 1 : -1 )
                .forEach(System.out::println);


        System.out.println(lineBreak);

        //sorted by years exp using comparing
        Function<Programmer, Integer> byExp = Programmer::getYearsExperience;
        programmers.stream()
                .sorted( comparing(byExp) )
                .forEach(System.out::println);

        System.out.println(lineBreak);

        //sorted by name then exp using thenComparing
        Function<Programmer, String> byName = Programmer::getName;
        programmers.stream()
                .sorted( comparing(byName).thenComparing(byExp))
                .forEach(System.out::println);

        System.out.println(lineBreak);

        //sorted() : natural order, implements Comparable
    }
}
