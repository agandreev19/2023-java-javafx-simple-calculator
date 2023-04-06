import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIfTwoPlusTwoShouldReturnFour() {
        //Arrange
        int expectedResult = 4;
        // Act
        Main obj = new Main();
        int actualResult = obj.addition(2,2);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIfThreePlusSevenShoutReturnTen(){

        //Arrange
        int expectedResult = 10;
        // Act
        Main obj = new Main();
        int actualResult = obj.addition(3,7);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIfThrowIllegalArgument

}