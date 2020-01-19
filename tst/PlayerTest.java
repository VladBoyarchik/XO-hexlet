import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testGetName() throws  Exception {
        final String inputValue = "Vlad";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue,null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFigure() throws  Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);
    }
}