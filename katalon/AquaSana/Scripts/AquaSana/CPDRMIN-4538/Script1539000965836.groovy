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

GlobalVariable.currentPassword = 'Password123'

GlobalVariable.emailAddress = 'cpdrmin-4538'

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - login/signInBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - login/signInBtn'))

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Login_Existing_User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - login/myAccountLink'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - login/myAccountLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - My Account/myAccountText'), 0)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - My Account/titleDropDown'), 'MR', true)

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/firstName'))

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/firstName'), 'Account')

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/lastName'))

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/lastName'), 'Update')

WebDriver driver = DriverFactory.getWebDriver()

String disabled = driver.findElement(By.cssSelector('#gigya-textbox-87628597473076220')).getAttribute('disabled')

Assert.assertEquals('true', disabled)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - My Account/genderDropDown'), 'f', true)

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - My Account/postCodeLookupBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/postCodeLookupBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), 0)

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), 'BA12 7PU')

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/lookUpBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - My Account/addressDropDown'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/addressDropDown'))

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - My Account/saveBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/saveBtn'))

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - My Account/titleDropDown'), 'OTHR', true)

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/firstName'))

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/firstName'), 'Automation')

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/lastName'))

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/lastName'), 'Account')

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - My Account/genderDropDown'), 'm', true)

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - My Account/postCodeLookupBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/postCodeLookupBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), 0)

WebUI.clearText(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AquaSana/AquaSana - My Account/postcodeInput'), 'NG22 9DN')

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/lookUpBtn'))

sleep(1000)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - My Account/addressDropDown'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/addressDropDown'))

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - My Account/saveBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - My Account/saveBtn'))

sleep(1000)

