package tv.circuitrcay.cancerjar;

import sun.misc.Unsafe;

import java.lang.reflect.Constructor;

public class CancerShit {
    // From Natan#1289
    public static Unsafe createUnsafe() throws Exception {
        Constructor<Unsafe> ctor = Unsafe.class.getDeclaredConstructor();
        ctor.setAccessible(true);
        return ctor.newInstance();
    }
    // From Skweezi Leekz#2426
    public static void spamSucc() {
        for(int i=0; i<1000000; i++) {
            System.out.println("FREE SUCC!!!");
        }
    }
}
