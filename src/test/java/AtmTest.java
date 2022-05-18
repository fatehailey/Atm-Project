import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AtmTest {


    //Arrange
    Atm underTest = new Atm(50, "1234");
    @Test
    public void shouldHaveADefaultBalanceOf50(){

        //Act
        int actualBalance = underTest.getBalance();
        //Assert

        assertEquals( 50, actualBalance);
    }

    @Test
    public void shouldHaveADefaultBalanceOf100(){
        //Arrange
        Atm underTest = new Atm(100, "1234");
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(100, actualBalance);

    }
    @Test
    public void depositOf50ShouldIncreaseAnInitialBalanceOf50To100(){
        underTest.deposit( 50);
        int actualBalance = underTest.getBalance();
        assertEquals(100, actualBalance);
    }

    @Test
    public void withdrawOf50ShouldDecreaseAnInitialBalanceOf50To100(){
        underTest.withdraw(50);
        int actualBalance = underTest.getBalance();
        assertEquals(0, actualBalance);
    }
    @Test
    public void withdrawOf51ShouldReturnOrginalBalanceOf50() {
        underTest.withdraw(51);
        int actualBalance = underTest.getBalance();
        assertEquals(50, actualBalance);
    }
    @Test
    public void shouoldAllowUserAccessWithCorrectPin(){
        boolean accessResult = underTest.accessAccount("1234");
        assertEquals(true, accessResult);
    }
    @Test
    public void shouldDenyUserAccessWithIncorrectPin(){
        boolean accessResult = underTest.accessAccount("1111");
       assertEquals(false, accessResult);
    }
}
