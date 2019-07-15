import attack.AttackBehavior;
import defend.DefendBehavior;


public abstract class GamePiece implements Observer {

    protected AttackBehavior attackBehavior;
    protected DefendBehavior defendBehavior;

    int moveRate;

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }


    public void setDefendBehavior(DefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
    }

    public void move() {
        System.out.println("Move " + moveRate + " spaces.");
    }

    public void attack() {
        this.attackBehavior.attack();
    }

    public void defend() {
        this.defendBehavior.defend();
    }

    @Override
    public void takeAction(boolean castleUnderSiege) {

        if (castleUnderSiege) {
            this.defend();
        }
        else {
            this.attack();
        }

    }

}
