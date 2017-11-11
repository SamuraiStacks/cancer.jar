package tv.circuitrcay.cancerjar;

import java.io.IOException;
import java.util.Scanner;

public class Console {
   public static void main(String[] args) {
        System.out.println("Cancer.jar - the original");
        run();
   }
   private static void run() {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       if(s.equals("help")) {
           String help = "All the cancerous commands:\n"
                   + "succ - spams \"FREE SUCC\"\n"
                   + "jvm - OOM's JVM\n"
                   + "notepad - surprise\n"
                   + "rickroll - you already know";
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
       } if(s.equals("credits")) {
           String credits = "Credits go to: \n"
                   + "Natan#1289 - the idea of the \"jvm\" command \n"
                   + "Kodehawa#3457 - extended idea of the \"notepad\" command \n"
                   + "Skweezi Leekz#2426 - the idea of the \"succ\" command \n"
                   + "Github: https://github.com/weirddogdev/cancer.jar";
           System.out.println(credits);
       } if(s.equals("rickroll")) {
            try {
                CancerShit.rickroll();
            } catch (IOException e) {
                e.printStackTrace();
            }
       }
       run();
   }
}
