
import java.time.LocalDate;
import java.time.Period;

public class Anglesage {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the year of birth from the user
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = Integer.parseInt(System.console().readLine());

        // Calculate the age
        Period age = Period.between(LocalDate.of(yearOfBirth, 1, 1), currentDate);

        // Print the age
        System.out.println("Your age as of today is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
    }
}
