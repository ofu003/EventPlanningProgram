import java.io.Console;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console consoleLine = System.console();

    System.out.println("Welcome to the Event Party Planning app. Answer the following questions and we'll try to bring your dream party or event to reality __________________________");

    System.out.println("What is your name?");
    String theirName = consoleLine.readLine();

    System.out.println("Hi " + theirName + ". How many people will be at the event, including you?");
    int guests = Integer.parseInt(consoleLine.readLine());

    // System.out.println("Plese enter a numeral for the following question. How many platters of hors d'oeuvreswill you need?");
    // int hors=Integer.parseInt(consoleLine.readLine());
    //
    // System.out.println("Type 'y' for yes and 'n' for no for the next 6 questions. Do you want a magician?");
    // String magician = consoleLine.readLine();
    //
    // System.out.println("Do you want a bartender?");
    // String bartender = consoleLine.readLine();
    //
    // System.out.println("Do you want a band?");
    // String band = consoleLine.readLine();
    //
    // System.out.println("Do you want a valet parking service?");
    // String valet = consoleLine.readLine();
    //
    // System.out.println("coupon1?");
    // String coupon1 = consoleLine.readLine();
    //
    // System.out.println("coupon2?");
    // String coupon2 = consoleLine.readLine();
    //
    // System.out.println("Enter a numeral. levelOfFood?");
    // int levelOfFood = Integer.parseInt(consoleLine.readLine());
    //
    //
    // Event theirParty = new Event(guests, hors, magician, bartender, band, valet, coupon1, coupon2, levelOfFood );
    //
    Event theirParty = new Event(guests);



    // System.out.println(theirParty.mNumberOfGuests);
    // System.out.println(theirParty.mHDFood);
    // System.out.println(theirParty.mMagician);
    // System.out.println(theirParty.mBartender);
    // System.out.println(theirParty.mBand);
    // System.out.println(theirParty.mValetParking);
    // System.out.println(theirParty.mCoupon1);
    // System.out.println(theirParty.mCoupon2);
    // System.out.println(theirParty.mLevelOfFood);
    double theirPartyBookingCharge = theirParty.calculateCost(guests);
    
    System.out.println(theirPartyBookingCharge);
  }
}
