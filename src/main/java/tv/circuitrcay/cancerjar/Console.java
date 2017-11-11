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

import java.io.IOException;
import java.util.Scanner;

public class Console {
   public static void main(String[] args) {
        System.out.println("Cancer.jar - the original");
        System.out.println("Type \"help\" for the good shit");
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
                   + "rickroll - you already know\n"
                   + "goodshit - the actual goodshit"
                   + "exit - exits this shit";
           System.out.println(help);
       } if(s.equals("jvm")) {
           try {
               CancerShit.createUnsafe().putInt(0, 0);
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
       } if(s.equals("exit")) {
           System.out.println("You've had enough?");
           System.exit(0);
       } if(s.equals("goodshit")) {
            CancerShit.goodshit();
       }
       run();
   }
}
