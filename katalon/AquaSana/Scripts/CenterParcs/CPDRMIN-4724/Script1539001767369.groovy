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

GlobalVariable.newPassword = 'PasswordNew1'

WebUI.openBrowser('https://uat.centerparcs.co.uk')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/signInRegisterBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/signInRegisterBtn'))

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Login_Existing_User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/avatar'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/avatar'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myProfile'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myProfile'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_ChangePassword_Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.currentPassword = 'PasswordNew1'

GlobalVariable.newPassword = 'Password123'

sleep(2000)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Login_Existing_User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/avatar'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/avatar'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myProfile'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myProfile'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_ChangePassword_Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

