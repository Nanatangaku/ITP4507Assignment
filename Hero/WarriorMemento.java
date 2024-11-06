package Hero;

public class WarriorMemento extends HeroMemento{
    private int mp;
    Warrior warrior;

    public WarriorMemento(Warrior warrior){

        this.warrior = warrior;
        this.mp =  warrior.getDefencePoint();
        this.hp = warrior.getHp();
        this.damage = warrior.getDamage();
    }

    public void restore(){
        warrior.setHp(hp);
        warrior.setDefencePoint(mp);
        warrior.setDamage(damage);
    }
    
}
