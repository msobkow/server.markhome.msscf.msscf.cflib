package server.markhome.msscf.msscf.cflib.inz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Properties;

public class InzTest {

    private static InzEntry sysEntry;
    private static InzLang sysEn;

    @BeforeAll
    public static void setup() {
        Inz.loadLangEntries(true);
        sysEntry = Inz.CFLIB_INZ_ENTRY;
        sysEn = sysEntry.getLang("en");
        // Simulate loading CFLib Inz instance and en.properties

        // Add more properties as needed for test coverage
    }

    @Test
    public void testSystemLangCodeProperty() {
        assertEquals("en", Inz.getSystemLangCode());
    }

    @Test
    public void testEnglishNameProperty() {
        assertEquals("English", sysEn.getEnglishName());
    }

    @Test
    public void testNlsNameProperty() {
        assertEquals("English", sysEn.getNlsName());
    }

    @Test
    public void testX() {
        assertEquals("%1$s%2$s", Inz.x("cflib.CFLibArgumentException.TcmnMsg"));
    }
}
