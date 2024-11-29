import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rental start time (in hours): ");
        int startTime = scanner.nextInt();

        System.out.print("Enter rental end time (in hours): ");
        int endTime = scanner.nextInt();

        System.out.print("Enter kilometers driven: ");
        double kilometersDriven = scanner.nextDouble();

        System.out.print("Enter rate per hour: ");
        double ratePerHour = scanner.nextDouble();

        System.out.print("Enter rate per kilometer: ");
        double ratePerKilometer = scanner.nextDouble();

        int rentalHours = endTime - startTime;
        double rentalPrice = (rentalHours * ratePerHour) + (kilometersDriven * ratePerKilometer);

        System.out.println("Rental Hours: " + rentalHours);
        System.out.println("Kilometers Driven: " + kilometersDriven);
        System.out.println("Total Rental Price: " + rentalPrice);
    }
}