package Interface.ABZ;

import Interface.ABZ.A;
import Interface.ABZ.B;

public class Z implements A, B {
    @Override
    public void m() {
        System.out.println("Some m output...");
    }
    @Override
    public void a() {
        System.out.println("Some a output...");
    }
    @Override
    public void b() {
        System.out.println("Some b output...");
    }
}
