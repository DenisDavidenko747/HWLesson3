public class Monax extends Unit{
    public Monax(String name) {
        super(12, 3, 4, 5, new int[]{-1, -3}, name);
    }


   public void castMana(){}

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Monax "+ name;
    }
}
