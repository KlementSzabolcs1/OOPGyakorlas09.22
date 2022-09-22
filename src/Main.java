import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("festmenyek.csv"));
        Festmeny[] festmeny = new Festmeny[1000];
        while (sc.hasNext()) {
            int i = 0;
            String[] egysor = sc.nextLine().split(";");
            festmeny[i].cim = egysor[0];
            festmeny[i].festo = egysor[1];
            festmeny[i].stilus = egysor[2];

            i++;
        }
        sc.close();
    }
}
