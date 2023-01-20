public class Weapon {
    String name;
    int damage;
    String rarity;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMydamage() {
        System.out.println("My damage is " + damage);
    }

    public void sayMyrarity() {
        System.out.println("My rarity is " + rarity);
    }

    public void addDamage (int additionalDamage) {
        int newDamage = this.damage + additionalDamage;
        System.out.println("Damage increased from " + this.damage + " to " + newDamage);
        this.damage = newDamage;
    }

    String showNameRarity () {
        return this.name + " " + this.rarity;
    }



 

}

