package baitap4;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class BirthdayHelper {

    public static Child findNearestBirthday(List<Child> children) {
        LocalDate today = LocalDate.now();
        Child nearest = null;
        long minDays = Long.MAX_VALUE;

        for (Child child : children) {
            MonthDay birthday = MonthDay.from(child.getDateOfBirth());
            LocalDate nextBirthday = birthday.atYear(today.getYear());

            if (!nextBirthday.isAfter(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            long daysUntil = ChronoUnit.DAYS.between(today, nextBirthday);
            if (daysUntil < minDays) {
                minDays = daysUntil;
                nearest = child;
            }
        }

        return nearest;
    }
}