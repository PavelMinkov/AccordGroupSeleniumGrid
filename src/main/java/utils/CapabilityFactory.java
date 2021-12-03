package utils;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    private Capabilities capabilities;

    public Capabilities getCapabilities(String browser) {
        if (browser.equals("chrome")) {
            capabilities = OptionsManager.getChromeOptions();
        } else {
            capabilities = OptionsManager.getFirefoxOptions();
        }
        return capabilities;
    }
}