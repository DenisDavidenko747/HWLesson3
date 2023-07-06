public class Mag extends Unit{
    public Mag(String name) {
        super(10, 4, 3, 1, new int[]{-1, -3}, name);
    }

    @Override
    public String getInfo() {
        return "Mag "+ name;
    }
}
