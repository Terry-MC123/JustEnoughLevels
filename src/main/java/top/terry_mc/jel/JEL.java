package top.terry_mc.jel;

import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(JEL.MOD_ID)
public class JEL {
    public static final String MOD_ID = "jel";
    public static final Logger LOGGER = LogManager.getLogger("Just Enough Levels");
    public JEL() {
        LOGGER.info("Just Enough Levels loaded!");
    }
}
