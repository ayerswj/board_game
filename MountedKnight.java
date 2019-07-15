import attack.BroadSword;
import defend.ArmoredShield;

public class MountedKnight extends GamePiece {

    public MountedKnight() {
        attackBehavior = new BroadSword();
        defendBehavior = new ArmoredShield();
        moveRate = 5;
    }

}
