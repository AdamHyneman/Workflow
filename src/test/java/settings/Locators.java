package settings;

public interface Locators {
String UNIVERSAL_MAIN_PAGE_XPATH= "//h5[normalize-space()='$1']";
String UNIVERSAL_TAB_NAME_XPATH = "//div[@class='main-header'][contains(.,'$1')]";
String UNIVERSAL_ELEMENTS_TAB_XPATH = "//span[normalize-space()='$1']";
String UNIVERSAL_TEXT_BOX_XPATH = "//input[contains(@placeholder,'$1')]";
String UNIVERSAL_ELEMENTS_PAGE_XPATH = "//div[contains(text(),'$1')]";
String UNIVERSAL_XPATH_FOR_CLICKABLE_BUTTONS = "//button[contains(.,'$1')]";
String UNIVERSAL_RADIO_BUTTONS_XPATH = "//label[normalize-space()='$1']";
String TEXT_SUCCESS_RADIO_BUTTON_XPATH = "//span[contains(normalize-space(),'$1')]";
String NO_RADIO_BUTTON = "//label[normalize-space()='No']";
}
