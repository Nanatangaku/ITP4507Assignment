package Factory.Command.Hero;

import Hero.Hero;
import Hero.Warlock;
import Hero.Warrior;

public class HeroFactory {


    public Hero CreateHero(String HeroID,String HeroName,String HeroType){
 
        if(HeroType == null){
            return null;
        }
        if(HeroType.equalsIgnoreCase("1")){
            return new Warrior(HeroID,HeroName);
        }else if(HeroType.equalsIgnoreCase("2")){
          return new Warlock(HeroID,HeroName);
    }
    return null;
    }
}
