public class Kopeyshik extends Unit{
    public Kopeyshik(String name) {
        super(10,3,2, 1, new int[]{-1, -3}, name);
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Kopeyshik "+ name;
    }
}
