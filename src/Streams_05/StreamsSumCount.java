package Streams_05;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsSumCount {

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

        //sum all the programmers years of experience
        int combinedExp = programmers.stream()
                .mapToInt(Programmer::getYearsExperience)
                .sum();

        System.out.println("combined experience:" + combinedExp);

        //number of programmers with more than 5 years exp
        long numProgrammers = programmers.stream()
                .filter(programmer -> programmer.getYearsExperience() > 5)
                .count();

        System.out.println("Number of programmers: " + numProgrammers);
    }
}