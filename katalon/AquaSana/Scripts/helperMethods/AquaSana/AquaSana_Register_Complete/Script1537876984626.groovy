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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('helperMethods/Generic/SettingUserDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('https://uat.aquasana.co.uk')

WebUI.maximizeWindow()

WebUI.click(findTestObject('AquaSana/AquaSana - login/Signin button'))

WebUI.verifyElementVisible(findTestObject('AquaSana/AquaSana - login/Submit button'))

WebUI.click(findTestObject('AquaSana/AquaSana - login/NewAccountLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Create Account/emailAddress'), 0)

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account/emailAddress'), ('cpsit.tester1+' + GlobalVariable.guestEmailAddress) + 
    '@gmail.com')

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account/password'), 'Password123')

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account/passwordRe-enter'), 'Password123')

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account/firstName'), GlobalVariable.guestFirstName)

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account/lastName'), GlobalVariable.guestLastName)

WebUI.submit(findTestObject('AquaSana/AquaSana - Create Account/registerBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/titleDropDown'), 
    0)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/titleDropDown'), 'OTHR', 
    true)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/genderDropDown'), 'm', 
    true)

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/postcodeInput'), 'NG22 9DP')

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/lookupBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/lookupBtn'))

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/addressDropDown'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/dobDaysDropDown'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/dobMonthDropDown'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/dobYearDropDown'), 
    '1980', true)

WebUI.setText(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/contactNumberInput'), '07989898989')

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/contactTypeDropDown'), 
    'Mobile', true)

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/updateAccount'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Create Account - Complete your profile/updateAccount'))

WebUI.waitForElementPresent(findTestObject('AquaSana/AquaSana - Homepage logged in/Welcome Message', [('name') : 'Test']), 
    5)

