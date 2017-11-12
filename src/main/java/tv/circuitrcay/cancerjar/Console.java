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
                   + "jvm - crashes JVM\n"
                   + "notepad - surprise\n"
                   + "rickroll - you already know\n"
                   + "goodshit - the actual goodshit\n"
                   + "screamer - definitely not a prank\n"
                   + "copypasta - copypastas\n"
                   + "exit - exits this shit";
                   + "description - Description of this totally accurate";
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
       } if(s.equals("screamer")) {
            try {
                CancerShit.screamer();
            } catch (IOException e) {
                e.printStackTrace();
            }
       } if(s.equals("copypasta")) {
           System.out.println("Pick a number between 1-5");
           int is = scanner.nextInt();
           if(is == 1) {
               System.out.println("Hello am 48 year man from somalia. Sorry for my bed england. I selled my wife for internet connection for play \"conter stirk and i want to become the goodest player like you I play with 400 ping on brazil server and i am Global elite 2. pls no copy pasterino my story.");
           } else if(is == 2) {
               System.out.println("“wtf his ult did like 3k damage how is that legit” – leonardo da vinci 1496, founder of the Illuminati");
           } else if(is == 3) {
               System.out.println("Hello twitch chat. This is michaels mother speaking. Please stop the spam in the chat. I can’t read the amazing conversations that you are having about my son. Thanks. Don’t copy and paste this to spam more or I will tell Michael to ban you all.");
           } else if(is == 4) {
               System.out.println("I sexually Identify as an Attack Helicopter. Ever since I was a boy I dreamed of soaring over the oilfields dropping hot sticky loads on disgusting foreigners. People say to me that a person being a helicopter is Impossible and I’m fucking retarded but I don’t care, I’m beautiful. I’m having a plastic surgeon install rotary blades, 30 mm cannons and AMG-114 Hellfire missiles on my body. From now on I want you guys to call me “Apache” and respect my right to kill from above and kill needlessly. If you can’t accept me you’re a heliphobe and need to check your vehicle privilege. Thank you for being so understanding.");
           } else if(is == 5) {
               System.out.println("Gr8 b8, m8. I rel8, str8 appreci8, and congratul8. I r8 this b8 an 8/8. Plz no h8, I’m str8 ir8. Cre8 more, can’t w8. We should convers8, I won’t ber8, my number is 8888888, ask for N8. No calls l8 or out of st8. If on a d8, ask K8 to loc8. Even with a full pl8, I always have time to communic8 so don’t hesit8");
           } else {
               System.out.println("Ain't a number between 1-5 you twat!");
               return;
           }
       }
       run();
   }
}
