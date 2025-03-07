import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        this.pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile() {
        return this.pile;
    }

    public void newStack6(){
        pile.clear();
        for(int i = 0; i<= 6; i++){
            for(int j = i; j<= 6; j++){
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle(){
        ArrayList<Domino> newPile=new ArrayList<>(pile);
        Collections.shuffle(newPile);
        pile=newPile;
    }



}
