public abstract class Unit implements inGameInterface{

    public float health;
    public float curHealth;
    public int attac;
    public int defend;
    public int speed;
    public String name;
    public int[] damage;

    public Unit(float health, int attac, int defend, int speed, int[] damage, String name) {
        this.health = this.curHealth = health;
        this.attac = attac;
        this.defend = defend;
        this.speed = speed;
        this.name = name;
        this.damage = damage;
    }

    public void getDamage(float damage){
        curHealth -= damage;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
