import java.util.ArrayList;

public class Razboynik extends Unit{
    public Razboynik(String name, int x, int y) {
        super(10, 3, 2, 2, new int[]{-1, -3}, name, x, y);
    }

    @Override
    public void getDamage(float damage) {
        super.getDamage(damage);
    }



    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance((tmp.coordinates)));
    }
}
