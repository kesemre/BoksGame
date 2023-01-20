public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Fighter(String name,int damage, int health, int weight,double dodge){
        this.damage=damage;
        this.weight=weight;
        this.name=name;
        this.health=health;
        if (dodge<=100 && dodge>=0){
            this.dodge=dodge;

        }
        else{this.dodge= 0 ;}
    }
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }
    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
