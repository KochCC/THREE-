//"Inspired" by Monty Python's Search for the Holy Grail movie, Bridge of Death scene
import java.util.*;
public class Main {
  static void clrscrn() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  static void timerone(){
    long startTime = System.currentTimeMillis();
    long elapsedTime = 0;
    while (elapsedTime < 1000){
      elapsedTime = (new Date()).getTime() - startTime;
    }
  }
  static void timertwo(){
    long startTime = System.currentTimeMillis();
    long elapsedTime = 0;
    while (elapsedTime < 5000){
      elapsedTime = (new Date()).getTime() - startTime;
    }
  }
  
  static void bridge(String[] answer) { //4 layers each
    clrscrn();
    System.out.println("\n\n\n" + answer[0] + "____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n\n   "+ answer[0]+ "\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n       " + answer[0] + "\n\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("             "+ answer[0] + "\n\n\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n               " + answer[0] + "\n\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n\n               "+ answer[0]+ "\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n\n\n____________________________________");
    timerone();
    clrscrn();
    System.out.println("\n\n\n_______(poof gurgle gurgle)_________");
  }
  public static void main(String[] args) {
    Scanner inputword = new Scanner(System.in);
    boolean userflung = false;
    boolean sirrobin = true;
    String lastcall = "afe";
    String[] answer = {"Connie Booth", "Eric Idle", "Terry Gilliam", "John Cleese", "Michael Palin"};
    while (userflung == false) {
      clrscrn();
      System.out.println("YOU HAVE OPENED UP THE BRIDGE...I mean...PROGRAM OF DEATH!");
      System.out.println("Now read up, and take notes.  This will be important.");
      System.out.println("The Assyrian Empire was around for just under two millenia.");
      System.out.println("In the meantime, they had a few captials listed below:");
      System.out.println("Assur, Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, and Harran.");
      System.out.println("Also, the Eurpean swallow can fly at roughly 45 kpm.");
      System.out.println("Are you ready? (Y/N)");
      while ( !lastcall.equals("Y") && !lastcall.equals("y")){
        lastcall = inputword.nextLine();
        if ( !lastcall.equals("Y") && !lastcall.equals("y")){
          System.out.println("How about now?");
        }
      }
      lastcall = "afe";
      clrscrn();
      System.out.println("What is YOUR name?");
      answer[0] = inputword.nextLine();
      System.out.println("\nWhat is YOUR quest?");
      answer[1] = inputword.nextLine();
      System.out.println("\nWhat is the capital of Assyria? (You don't need to use the funny symbols over vowels.)");
      answer[2] = inputword.nextLine();
      if ( !"Assur".equals(answer[2]) && !"Shubat-Enlil".equals(answer[2]) && !"Kalhu".equals(answer[2]) && !"Dur-Sharrukin".equals(answer[2]) && !"Nineveh".equals(answer[2]) && !"Harran".equals(answer[2])) {
        System.out.println("WRONG!, it is Assur, Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, or Harran (depending on the king and year).");
        timertwo();
        userflung = true;
      }
      /*https://en.wikipedia.org/wiki/Assyria
      Any of these: Assur (aktushually Aššur), Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, Harran
      */
      if (userflung == false){
        System.out.println("\nWhat is the airspeed of the unlaiden European swallow in whole kilometers per hour?");
        answer[3] = inputword.nextLine();
        if ( !"45".equals(answer[3])){
          System.out.println("WRONG! It is not " + answer[3] + ", it is, rounded in KPM, 45!");
          userflung = true;
        }
      }
      /*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
      28 mph is roughly 12.5 m/s...45 kph*/
      //RegExpObject.test(answer[3])
      if (userflung == false){
        System.out.println("\nWhat is the airspeed of the unladen African swallow in whole kilometers per hour?");
        answer[4] = inputword.nextLine();
        if ( !"34".equals(answer[4])){
          System.out.println("WRONG! It is not " + answer[4] + ", it is, rounded in KPM, 34!");
          userflung = true;
        }
      }
      /*use https://www.quora.com/What-is-the-air-speed-velocity-of-an-unladened-sparrow
      21 mph...33.8 kph*/
      if (userflung == false){
        sirrobin = false; //if user not flung, then user is not Sir Robin
      }
      if ( sirrobin == false){
        System.out.println("\nSIR " + answer[0] + "!");
        System.out.println("WHO IS ON A QUEST TO " + answer[1] + "!");
        System.out.println("May proceed, please enjoy your day m'lord.");
      }
      else{
        timertwo();
        System.out.println("[Laughs in evil] You are no king, YOU FAIL! GOOD DAY SIR OR MADAM!");
        timertwo();
        bridge(answer);
      }
      userflung = false;
      if (lastcall.equals("N") || lastcall.equals("n")){
        lastcall = "Graham Chapman";
      }
      while ( !lastcall.equals("Y") && !lastcall.equals("N") && !lastcall.equals("y") &&!lastcall.equals("n")){ 
        System.out.println("\n\nWas that the last one?  (Y/N)");
        lastcall = inputword.nextLine();
      }
      if (lastcall.equals("Y")|| lastcall.equals("y")){
        userflung = true;
      }
      sirrobin = true;
    }
  }
}