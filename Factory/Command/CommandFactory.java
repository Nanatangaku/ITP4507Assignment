package Factory.Command;
import java.util.Scanner;

import Command.Command;
public abstract class CommandFactory {

    protected Scanner scanner;
    
        public abstract Command createCommand();
    
        public CommandFactory(Scanner scanner) {
            if(scanner==null)
                throw new IllegalArgumentException("Scanner cannot be null");
            this.scanner=scanner;
    }
}
