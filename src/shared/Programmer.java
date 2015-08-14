package shared;

import java.lang.Override;
import java.lang.String;

public class Programmer {
    private final String name;
    private final int yearsExperience;
    private final Language favoriteLanguage;

    public Programmer(String name, int yearsExperience, Language favoriteLanguage) {
        this.name = name;
        this.yearsExperience = yearsExperience;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }
    public int getYearsExperience() {
        return yearsExperience;
    }
    public Language getFavoriteLanguage() {
        return favoriteLanguage;
    }

    @Override
    public String toString() {
        return String.format("%-15s%2d%15s", name, yearsExperience, favoriteLanguage);
    }
}