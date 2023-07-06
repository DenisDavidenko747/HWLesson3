public class Arbaletchik extends Unit{
    public Arbaletchik(String name) {
        super(10, 3, 2, 3, new int[]{-1, -3}, name);
    }

    @Override
    public String getInfo() {
        return "Arbaletchik "+ name;
    }
}
