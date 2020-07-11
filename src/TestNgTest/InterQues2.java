package TestNgTest;

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InterQues2 {

    @Test
    public void Testcase3(){
        Assert.assertEquals(true,false);
        System.out.println("Testcase3");
    }

    @Test
    public void Testcase4(){
        System.out.println("Testcase4");
    }

}
