public class Krestyanin extends Unit{
    public Krestyanin(String name) {
        super(7, 1, 1, 1, new int[]{-1, -3}, name);
    }

    @Override
    public String getInfo() {
        return "Krestyanin "+ name;
    }
}

