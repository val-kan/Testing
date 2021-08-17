package unitTesting;
import org.testng.Assert;
import org.testng.annotations.Test;
import package_test.Human;

public class unittest_human {
    @Test
    public void humantest_Human_ageIs30(){

        //Arrange - Given
        Human man = new Human("SSS","male",30);

        //Act -When
        int result = man.myage();

        //Assert -Then
        Assert.assertEquals(result,30);
    }

    @Test
    public void humantest_Human_ageIs12() {
        //Given - arrange
        Human youth =new Human("boy","male",12);

        //When - Act
        int result = youth.myage();

        //Then - Assert (actual,expected)
        Assert.assertEquals(result, 13);
    }

}
