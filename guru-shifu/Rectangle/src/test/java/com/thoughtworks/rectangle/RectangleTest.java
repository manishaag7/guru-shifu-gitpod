import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class RectangleTest {

    @Test
    void shouldReturnAreaIsZeroWhenLengthIsOneAndBreadthIsOne() {
        Rectangle rectangle= new Rectangle(1,1);
        int area = rectangle.area();
        assertThat(area,equalTo(1));
    }

    
}

