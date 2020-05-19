package foo;

import com.amazon.redshift.api.PGTimestamp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PgTimestampTest {
    @Test
    public void pgTimestamp_toString_works() {
        assertNotNull(new PGTimestamp(1).toString());
    }
}
