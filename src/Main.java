import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("festmenyek.csv"));
        Festmeny[] festmeny;
        while (sc.hasNext()) {
            String[] egysor = sc.nextLine().split(";");


        }
        sc.close();
    }
}
