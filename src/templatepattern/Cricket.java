package templatepattern;

public class Cricket extends Game {

    @Override
    void initialize() {
       System.out.println("Hey the game of gentleman has started");
        
    }

    @Override
    void mid() {
        System.out.println("Hey the game of gentleman has reached its mid point");
        
    }

    @Override
    void end() {
        System.out.println("Hey the game of gentleman has ended");
        
    }
    
    
}
