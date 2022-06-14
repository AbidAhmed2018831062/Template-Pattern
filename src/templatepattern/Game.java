package templatepattern;

public abstract class Game {
    abstract void initialize();
    abstract void mid();
    abstract void end();
    public final void play()
    {
        initialize();
        mid();
        end();
    }
}
