package Objects_classes;

public class DrumKitTest {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        if(d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
