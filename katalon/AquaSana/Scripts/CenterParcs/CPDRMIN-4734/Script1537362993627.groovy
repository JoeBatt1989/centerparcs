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

WebUI.callTestCase(findTestCase('helperMethods/Generic/SettingUserDetails'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.emailComms = true

GlobalVariable.postComms = false

GlobalVariable.smsComms = false

WebUI.openBrowser('https://uat.centerparcs.co.uk')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Register_Base'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Register_Additional'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CenterParcs/CenterParcs - My Profile/updateDetailsBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Homepage_logged_in/myBookingMenu'), 0)

WebUI.callTestCase(findTestCase('helperMethods/Generic/sendDwEmail (NEEDS TO BE FINISHED)'), [:], FailureHandling.STOP_ON_FAILURE)

