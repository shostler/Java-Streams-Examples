package Streams_06;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsMinMax {

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

        // print out the developer with the min years experience
        System.out.println(
                programmers.stream()
                        .max((programmer1, programmer2) -> programmer1.getYearsExperience() > programmer2.getYearsExperience() ? 1 : -1));

        //how about min.
        //Integer.compare

    }
}
