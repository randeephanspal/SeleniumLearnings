package TestNgTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InterQues {


    @Test
    public void Testcase1(){
        System.out.println("Testcase1");
    }

    @Test
    public void Testcase2(){
        Assert.assertEquals(true,false);
        System.out.println("Testcase2");
    }
}
