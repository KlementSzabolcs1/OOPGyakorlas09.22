import java.time.LocalDateTime;
import java.util.Date;

public class Festmeny {
    public String cim;
    public  String festo;
    public String stilus;
    public Integer licitekSzama = 0;
    public Integer legmagasabbLicit = 0;
    public LocalDateTime legutolsoLicitIdeje;
    public Boolean elkelt = false;

    public String getFesto() {
        return this.festo = festo;
    }
    public String getStilus() {
        return this.stilus = stilus;
    }
    public Integer getLicitekSzama() {
        return this.licitekSzama = licitekSzama;
    }
    public Integer getLegmagasabbLicit() {
        return this.legmagasabbLicit = legmagasabbLicit;
    }
    public LocalDateTime getLegutolsoLicitIdeje() {
        return this.legutolsoLicitIdeje = legutolsoLicitIdeje;
    }
    public Boolean getElkelt() {
        return this.elkelt = elkelt;
    }
    public void setElkelt() {
        elkelt = true;
    }
    public void licit() {
        if (elkelt = true) {
            System.err.println("A festmény már elkelt!");
        }
        else if (licitekSzama == 0) {
            licitekSzama++;
            legutolsoLicitIdeje = LocalDateTime.now();
            legmagasabbLicit = 100;
        }
        else {
            licitekSzama++;
            int seged = 0;
            seged = legmagasabbLicit / 10;
            legmagasabbLicit += seged;
            legutolsoLicitIdeje = LocalDateTime.now();
        }
    }

    @Override
    public String toString() {

        return super.toString();
    }
}



