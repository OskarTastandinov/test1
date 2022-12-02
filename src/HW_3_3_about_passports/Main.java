package HW_3_3_about_passports;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Passport ivanov = new Passport(123456, "Иванов", "Иван", "Иванович", "25.05.2001");
        Passport sidorov = new Passport(123458, "Сидоров", "Петр", "Петрович", "23.06.2000");
        Passport petrov = new Passport(123453, "Петров", "Олег", "Николаевич", "20.02.2003");

        final Set<Passport> passports = new HashSet<>();
        passports.add(ivanov);
        passports.add(sidorov);
        passports.add(petrov);


        System.out.println(passports);

        PassportServise ps = new PassportServise();
        System.out.println(ps.searchNumber(passports, 123453));


    }
}
