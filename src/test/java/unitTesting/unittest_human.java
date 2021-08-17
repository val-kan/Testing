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

}
