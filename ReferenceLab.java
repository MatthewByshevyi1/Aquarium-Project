public class ReferenceLab {

    public static void main(String[] args) {

        // ==================================================
        // EXPERIMENT A: ALIASING
        // ==================================================

        SeaCreature nemo = new Fish("Nemo", 5, 3, 1, "><>");
        SeaCreature copy = nemo;

        // PREDICT BEFORE RUNNING:
        // What will copy.getPosition() return after nemo.setPosition(25)?
        // It will return 25 because copy and nemo are point to the same location in memory

        nemo.setPosition(25);

        System.out.println("Experiment A - Aliasing");
        System.out.println("nemo position: " + nemo.getPosition());
        System.out.println("copy position: " + copy.getPosition());

        // The position of the copy was also 25 like I predicted because they both got changed
        // since they are technically the same object in memmory.

        // ==================================================
        // EXPERIMENT B: TWO DIFFERENT OBJECTS
        // ==================================================

        SeaCreature fish1 = new Fish("Fish", 10, 2, 1, "><>");
        SeaCreature fish2 = new Fish("Fish", 10, 2, 1, "><>");

        // PREDICT BEFORE RUNNING:
        // Will fish1 == fish2 be true or false?
        // It will be false since == measures if two objects point to the same location in memory.

        System.out.println();
        System.out.println("Experiment B - Separate Objects");
        System.out.println("fish1 == fish2: " + (fish1 == fish2));

        // It did turn out to be false because they didn't point to the same object in memory

        // ==================================================
        // EXPERIMENT C: ARRAY REFERENCES
        // ==================================================

        SeaCreature[] tank = new SeaCreature[5];
        tank[0] = new Fish("Bubbles", 8, 1, 1, "><((('>");

        SeaCreature selected = tank[0];

        // PREDICT BEFORE RUNNING:
        // What happens to tank[0] if selected is modified?
        // It would probably also change tank[0] since they are technically the same object

        selected.setPosition(35);

        System.out.println();
        System.out.println("Experiment C - Array References");
        System.out.println("selected position: " + selected.getPosition());
        System.out.println("tank[0] position: " + tank[0].getPosition());

        // It did make tank[0]'s position 35 since modifying selected also modified it due to shared location
    }
}
