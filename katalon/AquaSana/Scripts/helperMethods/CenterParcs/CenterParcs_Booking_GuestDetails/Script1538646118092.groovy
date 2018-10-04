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

WebUI.callTestCase(findTestCase('helperMethods/Generic/SettingGuestDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/firstName'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/titleDropDown'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/titleDropDown'), 'OTHR', 
    true)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/firstName'), GlobalVariable.guestFirstName)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/lastName'), GlobalVariable.guestLastName)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/email'), GlobalVariable.guestEmailAddress)

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/guestDetailsNextBtn'), 
    0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/guestDetailsNextBtn'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/carDropDown'), 0)

WebUI.selectOptionByValue(findTestObject(null), '0', true)

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Guest Details/continueBtn'), 0)

