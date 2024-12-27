package tests;

import modelToTesting.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Init avant chaque test");
    }

    //permet de nettoyer l'état
    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Nettoyage après chaque test");
    }

    @Test
    void testAddition(){
        System.out.println("ds le test addition");
        Assertions.assertEquals(5, calculator.add(2,3));
        Assertions.assertEquals(-1, calculator.add(-2,1));
        Assertions.assertEquals(0, calculator.add(0,0));
    }

    @Test
    void testSubtraction(){
        System.out.println("ds le test soustraction");
        Assertions.assertEquals(2, calculator.subtract(5,3));
        Assertions.assertEquals(-3, calculator.subtract(0,3));
        Assertions.assertEquals(0, calculator.subtract(2,2));
    }
}
