package HW_3_3_about_passports;

import java.util.HashSet;
import java.util.Set;

public class PassportServise {

    private final Set<Passport> passports = new HashSet<>();

    public void addPassport (Passport passport) {
        this.passports.add(passport);

    }

    public Passport searchNumber(Set<Passport> passports, int number) {
        for (Passport passport: passports) {
            if (passport.getNumber() == number) {
                return passport;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "PassportServise{" +
                "passports=" + passports +
                '}';
    }
}
