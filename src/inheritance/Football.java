package inheritance;

public class Football extends Sport{
    private String league; //salies liga
    private String name; //komandos pavadinimas
    private int fansQuantity; //fanu kiekis;

    private int boughtTickets;

    public Football(double time, int team, String season, String league, String name, int fansQuantity) {
        super(time, team, season);
        this.league = league;
        this.name = name;
        this.fansQuantity = fansQuantity;

        this.boughtTickets = 1;
    }

    public void ticketAvalaible(int boughtTickets) {
        this.boughtTickets = boughtTickets;
        if(this.boughtTickets >= 10000){
            System.out.println("Nera laisvu vietu");
        }
        else {
            System.out.println("Dar yra laisvu vietu.");
        }
        System.out.println("Stadione yra 10000 vietu.");
    }

}

