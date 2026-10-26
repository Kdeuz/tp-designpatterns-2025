package state;

public abstract class DigicodeState {
    public void handle(Digicode context, char c){
        System.out.println("Mdp erroné");
        context.setState(new DigicodeStateNotOk());
    };
}
