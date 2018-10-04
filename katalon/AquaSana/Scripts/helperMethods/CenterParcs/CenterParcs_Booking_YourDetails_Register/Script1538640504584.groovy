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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/yourDetailsText'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/email'), 0)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/email'), ('cpsit.tester1+' + GlobalVariable.guestEmailAddress) + 
    '@gmail.com')

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/verifyEmailBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/verifyEmailBtn'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/titleDropDown'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/titleDropDown'), 'OTHR', 
    true)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/firstName'), GlobalVariable.guestFirstName)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/lastName'), GlobalVariable.guestLastName)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/dobDayDropDown'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/dobMonthDropDown'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/dobYearDropDown'), '1980', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/phoneNumberType'), 'Mobile', 
    true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/phoneNumberCode'), '+44', 
    false)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/phoneNumber'), '7777777777')

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/leadBookerNextBtn'), 
    0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/leadBookerNextBtn'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/postcode'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/countryDropDown'), 'UK', 
    true)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/postcode'), 'NG22 9DP')

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/findAddressBtn'))

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/addressListSelection'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/addressNextBtn'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/addressNextBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/addressNextBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/password'), 0)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/password'), 'Password123')

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/termsAndCondCheckBox'), 0)

WebUI.check(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/termsAndCondCheckBox'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/continueBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Your Details/continueBtn'))

sleep(3000)

