import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    @Test
    public void computeArea(int a, int b, int c){
        Assumptions.assumeTrue(a>0 && b>0 && c>0);
        Assertions.assertTrue(Triangle.computeArea(a,b,c)>0);
    }
}
