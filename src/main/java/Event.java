class Event {
  private Integer mGuests;
  private Integer mMeal;
  private Integer mBeverage;
  private Integer mEntertainment;
  private Integer total = 0;
  private String mealChoice;
  private String beverageChoice;
  private String entertainmentChoice;


  public Event(Integer guests, Integer meal, Integer beverage, Integer entertainment) {
    mGuests = guests;
    mMeal = meal;
    mBeverage = beverage;
    mEntertainment = entertainment;
  }

  public Integer getTotal() {
    return total;
  }

  public Integer getGuests() {
    return mGuests;
  }

  public String getMealChoice() {
    return mealChoice;
  }

  public String getBeverageChoice() {
    return beverageChoice;
  }

  public String getEntertainmentChoice() {
    return entertainmentChoice;
  }

  public Integer calculateCost() {

    if (mMeal == 1) {
      total += 10 * mGuests;
    } else if (mMeal == 2) {
      total += 15 * mGuests;
    } else {
      total += 10 * mGuests;
    }

    if (mBeverage == 1) {
      total += 10 * mGuests;
    } else if (mBeverage == 2) {
      total += 5 * mGuests;
    } else {
      total += 5 * mGuests;
    }

    if (mEntertainment == 1) {
      total += 1000;
    } else if (mEntertainment == 2) {
      total += 500;
    } else {
      total += 500;
    }
    return total;
  }

  public String showMeal() {
    if (mMeal == 2) {
      mealChoice = "Steak";
    } else if (mMeal == 1) {
      mealChoice = "Chicken";
    } else {
      mealChoice = "Your selection is not available. The standard package includes Chicken as a meal.";
    }
    return mealChoice;
  }

  public String showBeverage() {
    if (mBeverage == 1) {
      beverageChoice = "Alcoholic Beverages";
    } else if (mBeverage == 2) {
      beverageChoice = "Non-Alcoholic Beverages";
    } else {
      beverageChoice = "Your selection is not available. The standard package includes non-alcoholic beverages.";
    }
    return beverageChoice;
  }

  public String showEntertainment() {
    if (mEntertainment == 1) {
      entertainmentChoice = "Live Band";
    } else if (mEntertainment == 2) {
      entertainmentChoice = "DJ";
    } else {
      entertainmentChoice = "Your selection is not available. The standard package includes a DJ for entertainment.";
    }
    return entertainmentChoice;
  }
}
