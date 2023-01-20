public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Weapon Sword = new Weapon();

        Sword.name = "sword slay";
        Sword.damage = 7;
        Sword.rarity = "Legendary";
        Sword.addDamage(10);

        Weapon Arrow = new Weapon();

        Arrow.name = "Arrow X";
        Arrow.damage = 7;
        Arrow.rarity = "Epic";
        
        System.out.println (Arrow.showNameRarity());

        Character Archer = new Character();
        Archer.name = "Eli";
        Archer.strength = 10;
        Archer.intelligence = 7;
        Archer.agility = 6;
        Archer.Attack();

    }
}
