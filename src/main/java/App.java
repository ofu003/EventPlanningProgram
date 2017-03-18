import java.io.Console;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console consoleLine = System.console();

    System.out.println("Welcome to the Private Event Room Reservation app . Answer the following questions and we'll try to bring your dream party or event to reality ___");

    System.out.println("What is your name?");
    String theirName = consoleLine.readLine();

    System.out.println("Hi " + theirName + ". We charge upfront for the total number of people using the space for your event. How many people will be at the event, including you?");
    int guests = Integer.parseInt(consoleLine.readLine());

    System.out.println("Plese enter a numeral for the following question. How many platters of hors d'oeuvres will you need?");
    int hors=Integer.parseInt(consoleLine.readLine());

    System.out.println("Type 'y' for yes and 'n' for no for the next 6 questions. Do you want a magician?");
    String magician = consoleLine.readLine();

    System.out.println("Do you want a bartender?");
    String bartender = consoleLine.readLine();

    System.out.println("Do you want a band?");
    String band = consoleLine.readLine();

    System.out.println("Do you want a valet parking service?");
    String valet = consoleLine.readLine();

    System.out.println("Enter a numeral. If you are providing a meal to your guests, how much are you willing to spend per person ?");
    int levelOfFood = Integer.parseInt(consoleLine.readLine());

    System.out.println("Type 'y' or 'n.' Do you have a coupon promocode ?");
    String haveCoupon = consoleLine.readLine();

    if (haveCoupon.equals "y"){
        System.out.println("Do you have a the promocode 'matinee' or the promocode 'weekday'?");
        String userAnswersCouponType = consoleLine.readLine();
        if(userAnswersCouponType="matinee"){
          String couponType="matinee";
        }
        else{
          String couponType="weekday";
        }
    }
      else{
      }
    else{
      couponType="none";
    }

    //Call constructor
    Event theirParty = new Event(guests, hors, magician, bartender, band, valet, levelOfFood, couponType);




    System.out.println(theirParty.mNumberOfGuests);
    System.out.println(theirParty.mHDFood);
    System.out.println(theirParty.mMagician);
    System.out.println(theirParty.mBartender);
    System.out.println(theirParty.mBand);
    System.out.println(theirParty.mValetParking);
    System.out.println(theirParty.mCoupon1);
    System.out.println(theirParty.mCoupon2);
    System.out.println(theirParty.mLevelOfFood);

    double theirPartyBookingCharge = theirParty.calculateCost();


    System.out.println(theirPartyBookingCharge);
  }
}
