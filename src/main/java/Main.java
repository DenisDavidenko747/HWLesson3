import java.util.ArrayList;
import java.util.Random;
public class Main {

    private static String getName(){
    String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

    public static void main(String[] args) {
        Arbaletchik arbaletchik = new Arbaletchik(getName());

        ArrayList<Unit> team = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = new Random().nextInt(6);
            switch (val) {
                case 0 -> team.add(new Arbaletchik(getName()));
                case 1 -> team.add(new Kopeyshik(getName()));
                case 2 -> team.add(new Mag(getName()));
                case 3 -> team.add(new Monax(getName()));
                case 4 -> team.add(new Razboynik(getName()));
                case 5 -> team.add(new Sniper(getName()));
                case 6 -> team.add(new Krestyanin(getName()));
            }
            System.out.println(team.get(i).getInfo());
        }
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i).getInfo());
            }

//        ArrayList<Unit> list = new ArrayList<>();
//        team.add(new Arbaletchik(getName()));
//        list.add(new Monax(getName()));
//        list.get(0).getInfo();
//        list.forEach(n-> System.out.println(n.getInfo()));


        }
    }



