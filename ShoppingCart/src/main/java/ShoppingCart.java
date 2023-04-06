import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {


    public void addItemTest() {
        ShoppingCart cart = new ShoppingCart();

        // Test adding one item
        cart.addItem("Item 1", 10.99, 1);
        assertEquals(10.99, cart.getTotalCost(), 0);

        // Test adding multiple items with the same name
        cart.addItem("Item 1", 10.99, 2);
        assertEquals(32.97, cart.getTotalCost(), 0);
    }


    public void removeItemTest() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item 1", 10.99, 2);
        cart.addItem("Item 2", 5.99, 1);

        // Test removing an existing item
        cart.removeItem("Item 1");
        assertEquals(5.99, cart.getTotalCost(), 0);

        // Test removing a non-existing item
        cart.removeItem("Item 3");
        assertEquals(5.99, cart.getTotalCost(), 0);
    }


    public void getTotalCostTest() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item 1", 10.99, 2);
        cart.addItem("Item 2", 5.99, 1);

        // Test getting total cost with multiple items
        assertEquals(27.97, cart.getTotalCost(), 0);

        // Test getting total cost with no items
        cart.removeItem("Item 1");
        cart.removeItem("Item 2");
        assertEquals(0, cart.getTotalCost(), 0);
    }
}