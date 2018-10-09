import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.functions.ExpectedCondition as ExpectedCondition

WebDriver driver = DriverFactory.getWebDriver()

WebDriverWait wait = new WebDriverWait(driver, 10)

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/chooseLocationText'), 
    0)

if (GlobalVariable.dogs > 0) {
    WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/selectLodgeRadioBtn'), 
        0)

    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/selectLodgeRadioBtn'), 
        0)

    WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/selectLodgeRadioBtn'))

    WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/selectLodgeDropDown'), 
        0)

    WebUI.selectOptionByIndex(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/selectLodgeDropDown'), 
        1)
} else {
    WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/noPreferenceRadioBtn'), 
        0)

    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/noPreferenceRadioBtn'), 
        0)

    noPrefRadioButton = driver.findElement(By.cssSelector('#js-accordion-form-area-0 div fieldset div:last-child input'))

    Actions actions = new Actions(driver)

    actions.moveToElement(noPrefRadioButton).click().perform()
}

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Choose your Location/continueBtn'))

