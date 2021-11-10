package Command;

public class LightOff implements Command{
    Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        light.Off();
    }

    @Override
    public void undo() {
        light.On();
    }
}
