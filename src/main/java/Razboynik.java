public class Razboynik extends Unit{
    public Razboynik(String name) {
        super(10, 3, 2, 2, new int[]{-1, -3}, name);
    }

    @Override
    public void getDamage(float damage) {
        super.getDamage(damage);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Razboynik "+ name;
    }
}
