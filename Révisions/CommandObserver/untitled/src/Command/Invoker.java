package Command;

import java.util.Stack;

public class Invoker {
    private Stack<Command> history;

    public Invoker() {
        this.history = new Stack<Command>();
    }

    public void pushCommand(Command c) {
        c.execute();
        history.push(c);
    }

    public void popLastCommand() {
        if (!history.isEmpty()) { // Toujours vérifier si la pile n'est pas vide
            Command derniereCommande = history.pop(); // 1. Récupère et retire la commande
            derniereCommande.cancel(); // 2. Appelle son annulation
            System.out.println("Dernière action annulée.");
        } else {
            System.out.println("Aucune action à annuler.");
        }
    }

    public void getHistory() {
        Stack<Command> reverse = new Stack<Command>();
        while(!history.empty()) {
            reverse.push(history.pop());
        }

        while(!reverse.empty()) {
            System.out.println(reverse.pop());
        }
    }
}
