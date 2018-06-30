package inheritance;

public class Sport {

    private double time; //kiek trunka zaidimas
    private int team; //kiek zmoniu komandoje
    private String season; // kada zaidziamas

    private int seasonTicket;//bilieto kaina priklauso nuo sezono
    private boolean playHome; //zaidzia namie ar sveciouse

    //sukuriame konstruktoriu
    public Sport(double time, int team, String season) {
        this.time = time;
        this.team = team;
        this.season = season;

        this.seasonTicket = 0;
        this.playHome = true;
    }
    // metodas

    public void homeTicket(int price){
        seasonTicket = price;
        System.out.println("Bilieto kaina: " + getSeasonTicket() + " eu.");
    }

    public double getTime() {
        return time;
    }

    public int getTeam() {
        return team;
    }

    public String getSeason() {
        return season;
    }

    public int getSeasonTicket() {
        return seasonTicket;
    }

    public boolean isPlayHome() {
        return playHome;
    }

}

