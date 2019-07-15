import attack.Axe;
import defend.WoodenShield;

public class FootSoldier extends GamePiece {

    public FootSoldier() {
        attackBehavior = new Axe();
        defendBehavior = new WoodenShield();
        moveRate = 2;
    }

}
