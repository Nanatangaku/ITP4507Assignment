package Hero;

import Hero.Hero;
import Hero.Warlock;



public class WarlockMemento extends HeroMemento{
    private int mp;
    Warlock Warlock;

    public WarlockMemento(Warlock Warlock){

        this.Warlock = Warlock;
        this.mp =  Warlock.getMp();
        this.hp = Warlock.getHp();
        this.damage = Warlock.getDamage();
    }

    public void restore(){
        Warlock.setHp(hp);
        Warlock.setMp(mp);
        Warlock.setDamage(damage);
    }



}
