package seedu.duke;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;



public class ParserTest {
    @Test
    public void parse_validAddCommand_success() throws InternTrackException{
        String input = "add c/Google r/Software Engineer";
        Application result = Parser.createApplication(input);
        assertEquals("Google", result.getCompany());
        assertEquals("Software Engineer", result.getRole());
        assertEquals("Pending", result.getStatus());
        assertNull(result.getDeadline());
        assertNull(result.getContact());
    }
}
