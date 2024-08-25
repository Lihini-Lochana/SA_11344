package design.pattern.command;

public class LightDimCommand implements Command{

    Light light;
    int level;

     int prevBrightness;

    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.level = newBrightness;
    }

    @Override
    public void execute() {
        prevBrightness = light.getLevel();
        light.dim(level);
    }

    @Override
    public void undo() {
        light.dim(prevBrightness);
    }

}
