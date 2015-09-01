package Streams_08;

import shared.Language;
import shared.Programmer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * @author stuart-hostler
 * @since 8/17/15.
 */
public class StreamsToMapToSet {

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

        Map<String, Programmer> programmerByNameExp =
                programmers.stream()
                    .collect(toMap(programmer -> programmer.getName() + programmer.getYearsExperience(), programmer -> programmer));

        programmerByNameExp.forEach((nameExp, programmer) -> System.out.println(nameExp + " : " + programmer));

        //What if there's collisions? i.e. just by name

        Set<String> programmerNames =
                programmers.stream()
                        .map(Programmer::getName)
                        .collect(toSet());

        System.out.println(programmerNames);

        //notice that the order isn't preserved
    }
}
