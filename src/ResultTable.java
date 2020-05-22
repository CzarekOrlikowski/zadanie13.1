import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResultTable {

    public static List<Result> buildResultTable() {
        List<Result> resultTable = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName = "";
        int points;
        String pointsToCheck = "";

        do {
            System.out.print("Podaj imię zawodnika lub stop: ");
            firstName = scanner.nextLine();
            if (!firstName.equals("stop")) {
                System.out.print("Podaj nazwisko zawodnika lub stop: ");
                lastName = scanner.nextLine();
                if (!lastName.equals("stop")) {
                    System.out.print("Ilość punktów lub stop: ");
                    pointsToCheck = scanner.nextLine();
                    if (!pointsToCheck.equals("stop")) {
                        points = Integer.valueOf(pointsToCheck);
                        resultTable.add(new Result(firstName, lastName, points));
                    }
                }
            }
        } while (!firstName.equals("stop") && !lastName.equals("stop") && !pointsToCheck.equals("stop"));
        scanner.close();
        return resultTable;
    }
}

