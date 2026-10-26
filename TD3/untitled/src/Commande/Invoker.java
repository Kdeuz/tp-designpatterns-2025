package Commande;

import java.util.Stack;

public class Invoker {
    private static Stack<Command> historyStack = new Stack<>();
    private static Stack<Command> undoStack = new Stack<>();

    public static void storeCommand(Command command) {
        historyStack.push(command);
        command.execute();
    }

    public static void undo() {
        Command command = historyStack.pop();
        undoStack.push(command);
        command.undo();
    }
}
