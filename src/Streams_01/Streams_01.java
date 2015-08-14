package Streams_01;

import shared.Language;
import shared.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author stuart-hostler
 * @since 8/12/15.
 */
public class Streams_01 {
    public static List<Programmer> initializeProgrammers(){
        return Arrays.asList(
            new Programmer("Bob", 15, Language.CPP),
            new Programmer("John", 1, Language.JAVA),
            new Programmer("Susan", 40, Language.FORTRAN),
            new Programmer("Susan", 3, Language.GOLANG),
            new Programmer("Wendel", 10, Language.JAVA),
            new Programmer("Krystal", 6, Language.CPP),
            new Programmer("Krystal", 20, Language.GOLANG)
        );
    }

    public static void main(String[] args) {
        List<Programmer> programmers = initializeProgrammers();

        //get the names of everyone with over 5 years experience who's favorite language is CPP
        List<String> namesOverFive = new ArrayList<>();
        for(Programmer programmer : programmers){
            if(programmer.getFavoriteLanguage().equals(Language.CPP) && programmer.getYearsExperience() > 5){
                namesOverFive.add(programmer.getName());
            }
        }
        System.out.println(namesOverFive);
    }
}
