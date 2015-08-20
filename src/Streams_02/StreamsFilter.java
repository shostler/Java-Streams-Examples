package Streams_02;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/12/15.
 */
public class StreamsFilter {
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

        //find the java programmers and print them out
        programmers.stream()
                .filter(programmer -> programmer.getFavoriteLanguage().equals(Language.JAVA))
                .forEach(System.out::println);
    }
}
