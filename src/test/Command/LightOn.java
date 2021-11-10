package Command;

public class LightOn implements Command{
    Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        light.On();
    }

    @Override
    public void undo() {
        light.Off();
    }
}
