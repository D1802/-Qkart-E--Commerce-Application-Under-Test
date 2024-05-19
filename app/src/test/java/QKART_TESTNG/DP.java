package QKART_TESTNG;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;


public class DP {
    @DataProvider (name = "data-provider")
    public Object[][] dpMethod (Method m) throws IOException{
        return null;
    }
}