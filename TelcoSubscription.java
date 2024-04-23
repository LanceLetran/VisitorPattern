public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);

    boolean getUnliCallText();

    double getPromoPrice();
}
