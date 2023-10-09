import org.example.Container;
import org.example.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElemetsSumTest {

    @Test
    void elementsSumInContainerTest() {
        Container container = new Container();
        container.add(new Element(5));
        container.add(new Element(10));
        container.add(new Element(35));
        container.add(new Element(50));

        Integer result = container.getElementSum();
        assertEquals(100, result);
    }
}
