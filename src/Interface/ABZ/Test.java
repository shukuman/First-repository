package Interface.ABZ;

import Interface.ABZ.Z;

public class Test {
    public static void main(String[] args) {
        Z object = new Z(); // доступ ко всем объектам, методам интерфейса А и В
        object.a();
        object.b();
        object.m();

        // char[] -> CharSequence -> String
        CharSequence text = "abc";

    }
}
