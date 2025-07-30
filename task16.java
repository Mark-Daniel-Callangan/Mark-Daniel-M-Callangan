 class Gorilla implements Animal {

    
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Gorilla is eating.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;
        }
    }

    
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed.");
    }

    
    public void pet() {
        // pet at your own risk
        System.out.println("You are trying to pet the gorilla...");
    }
}

public class task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);
        g.groom();
        g.pet();
    }
}