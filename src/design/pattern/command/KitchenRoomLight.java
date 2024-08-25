package design.pattern.command;

public class KitchenRoomLight implements Light {
    int level;
    @Override
    public void on() {
        level = 100;
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room light is OFF.");

    }

    @Override
    public void dim(int level) {
        System.out.println("Kitchen Room light dimmed to " + level + "%.");

    }

    public int getLevel() {
        return level;
    }
}
