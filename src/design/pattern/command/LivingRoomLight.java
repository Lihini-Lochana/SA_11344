package design.pattern.command;


public class LivingRoomLight implements Light {
    int level;

    @Override
    public void on() {
        level = 100;
        System.out.println("Living Room light is ON at full brightness");
    }

    @Override
    public void off() {
        System.out.println("Living Room light is OFF");

    }

    @Override
    public void dim(int level) {
        System.out.println("Living Room light dimmed to " + level + "%.");

    }

    public int getLevel() {
        return level;
    }
}
