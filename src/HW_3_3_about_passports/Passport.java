package HW_3_3_about_passports;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String firstName;
    private final String name;

    private final String patronymic;

    private final String birthday;

    public Passport(int number, String firstName, String name, String patronymic, String birthday) {

        this.number = number;
        this.firstName = firstName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Номер паспорта " + number +
                ", ФИО " + firstName + " " + name + " " + patronymic +
                ", Дата рождения " + birthday;
    }
}
