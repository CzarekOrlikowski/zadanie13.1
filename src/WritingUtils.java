import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingUtils {


    public static void writeResult(String fileName, List tableResult) throws FileNotFoundException, IOException {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter dane = new BufferedWriter(fileWriter);
            Result tableToPrint = new Result(null, null, 0);

            for (int i = 0; i < tableResult.size(); i++) {
                tableToPrint = (Result) tableResult.get(i);
                String lineToPrint = tableToPrint.toString();
                dane.write(lineToPrint);
                dane.newLine();
            }
            dane.close();
        } catch (
                IOException e) {
            System.err.println("Błąd zapisu pliku!");
        }
    }
}