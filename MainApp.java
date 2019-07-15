import attack.BowAndArrow;

public class MainApp {

    public static void main(String[] args) {

        Castle castle = new Castle();

        FootSoldier chip = new FootSoldier();
        FootSoldier paul = new FootSoldier();
        MountedKnight ted = new MountedKnight();

        // You may add up to 12 lines of code here.
        castle.addObserver(chip);
        castle.addObserver(paul);
        castle.addObserver(ted);

        System.out.println("");
        castle.setUnderSiege(false);

        // Add 1 line of code here to change FootSoldier paul to attack with a bow and arrow.
        paul.setAttackBehavior(new BowAndArrow());

        System.out.println("");
        chip.move();
        ted.move();

        System.out.println("");
        castle.setUnderSiege(true);

        System.out.println("");
        castle.setUnderSiege(false);
    }
}
