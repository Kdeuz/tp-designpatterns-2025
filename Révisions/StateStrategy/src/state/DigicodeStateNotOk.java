package state;

public class DigicodeStateNotOk extends DigicodeState{
    @Override
    public void handle(Digicode context, char c) {
        System.out.println("Le mdp est erroné");
    }
}
