package design.pattern.command;

public interface Light {
    void on();
    void off();
    void dim(int level);
    int getLevel();
}
