import java.util.ArrayList;

public class Monax extends Unit{
    public Monax(String name, int x, int y) {
        super(12, 3, 4, 5, new int[]{-1, -3}, name, x, y);
    }


   public void castMana(){}



    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance((tmp.coordinates)));
    }
}
