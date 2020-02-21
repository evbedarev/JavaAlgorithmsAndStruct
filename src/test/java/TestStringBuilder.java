import org.junit.Test;

public class TestStringBuilder {
    @Test
    public void testSb(){
        StringBuilder sb = new StringBuilder();
        sb.append(1231231232);
        System.out.println(sb.length());
        sb.delete(0, sb.length());
        System.out.println("stringBuilder " + sb + "|");
    }
}
