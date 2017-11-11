package tv.circuitrcay.cancerjar;

import java.io.IOException;
import java.util.Scanner;

public class Console {
   public static void main(String[] args) {
       System.out.println("Cancer.jar - the original");
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       if(s.equals("help")) {
           String help = "All the cancerous commands:\n"
                   + "succ - spams \"FREE SUCC\"\n"
                   + "jvm - OOM's JVM\n"
                   + "notepad - surprise";
           System.out.println(help);
       } if(s.equals("jvm")) {
           try {
               CancerShit.createUnsafe();
           } catch (Exception e) {
               e.printStackTrace();
           }
       } if(s.equals("succ")) {
            CancerShit.spamSucc();
       } if (s.equals("notepad")) {
           try {
               CancerShit.notepad();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       main(args);
   }
}
