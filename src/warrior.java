//search หาข้อมูลในgoogle
public interface warrior {
    double attack(warrior enemy);
    double getHp();

    void setHp(double enemyHp);
    String getName();
}



class Swordsmen implements warrior,accessories{
    String name;
    double hp = 100;
    double speed = 100;
    String wearing;
    public void wear(){
        System.out.println(name +" is wearing sock.");
    }
    public double speedUp(double currentSpeed){
        System.out.println("speed: "+currentSpeed);
        return currentSpeed*2;
    }

    Swordsmen(String name,double hp,double speed,String wearing){
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.wearing = wearing;
    }
    public double attack(warrior enemy){
        double damage=10;
        System.out.println("damage: "+ damage);
        double enemyHp = enemy.getHp();
        enemyHp = enemyHp - damage;
        enemy.setHp(enemyHp);
        System.out.println(enemy.getName()+" :"+ enemyHp);
        return enemyHp;
    }
    public double getHp(){
        return hp;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public String getName(){
        return name;
    }
}





class Archer implements warrior,accessories{
    String name;
    double hp = 100;
    double speed = 100;
    String wearing;


    public void wear(){
        System.out.println(name +" is wearing Glove.");
    }
    public double speedUp(double currentSpeed){
        System.out.println("speed "+ currentSpeed);
        return currentSpeed;
    }


    Archer(String name,double hp,double speed,String wearing){
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.wearing = wearing;
    }
    public double attack(warrior enemy){
        double damage=5;
        if(wearing.equals("glove")){
            damage = damage*2;
            System.out.println("damage: "+damage);
        }
        double enemyHp = enemy.getHp();
        enemyHp = enemyHp - damage;
        enemy.setHp(enemyHp);
        System.out.println(enemy.getName()+" :"+ enemyHp);
        return enemyHp;
    }
    public double getHp(){
        return hp;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public String getName(){
        return name;
    }
}





class Character {
    public static void main(String[] args) {

        /*การเลือกสวมอุปกรณ์
        Swordsmen
            damage: -10
            accessesorier: sock(up speed)
        Archer
            damage: -5
            accessesorier: glove(up damage)
         */


        //กรณีอาชีพต่างกัน
        System.out.println("----------CHARACTOR----------");
        warrior pp = new Swordsmen("pp",100,100,"Sock");
        warrior joy = new Archer("joy",100,100,"glove");

        accessories glove = new Glove();//Archer
        accessories sock = new Sock();//Swordsmen

        ((Swordsmen) pp).wear();
        ((Swordsmen) pp).speed = sock.speedUp(((Swordsmen) pp).speed);
        System.out.println("speed: "+ ((Swordsmen) pp).speed);

        ((Archer) joy).wear();
        ((Archer) joy).speed= glove.speedUp(((Archer) joy).speed);
        System.out.println("speed: "+ ((Archer) joy).speed);

        System.out.println("----------START FIGHTING----------");
        joy.attack(pp);
        pp.attack(joy);


        //กรณีอาชีพต่าง
        /*warrior pp = new Archer("pp",100,100,"glove");
        warrior joy = new Swordsmen("joy",100,100,"glove");

        accessories glove = new Glove();//Archer
        accessories sock = new Sock();//Swordsmen

        ((Archer) pp).wear();
        ((Archer) pp).speed = glove.speedUp(((Archer) pp).speed);
        System.out.println("speed: "+ ((Archer) pp).speed);

        ((Swordsmen) joy).wear();
        ((Swordsmen) joy).speed= sock.speedUp(((Swordsmen) joy).speed);
        System.out.println("speed: "+ ((Swordsmen) joy).speed);

        System.out.println("----------START FIGHTING----------");
        joy.attack(pp);
        pp.attack(joy);*/



        //กรณีอาชีพเหมือนกัน Archer
        /*System.out.println("----------CHARACTOR----------");
        warrior pp = new Archer("pp",100,100,"glove");
        warrior joy = new Archer("joy",100,100,"glove");

        accessories glove = new Glove();//Archer
        accessories sock = new Sock();//Swordsmen

        ((Archer) pp).wear();
        ((Archer) pp).speed = glove.speedUp(((Archer) pp).speed);
        System.out.println("speed: "+ ((Archer) pp).speed);

        ((Archer) joy).wear();
        ((Archer) joy).speed= glove.speedUp(((Archer) joy).speed);
        System.out.println("speed: "+ ((Archer) joy).speed);

        System.out.println("----------START FIGHTING----------");
        joy.attack(pp);
        pp.attack(joy);*/



        //กรณีอาชีพเหมือนกัน Swordsmen
        /*System.out.println("----------CHARACTOR----------");
        warrior pp = new Swordsmen("pp",100,100,"glove");
        warrior joy = new Swordsmen("joy",100,100,"glove");

        accessories glove = new Glove();//Archer
        accessories sock = new Sock();//Swordsmen

        ((Swordsmen) pp).wear();
        ((Swordsmen) pp).speed = sock.speedUp(((Swordsmen) pp).speed);
        System.out.println("speed: "+ ((Swordsmen) pp).speed);

        ((Swordsmen) joy).wear();
        ((Swordsmen) joy).speed= sock.speedUp(((Swordsmen) joy).speed);
        System.out.println("speed: "+ ((Swordsmen) joy).speed);

        System.out.println("----------START FIGHTING----------");
        joy.attack(pp);
        pp.attack(joy);*/

    }
}
