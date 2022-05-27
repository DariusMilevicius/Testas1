package Pamoka24;

import Pratimas24.Basket;
import Pratimas24.BasketEmtyException;
import Pratimas24.BasketFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BasketTest {

    @Test
    void testAddToBasket_happyPath(){
        Basket basket = new Basket();
        basket.addToBasket();
        basket.addToBasket();
        assertEquals(2, basket.getNumberOfItems());
    }
    @Test
    void testRemoveToBasket_happyPath(){
        Basket basket = new Basket();
        basket.addToBasket();
        basket.addToBasket();
        basket.remuveFromBasket();
        assertEquals(1, basket.getNumberOfItems());
    }
    @Test
    void testAddToBasket_UnHappyPath(){
        Basket basket = new Basket();
        for(int i = 0; i < 10; i++){
            basket.addToBasket();
        }

        BasketFullException basketFullException = assertThrows(BasketFullException.class, () -> basket.addToBasket());
        assertEquals("pilnas", basketFullException.getMessage() );

    }
    @Test
    void testRemoveToBasket_UnHappyPath(){
        Basket basket = new Basket();
        BasketEmtyException basketEmtyException = assertThrows(BasketEmtyException.class, () -> basket.remuveFromBasket());
        assertEquals("krepsys jau tuscias", basketEmtyException.getMessage() );
    }

}
