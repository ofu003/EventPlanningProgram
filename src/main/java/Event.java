class Event {
  // list attributes
  private int mNumberOfGuests;
  private int mHDFood;
  private String mMagician;
  private String mBartender;
  private String mBand;
  private String mValetParking;
  private int mLevelOfFood;
  private String mCouponType;
  // Cost of Event, which will be calculated later
  private int mCost;



  // Event constructor
  public Event (int guests, int hors, String magician, String bartender, String band, String valet, int levelOfFood, String couponType  ){
    mNumberOfGuests=guests;
    mHDFood=hors;
    mMagician=magician;
    mBartender=bartender;
    mBand=band;
    mValetParking=valet;
    mLevelOfFood=levelOfFood;
    mCouponType=couponType;
    // Will be calculated
    mCost=0;
  }

  // Getters
  public int getNumberOfGuests(){
    return mNumberOfGuests;
  }

  public int getHDFood(){
    return mHDFood;
  }

  public String getMagician(){
    return mMagician;
  }

  public String getBartender(){
    return mBartender;
  }

  public String getBand(){
    return mBand;
  }

  public String getValet(){
    return mValetParking;
  }

  public int getLevelOfFood(){
    return mLevelOfFood;
  }

  public String getCouponType(){
    return mCouponType;
  }

  public int getCost(){
    return mCost;
  }

  // Calculates cost, returns int mCost
  public int calculateCost() {
    mCost += mNumberOfGuests*5;

    mCost += mHDFood*15;

    mCost += mLevelOfFood*mNumberOfGuests;

    if (mMagician.equals("yes")){
      mCost += 120;
    }
    else{}
    if (mBartender.equals("yes")){
      mCost += 100;
    }
    else{}
    if (mBand.equals("yes")){
      mCost +=200;
    }
    else{}
    if (mValetParking.equals("yes")){
      mCost += 50;
    }
    else{}
    if (mCouponType.equals("matinee")){
      mCost -= 20;
    }
    else if (mCouponType.equals("weekday")){
      mCost -= 40;
    }
    else {
      mCost = mCost;
    }

    return mCost;
  }
}
