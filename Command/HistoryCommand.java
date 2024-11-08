package Command;



import java.util.Stack;

public class HistoryCommand {
    private Stack<CanUndoCommand> undoStack;
    private Stack<CanUndoCommand> redoStack;
    private Boolean redoing = false;
    public HistoryCommand(){
        undoStack = new Stack<CanUndoCommand>();
        redoStack = new Stack<CanUndoCommand>();
    }

    public void addCommand(CanUndoCommand command){
        if(redoing){
            redoStack.push(command);
            redoing = false;
        }else{
            undoStack.push(command);
        }
    }
    public void undoHisCmd(){
        if(undoStack.isEmpty()){
            System.out.println("No command to undo");
            return;
        }
        CanUndoCommand command = undoStack.pop();

        command.undo();
        redoStack.push(command);

    }

    public void redoHisCmd(){
        if(redoStack.isEmpty()){
            System.out.println("No command to redo");
            return;
        }
        redoing = false;
        CanUndoCommand command=redoStack.pop();
        command.execute();
       
    }
    public String getHis(){
   
        String his="";
        his+="Undo Stack:\n";
        for(CanUndoCommand command:undoStack){
            his+=command.toString()+"\n";
        }
        his+="Redo Stack:\n";
        for(CanUndoCommand command:redoStack){
            his+=command.toString()+"\n";
        }
        return his;
    }
}
