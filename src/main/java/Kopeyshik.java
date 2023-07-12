import java.util.ArrayList;

public class Kopeyshik extends Unit{
    public Kopeyshik(String name, int x, int y) {
        super(10,3,2, 1, new int[]{-1, -3}, name, x, y);
    }


    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance((tmp.coordinates)));
    }
}
