//"Inspired" by Monty Python's Search for the Holy Grail movie, Bridge of Death scene
import java.util.*;
public class Main {
public static void main(String[] args) {
  Scanner inputword = new Scanner(System.in);
  boolean userflung = false;
  boolean sirrobin = true;
  String lastcall = "John Young";
  Object[] answer = new Object[5];
  answer[0] = new String("Connie Booth");
  answer[1] = new String("Eric Idle");
  answer[2] = new String("Terry Gilliam");
  answer[3] = new String("John Cleese");
  answer[4] = new String("Michael Palin");
  while (userflung == false) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("YOU HAVE OPENED UP THE BRIDGE...I mean...PROGRAM OF DEATH!");
    System.out.println("What is your name?");
    answer[0] = inputword.nextLine();
    //Do not need to change
    System.out.println("\nWhat is your quest?");
    answer[1] = inputword.nextLine();
    //Do not need to change
    System.out.println("\nWhat is the capital of Assyria? (You don't need to use the funny symbols over vowels.)");
    answer[2] = inputword.nextLine();
    if ( !"Assur".equals(answer[2]) && !"Shubat-Enlil".equals(answer[2]) && !"Kalhu".equals(answer[2]) && !"Dur-Sharrukin".equals(answer[2]) && !"Nineveh".equals(answer[2]) && !"Harran".equals(answer[2])) {
      System.out.println("WRONG!, it is Assur, Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, or Harran (depending on the king and year).");
      userflung = true;
    }
    /*https://en.wikipedia.org/wiki/Assyria
    Any of these: Assur (aktushually Aššur), Shubat-Enlil, Kalhu, Dur-Sharrukin, Nineveh, Harran*/
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
      System.out.println("\nSIR " + answer[0] + ",");
      System.out.println("WHO IS ON A QUEST TO " + answer[1] + ",");
      System.out.println("May proceed, please enjoy your day.");
    }
    else{
    /*System.out.println("[Laughs in evil] You are no king, YOU FAIL! GOOD DAY SIR OR MADAM!");
    This is where I add a WEEEEEEEEEEEEEEEEEEEEEE*/
      fling();
    }
    userflung = false;
    if (lastcall.equals("N") || lastcall.equals("n")){
      lastcall = "Graham Chapman";
    }
  while ( !lastcall.equals("Y") && !lastcall.equals("N") && !lastcall.equals("y") &&!lastcall.equals("n")){ 
    System.out.println("\n\nWas that the last one?  (Y/N)");
    lastcall = inputword.nextLine();
    System.out.println("\n\n");
  }
  if (lastcall.equals("Y")|| lastcall.equals("y")){
    userflung = true;
  }
  sirrobin = true;
 }
}

static void fling() {
  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("           ");
  System.out.println(answer[0] + "____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println("           ");
  System.out.println(answer[0]);
  System.out.println("____________________________________");
  


  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println(answer[0]);
  System.out.println("           ");
  System.out.println("____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println(answer[0]);
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println(answer[0]);
  System.out.println("           ");
  System.out.println("____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println("           ");
  System.out.println(answer[0]);
  System.out.println("____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("____________________________________");



  System.out.print("\033[H\033[2J");
  System.out.flush();
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("           ");
  System.out.println("_______(poof gurgle gurgle)_________");
}



}