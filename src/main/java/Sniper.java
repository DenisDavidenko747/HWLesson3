public class Sniper extends Unit{
    public Sniper(String name) {
        super(7, 4, 3, 1, new int[]{-1, -3}, name);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Sniper "+ name;
    }
}
