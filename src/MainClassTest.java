import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
   public void testGetClassString(){
        MainClass mainClass = new MainClass();
        String result = mainClass.getClassString();
        Assert.assertTrue("Нет слов hello или Hello в строкe в mainClass.getClassString", result.contains("hello") || result.contains("Hello"));
    }

}
