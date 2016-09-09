class Event {
  private Integer mGuests;
  private Integer mMeal;
  private Integer mBeverage;
  private Integer mEntertainment;
  private Integer total = 0;

  public Event(Integer guests, Integer meal, Integer beverage, Integer entertainment) {
    mGuests = guests;
    mMeal = meal;
    mBeverage = beverage;
    mEntertainment = entertainment;
  }

  public Integer getTotal() {
    return total;
  }

  public Integer calculateCost() {

    if (mMeal == 1) {
      total += 10 * mGuests;
    } else if (mMeal == 2) {
      total += 15 * mGuests;
    }

    if (mBeverage == 1) {
      total += 10 * mGuests;
    } else if (mBeverage == 2) {
      total += 5 * mGuests;
    }

    if (mEntertainment == 1) {
      total += 1000;
    } else if (mEntertainment == 2) {
      total += 500;
    }

    return total;
  }

  
}
