import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("festmenyek.csv"));
        Festmeny[] festmeny = new Festmeny[1000];
        int i = 0;
        while (sc.hasNext()) {
            String[] egysor = sc.nextLine().split(";");
            festmeny[i].cim = egysor[0];
            festmeny[i].festo = egysor[1];
            festmeny[i].stilus = egysor[2];
            i++;
        }
        sc.close();
        Random rnd = new Random();
        i = 0;
        while (i < 20) {

            i++;
        }
    }
}
