package Streams_07;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsGroupingBy {

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

        //group everyone with the same favorite language
        Map<Language, List<Programmer>> byFavLanguage =
                programmers.stream()
                        .collect(groupingBy(Programmer::getFavoriteLanguage));

        System.out.println(byFavLanguage);

        //group everyone with the same first initial
        System.out.println(
                programmers.stream()
                    .collect(groupingBy(programmer -> programmer.getName().charAt(0))));

    }
}
