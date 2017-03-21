import java.io.Console;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // String couponType;
    Console consoleLine = System.console();

    System.out.println("Welcome to the Private Event Room Reservation app . Answer the following questions and we'll try to bring your dream party or event to reality ___");

    System.out.println("What is your name?");
    String theirName = consoleLine.readLine();

    System.out.println("Hi " + theirName + ". We charge upfront for the total number of people using the space for your event. How many people will be at the event, including you?");
    int guests = Integer.parseInt(consoleLine.readLine());

    System.out.println("Plese enter a numeral for the following question. How many platters of hors d'oeuvres will you need?");
    int hors=Integer.parseInt(consoleLine.readLine());

    System.out.println("Type 'yes' or 'no' for the next 6 questions. Do you want a magician?");
    String magician = consoleLine.readLine();

    System.out.println("Do you want a bartender?");
    String bartender = consoleLine.readLine();

    System.out.println("Do you want a band?");
    String band = consoleLine.readLine();

    System.out.println("Do you want a valet parking service?");
    String valet = consoleLine.readLine();

    System.out.println("Enter a numeral. If you are providing a meal to your guests, how much are you willing to spend per person ?");
    int levelOfFood = Integer.parseInt(consoleLine.readLine());

    System.out.println("Type 'yes' or 'no.' Do you have a coupon promocode ?");
    String haveCoupon = consoleLine.readLine();

    if (haveCoupon.equals("yes")){
      String couponType;
        System.out.println("Do you have the promocode 'matinee' or the promocode 'weekday'?");
        String userAnswersCouponType = consoleLine.readLine();
        if(userAnswersCouponType="matinee"){
          String couponType="matinee";
        }
        else{
          String couponType="weekday";
        }
    }
      else if (!haveCoupon.equals("yes")){
      String couponType="none";
    }
      else{
      }

    //Create theirParty object
    Event theirParty = new Event(guests, hors, magician, bartender, band, valet, levelOfFood, couponType);

    // Retrieve and name details
    int printGuests = theirParty.getNumberOfGuests();
    int printHD = theirParty.getHDFood();
    String printMagician = theirParty.getMagician();
    String printBartender = theirParty.getBartender();
    String printBand = theirParty.getBand();
    String printValet = theirParty.getValet();
    int printLevel = theirParty.getLevelOfFood();
    String printCouponType = theirParty.getCouponType();

    // Tell them the details
    System.out.println("These are your event details. Guests: " + printGuests + ". Hors d'oeuvres: " + printHD + ". Magician: " + printMagician + ". Bartender: " + printBartender + ". Band: " + printBand + ". Valet parking service: " + printValet + ". Amount spent on food per person: " + printLevel + ". Coupon: " + printCouponType + "." );
    // Retrieve and name cost
    theirParty.calculateCost();
    int printCost = theirParty.getCost();
    //Tell them the cost
    System.out.println("That will be $" + printCost);
    // System.out.println("That will be $" + printCost.toFixed([2]));
  }
}
