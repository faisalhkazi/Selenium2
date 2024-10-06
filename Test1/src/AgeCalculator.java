import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {
        // Example birth date
        LocalDate birthDate = LocalDate.of(1991, 4, 27); // March 15, 1990

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate detailed age
        Age age = calculateDetailedAge(birthDate, currentDate);

        // Output the result
        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");
    }

    public static Age calculateDetailedAge(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate.isAfter(currentDate)) {
            throw new IllegalArgumentException("Birth date must be before or equal to current date");
        }

        // Calculate the period between the birth date and the current date
        Period period = Period.between(birthDate, currentDate);

        // Return detailed age
        return new Age(period.getYears(), period.getMonths(), period.getDays());
    }

    // Class to represent age in years, months, and days
    public static class Age {
        private final int years;
        private final int months;
        private final int days;

        public Age(int years, int months, int days) {
            this.years = years;
            this.months = months;
            this.days = days;
        }

        public int getYears() {
            return years;
        }

        public int getMonths() {
            return months;
        }

        public int getDays() {
            return days;
        }
    }
}