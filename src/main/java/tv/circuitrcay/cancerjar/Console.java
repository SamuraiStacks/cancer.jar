package tv.circuitrcay.cancerjar;



import java.util.Scanner;

public class Console {
   public static void main(String[] args) {
       System.out.println("CANCER.JAR™ by CircuitRCAY from WeirdDogDev");
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();

       if(s.equals("help")) {
           String help = "All the cancerous commands:\n"
                   + "succ - spams \"FREE SUCC\""
                   + "jvm - OOM's JVM";
           System.out.println(help);
       } if(s.equals("jvm")) {
           try {
               CancerShit.createUnsafe();
           } catch (Exception e) {
               e.printStackTrace();
           }
       } if(s.equals("succ")) {
            CancerShit.spamSucc();
       }
   }
}
