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

GlobalVariable.currentPassword = 'Password123'

GlobalVariable.emailAddress = 'cpdrmin-4649'

GlobalVariable.dogs = 1

GlobalVariable.village = 'SF'

GlobalVariable.lastName = "Automation Account"

WebUI.openBrowser('https://uat.centerparcs.co.uk')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Breaks we offer/breaskWeOfferMenu'), 
    0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Breaks we offer/breaskWeOfferMenu'))

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Breaks we offer/typesOfBreaksLink'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Types of Breaks/typesOfBreaksText'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Types of Breaks/Dog Friendly Holidays/dogFriendlyContainer'), 
    0)

WebUI.click(findTestObject('CenterParcs/CenterParcs - Types of Breaks/Dog Friendly Holidays/dogFriendlyHolidaysBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Dog Friendly Holiday/dogFriendlyHolidayText'), 0)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_Accomodation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_Accomodation_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_Location'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_Extras'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_YourDetails_LoggedIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_GuestDetails_Existing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_CBSoon'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Booking_Payment'), [:], FailureHandling.STOP_ON_FAILURE)

sleep(3000)

