import java.util.ArrayList;

public abstract class Unit implements inGameInterface {

    public float health;
    public float curHealth;
    public int attac;
    public int defend;
    public int speed;
    public String name;
    public int[] damage;
    Coordinates coordinates;

    public Unit(float health, int attac, int defend, int speed, int[] damage, String name, int x, int y) {
        this.health = this.curHealth = health;
        this.attac = attac;
        this.defend = defend;
        this.speed = speed;
        this.name = name;
        this.damage = damage;
        coordinates = new Coordinates(x, y);
    }


    public void getDamage(float damage) {
        curHealth -= damage;
    }


    @Override
    public String getInfo() {
        return String.format("name:%s x:%d y:%d", name, coordinates.x, coordinates.y);
    }


    public Unit nearest(ArrayList<Unit> units) {
        double nearestDistance = Double.MAX_VALUE;
        Unit nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if (coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
            }
        } return nearestEnemy;


    }

    @Override
    public void step(ArrayList<Unit> units) {

    }
}
