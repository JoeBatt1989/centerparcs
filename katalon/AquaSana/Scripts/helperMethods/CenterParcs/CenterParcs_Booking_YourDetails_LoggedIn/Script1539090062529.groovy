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

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/yourDetailsText'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/leadBookerNextBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/leadBookerNextBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/termsAndCondCheckBox'), 0)

WebUI.check(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/termsAndCondCheckBox'))

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/continueBtn'), 
    0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Your Details/Register/continueBtn'))

