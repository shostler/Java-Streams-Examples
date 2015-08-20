package Streams_03;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsMap {
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

        //print the golang programmers in lowercase
        programmers.stream()
                .filter(programmer -> programmer.getFavoriteLanguage().equals(Language.GOLANG))
                .map(programmer -> new Programmer(programmer.getName().toLowerCase(), programmer.getYearsExperience(), programmer.getFavoriteLanguage()))
                .forEach(System.out::println);

        //original list stays unchanged.
        //System.out.println(programmers);
    }
}
