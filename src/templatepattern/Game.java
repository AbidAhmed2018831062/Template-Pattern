package templatepattern;

public abstract class Game {
    abstract void initialize();//Strategy,Factory,Template,Composition, Chain of responsibility, Singleton
    abstract void mid();
    abstract void end();
    public final void play()
    {
        initialize();
        mid();
        end();
    }
}
