 class Event {

    public int mNumberOfGuests;
    public int mHDFood;
    public String mMagician;
    public String mBartender;
    public String mBand;
    public String mValetParking;
    public String mCoupon1;
    public String mCoupon2;
    public int mLevelOfFood;


    //constructor
    public Event (int guests, int hors, String magician, String bartender, String band, String valet, int levelOfFood, String couponType  ){
      mNumberOfGuests=guests;
      mHDFood=hors;
      mMagician=magician;
      mBartender=bartender;
      mBand=band;
      mValetParking=valet;
      mLevelOfFood=levelOfFood;
      mCouponType=couponType;
    }


    public int returnANumber(int numberOfGuests){
        return numberOfGuests;
    }


    public double calculateCost (int guests, int hors, String magician, String bartender, String band, String valet, int levelOfFood, String couponType ) {
      Integer totalCost=0;
      int magicianIncrement=0;
      int bartenderIncrement=0;
      int bandIncrement=0;
      int valetIncrement=0;

      int bookingCharge= guests*5;
      int horsCharge= hors*15;
      int  levelOfFoodCharge= levelOfFood * guests;
      if (magician.equals("y")){
        int magicianIncrement = 120;
      }
      else{}
      if (bartender.equals("y")){
        int bartenderIncrement=100;
      }
      else{}
      if (band.equals("y")){
        int bandIncrement=200;
      }
      else{}
      if (valet.equals("y")){
        int valetIncrement=50;
      }
      else{}
      Integer totalCost=magicianIncrement+bartenderIncrement+bandIncrement+valetIncrement+bookingCharge+horsCharge+lelevelOfFoodCharge;

    }


    public double applyCoupon(Integer totalCost){
      double costAfterCoupon=0;
        if (couponType.equals("matinee")){
          costAfterCoupon=totalCost*0.85;
        }
        else if (couponType.equals("weekday")){
          costAfterCoupon=totalCost*0.7;
        }
        else {
          costAfterCoupon=totalCost;
        }
        return costAfterCoupon;
    }

  }
