package Pratimas24;

public class Basket {

    private int numberOfItems;

    public void addToBasket() {
        if (numberOfItems == 10) {
            throw new BasketFullException("pilnas");
        } else {
            numberOfItems++;
        }
    }

    public void remuveFromBasket() {
        if (numberOfItems == 0) {
            throw new BasketEmtyException("krepsys jau tuscias");
        } else {
            numberOfItems--;
        }
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
