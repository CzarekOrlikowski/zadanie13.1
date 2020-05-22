import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Result> resultList = ResultTable.buildResultTable();
        Collections.sort(resultList);
        System.out.println(resultList);
        WritingUtils.writeResult("wyniki.csv", resultList);
        System.out.println("Dane zapisane i posortowane!");
    }
}
