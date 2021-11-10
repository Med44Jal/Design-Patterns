package Command;

public class Remote {
    Command cmd;

    public Remote() { }

    public void setCommand(Command command){
        cmd = command;
    }

    public void buttonPressed(){
        cmd.execute();
    }

    public void buttonUndo(){
        cmd.undo();
    }
}
