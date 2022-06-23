package Bai6;

import java.util.ArrayList;

public class Chinh {
    public static void main(String[] args) {
        ArrayList<Daddy> d = new ArrayList<>();
        d.add(new ConA());
        d.add(new ConB());
        d.add(new Daddy());
        ConA a = (ConA)d.get(2);
        d.set(2, a);

    }
}
