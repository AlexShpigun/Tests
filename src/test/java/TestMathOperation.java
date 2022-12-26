import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperation {
    @Test
    public void checkOper() {
        Assert.assertTrue(oper(2,git2,2) == 6);
        Assert.assertTrue(oper(3,3,3) == 12);
        Assert.assertTrue(oper(4,4,4) == 20);
        Assert.assertTrue(oper(5,5,5) == 30);

    }
    @Test
    public void checkOper1(){
        Assert.assertTrue(oper1(2,2) == 4);
        Assert.assertTrue(oper1(3,3) == 9);
        Assert.assertTrue(oper1(4,4) == 16);
        Assert.assertTrue(oper1(5,5) == 25);
    }

        public int oper(int a,int b,int c){
            return a + b * c;
        }
        public int oper1(int a,int b){
            return (a * b);
        }
    }



