import org.testng.Assert;
import org.testng.annotations.Test;

public class CodeTest {

    @Test
    public void case1(){
        int result1 = Code.blech(1);
        Assert.assertEquals(result1, 0);
    }

    @Test
    public void case2(){
        int result2 = Code.blech(0);
        Assert.assertEquals(result2, 0);
    }

    @Test
    public void case3(){
        int result3 = Code.blech(-1);
        Assert.assertEquals(result3, 0);
    }

    @Test
    public void case4(){
        int result4 = Code.blech(-64000);
        Assert.assertEquals(result4, -2);
    }

    @Test
    public void case5(){
        CodeHelper name = new CodeHelper();
        //name.
    }





}
