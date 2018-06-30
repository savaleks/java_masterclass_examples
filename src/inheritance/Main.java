package inheritance;

public class Main {
    public static void main(String[] args) {
        Win win = new Win("lyja", 7000);
        System.out.println("Tikimybe laimeti priklauso nuo daug dalyku.");
        System.out.println("Siandien " + win.getWeather() + ", komandoje yra " + win.getTeam() +
                " zaideju ir " + win.getBetToWin() + " sirgaliu stadione.");
        win.beting();
        System.out.println("-------------");
        win.ticketAvalaible(5000);
        win.homeTicket(45);

    }
}
