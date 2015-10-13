package Streams_10;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsReuse {
    public static List<Programmer> initializeProgrammers(){
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

        Stream<Programmer> pStream = programmers.stream();

        System.out.println(pStream.filter(programmer -> programmer.getYearsExperience() > 5)
                        .filter(programmer -> programmer.getFavoriteLanguage().equals(Language.CPP))
                        .map(programmer -> programmer.getName())
                        .collect(toList()));

        /*
        pStream.filter(programmer -> programmer.getFavoriteLanguage().equals(Language.JAVA))
                .map(programmer -> programmer.getName())
                .forEach(System.out::println);
        */
    }


}
