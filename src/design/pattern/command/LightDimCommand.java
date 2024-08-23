package design.pattern.command;

public class LightDimCommand implements Command{

    Light light;
    int brightness;


    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.brightness = newBrightness;
    }

    @Override
    public void execute() {
        light.dim(50);
    }

    @Override
    public void undo() {
        light.dim(100);
    }
}
