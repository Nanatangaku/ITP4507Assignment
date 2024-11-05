package Command;

public abstract class CanUndoCommand extends Command{

    public  void execute(){
        nowExecute();
        afterExecute();
    }

    public abstract void nowExecute();

    public  void afterExecute(){
        System.out.print("add to history command");
    };
    
    public abstract void undo();
}
