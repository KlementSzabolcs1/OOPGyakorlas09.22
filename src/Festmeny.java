import java.time.LocalDateTime;
import java.util.Date;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private Integer licitekSzama = 0;
    private Integer legmagasabbLicit = 0;
    private LocalDateTime legutolsoLicitIdeje;
    private Boolean elkelt = false;

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
}



