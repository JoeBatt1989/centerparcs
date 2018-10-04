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

sleep(2000)

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/nameOnCard'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/nameOnCard'), 0)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/nameOnCard'), GlobalVariable.lastName)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/cardNumber'), '4929492949294929')

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/expiryDateMonth'), '01', true)

WebUI.selectOptionByValue(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/expirtDateYear'), '2021', true)

WebUI.setText(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/cvv'), '424')

WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/paymentConfirmBtn'), 0)

WebUI.click(findTestObject('CenterParcs/CenterParks - Booking Journey/Payment/paymentConfirmBtn'))

