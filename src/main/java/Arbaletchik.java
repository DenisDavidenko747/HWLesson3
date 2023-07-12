import java.util.ArrayList;

public class Arbaletchik extends Unit{
    public Arbaletchik(String name, int x, int y) {
        super(10, 3, 2, 3, new int[]{-1, -3}, name, x, y);
    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance((tmp.coordinates)));
    }
}

