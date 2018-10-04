import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
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
import junit.framework.Assert as Assert

WebUI.callTestCase(findTestCase('helperMethods/Generic/SettingUserDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Help Links/signUpEmailLink'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Help Links/signUpEmailLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Email Sign Up/signUpText'), 0)

WebUI.setText(findTestObject('AquaSana/AquaSana - Email Sign Up/emailAddress'), ('cpsit.tester1+' + GlobalVariable.guestEmailAddress) + 
    '@gmail.com')

WebUI.setText(findTestObject('AquaSana/AquaSana - Email Sign Up/firstName'), GlobalVariable.guestFirstName)

WebUI.setText(findTestObject('AquaSana/AquaSana - Email Sign Up/lastName'), GlobalVariable.guestLastName)

WebUI.click(findTestObject('AquaSana/AquaSana - Email Sign Up/registerBtn'))

WebDriver driver = DriverFactory.getWebDriver()

int errorMessageCount = driver.findElements(By.cssSelector('.gigya-error-code-400027')).size()

Assert.assertTrue(errorMessageCount == 2)

WebUI.setText(findTestObject('AquaSana/AquaSana - Email Sign Up/password'), 'Password123')

WebUI.setText(findTestObject('AquaSana/AquaSana - Email Sign Up/passwordReenter'), 'Password123')

WebUI.click(findTestObject('AquaSana/AquaSana - Email Sign Up/registerBtn'))

WebUI.click(findTestObject('AquaSana/AquaSana - Email Sign Up/registerBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/emailCheckBox'), 
    0)

String emailCheckBox = driver.findElement(By.cssSelector('#gigya-checkbox-110882929899913540')).getAttribute('class')

Assert.assertTrue(emailCheckBox == 'gigya-input-checkbox')

