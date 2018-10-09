import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement
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

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/yourDetailsText'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/email'), 0)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/email'), ('cpsit.tester1+' + GlobalVariable.emailAddress) + 
    '@gmail.com')

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/verifyEmailBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/verifyEmailBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/titleDropDown'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/titleDropDown'), 'OTHR', 
    true)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/firstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/lastName'), GlobalVariable.lastName)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/dobDayDropDown'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/dobMonthDropDown'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/dobYearDropDown'), '1980', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/phoneNumberType'), 'Mobile', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/phoneNumberCode'), '+44', 
    false)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/phoneNumber'), '7777777777')

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/leadBookerNextBtn'), 
    0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/leadBookerNextBtn'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/postcode'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/countryDropDown'), 'UK', 
    true)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/postcode'), 'NG22 9DP')

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/findAddressBtn'))

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/addressListSelection'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/addressNextBtn'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/addressNextBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/addressNextBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/password'), 0)

WebUI.setText(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/password'), 'Password123')

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebDriverWait wait = new WebDriverWait(driver, 10)

if (GlobalVariable.emailComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/postcode'), 0)

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_email')))

    WebElement emailCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_email'))

    actions.moveToElement(emailCheckBox).click().perform()
}

if (GlobalVariable.postComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/postcode'), 0)

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_directmail')))

    WebElement postCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_directmail'))

    actions.moveToElement(postCheckBox).click().perform()
}

if (GlobalVariable.smsComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/postcode'), 0)

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_sms')))

    WebElement smsCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_sms'))

    actions.moveToElement(smsCheckBox).click().perform()
}

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/termsAndCondCheckBox'), 0)

WebUI.check(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/termsAndCondCheckBox'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/continueBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/continueBtn'))

sleep(3000)

