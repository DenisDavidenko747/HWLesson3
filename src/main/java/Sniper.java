import java.util.ArrayList;

public class Sniper extends Unit{
    public Sniper(String name, int x, int y) {
        super(7, 4, 3, 1, new int[]{-1, -3}, name, x, y);
    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance((tmp.coordinates)));
    }
}
