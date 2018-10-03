import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_my_profile/dobDayDropDown'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/dobDayDropDown'), '1', true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/dobMonthDropDown'), '1', true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/dobYearDropDown'), '1980', true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/contactTypeDropDown'), 'Mobile', true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/phoneCode'), '+44', false)

WebUI.setText(findTestObject('CenterParcs/Centerparcs Login_Register/Register/phoneNumber'), '7777777777')

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs_my_profile/contryDropDown'), 'UK', true)

WebUI.setText(findTestObject('CenterParcs/Centerparcs Login_Register/Register/postcode'), 'NG22 9DP')

WebUI.click(findTestObject('CenterParcs/Centerparcs_my_profile/findAddressBtn'))

WebUI.click(findTestObject('CenterParcs/Centerparcs_my_profile/addressListSelection'))

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebDriverWait wait = new WebDriverWait(driver, 10)

if (GlobalVariable.emailComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/postcodeInput'), 0)
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_email')))
    WebElement emailCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_email'))
    actions.moveToElement(emailCheckBox).click().perform()
}

if (GlobalVariable.postComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/postcodeInput'), 0)
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_directmail')))
    WebElement postCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_directmail'))
    actions.moveToElement(postCheckBox).click().perform()
}

if (GlobalVariable.smsComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/postcodeInput'), 0)
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('#subscribe_cp_sms')))
    WebElement smsCheckBox = driver.findElement(By.cssSelector('#subscribe_cp_sms'))
    actions.moveToElement(smsCheckBox).click().perform()
}

WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/updateDetailsBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_my_profile/updateDetailsBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_my_profile/savedText'), 0)

