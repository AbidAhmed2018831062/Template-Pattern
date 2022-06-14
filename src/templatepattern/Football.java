package templatepattern;

public class Football extends Game{
    @Override
    void initialize() {
       System.out.println("Hey the most interesting sport has started");
        
    }

    @Override
    void mid() {
        System.out.println("Hey the most interesting sport has reached its mid point");
        
    }

    @Override
    void end() {
        System.out.println("Hey most interesting sport has ended");
        
    }
}
