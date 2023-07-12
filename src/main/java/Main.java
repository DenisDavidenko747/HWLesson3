import java.util.ArrayList;
import java.util.Random;
public class Main {

    private static String getName(){
    String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Your  Team1: ");
        int teamCount = 4;
        Random rand = new Random();
        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = new Random().nextInt(4);
            switch (val) {
                case 0 : team1.add(new Arbaletchik(getName(),0, val+1)); break;
                case 1 : team1.add(new Kopeyshik(getName(),0,val+1)); break;
                case 2 : team1.add(new Mag(getName(),0,val+1)); break;
                case 3 : team1.add(new Monax(getName(),0,val+1));

            }
                System.out.println(team1.get(i).getInfo());
        }

        System.out.println("Your  Team2: ");
        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = new Random().nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Arbaletchik(getName(), 5, val + 1));
                case 1:
                    team2.add(new Kopeyshik(getName(), 5, val + 1));
                case 2:
                    team2.add(new Mag(getName(), 5, val + 1));
                case 3:
                    team2.add(new Monax(getName(), 5, val + 1));

            }
            System.out.println(team2.get(i).getInfo());
        }
            team1.forEach(n -> n.step(team2));



    }


}



