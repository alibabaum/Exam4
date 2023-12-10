import java.util.concurrent.ThreadLocalRandom;
public class Die {

    private int numSides;
    private int value;

    public Die (int numSides, int value) {
        this.numSides = 6;
        this.value = 1;

    }

    public int getValue() {return this.value;}

    public int getNumSides(){return this.numSides;}

    public void setValue(int value){this.value = value; }

    public void setNumSides(int numSides){ this.numSides = numSides; }

    public int roll(int numSides){
        this.value = ThreadLocalRandom.current().nextInt(1,numSides);
        return this.value;
    }

}

