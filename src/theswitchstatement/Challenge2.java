package theswitchstatement;

public class Challenge2 {
    public static void main(String[] args) {

        String word = "hOMe";

        switch(word.toLowerCase()){
            case "home":
                System.out.println("you print: home");
                break;
            case "garden":
                System.out.println("you print garden");
                break;
            default:
                System.out.println("unknown word");
                break;
        }
    }
}
//output 'you print: home'
