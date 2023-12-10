public class Player {
    private String name;

    private Die die;

    public Player(String name, Die die){
        this.name = name;
        this.die = die;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public Die getDie() {return this.die;}
    public void setDie(Die die) {this.die = die;}

    @Override
    public String toString() {
        return "Player " + this.name + " rolled a " + die.getValue() + " on a " + die.getNumSides() + "-sided dice.";
    }

}
