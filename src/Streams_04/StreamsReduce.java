package Streams_04;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsReduce {
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

        //some all the programmers years of experience
        int combinedExp = programmers.stream()
                .map(Programmer::getYearsExperience)
                .reduce(0, (sum, exp) -> sum + exp);
                //.reduce(0, Integer::sum);

        System.out.println(combinedExp);

    }
}
