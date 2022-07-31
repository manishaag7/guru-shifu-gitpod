import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class RectangleTest {

    @Test
    void shouldReturnAreaIsZeroWhenLengthIsOneAndBreadthIsOne() {
        Rectangle rectangle= new Rectangle(1.21,1);
        double area = rectangle.area();
        assertThat(area, is(closeTo(1.21, 0.01)));
    }

    
}

