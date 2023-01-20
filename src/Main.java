public class Main {
    static boolean yaziTura(){
        double x =Math.random()*100;
        if(x<50){return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        Match match;
        Fighter Mike = new Fighter("Mike" , 15 , 100, 90, 50);
        Fighter Ali = new Fighter("ALİ" , 10 , 95, 100, 75);
        if(yaziTura()){
            match = new Match(Ali,Mike , 90 , 100);
        }
        else{
            match = new Match(Mike,Ali, 90 , 100);}

        match.run();

    }
}