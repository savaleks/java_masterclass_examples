package inheritance;

public class Win extends Football {

    private String weather;
    private int betToWin;

    public Win(String weather,int betToWin) {
        super( 1.30, 12, "vasara", "pirma", "Zalgiris", 20000);
        this.weather = weather;
        this.betToWin = betToWin;
    }

    public void beting(){
        String weatherCondition = weather;
        int fansInStadium = betToWin;
        if(weatherCondition == "lyja"){
            System.out.println("Nedaug sansu laimeti.");
        }
        else if(fansInStadium > 5000&&fansInStadium<7000&& weatherCondition == "sauleta"){
            System.out.println("Didele tikimybe kad komanda laimes.");
        }
        else if(fansInStadium >= 7000&&weatherCondition == "sauleta"){
            System.out.println("Labai didele tikimybe laimeti.");
        }
        else {
            System.out.println("Maza tikimybe kad komanda laimes.");
        }
    }

    public String getWeather() {
        return weather;
    }

    public int getBetToWin() {
        return betToWin;
    }
}
