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


    constructor
    public Event (int numberOfGuests, int hDFood, String magician, String bartender, String band, String valetParking, String couponCode1, String couponCode2, int levelOfFoodService  ){
      mNumberOfGuests=numberOfGuests;
      mHDFood=hDFood;
      mMagician=magician;
      mBartender=bartender;
      mBand=band;
      mValetParking=valetParking;
      mCoupon1=couponCode1;
      mCoupon2=couponCode2;
      mLevelOfFood=levelOfFoodService;
    }


    public Event (int guests ){
      mNumberOfGuests = guests;
    }

    public int returnANumber(int numberOfGuests){
        return numberOfGuests;
    }
    //
    public double calculateCost (int numberOfGuests ) {
      double bookingChargeBasedOnGuests= numberOfGuests*5;
      return bookingChargeBasedOnGuests;
    }

    // Coupon weekday = new Coupon ("weekday", .7);
    // Coupon matinee = new Coupon ("matinee", .85);
    //
    // List<Coupon> CouponCodes = new ArrayList<Coupon>();
    // CouponCodes.add(weekday);
    // CouponCodes.add(matinee);

    // if userinput = "matinee"
    // double multiplier=0.85;
    // applyCoupon(bookingChargeBasedOnGuests, multiplier)

    //

    public double applyCoupon(double bookingChargeBasedOnGuests, double multiplier){
        double priceBasedOnCoupon = 0;
        return priceBasedOnCoupon;
    }

  }
