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

    @Override
    public String toString() {
        return String.format("%10s%t%2d%t%10s", name, yearsExperience, favoriteLanguage);
    }
}