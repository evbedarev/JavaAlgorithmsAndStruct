package listing6;

import listing6.annagram.Annagram;
import org.junit.Test;

public class TestAnnagram {
    @Test
    public void testAnnagram() {
        Annagram annagram = new Annagram();
        annagram.changeLetter("front");
    }
}
