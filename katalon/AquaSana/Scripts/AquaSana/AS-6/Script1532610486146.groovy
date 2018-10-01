import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

GlobalVariable.emailAddress = 'cpsit.tester1+winston@gmail.com'

WebUI.openBrowser('https://uat.aquasana.co.uk')

WebUI.maximizeWindow()

WebUI.click(findTestObject('AquaSana/AquaSana - login/Signin button'))

WebUI.verifyElementVisible(findTestObject('AquaSana/AquaSana - login/Submit button'))

WebUI.sendKeys(findTestObject('AquaSana/AquaSana - login/Username Field'), GlobalVariable.emailAddress)

WebUI.sendKeys(findTestObject('AquaSana/AquaSana - login/Password field'), 'Password123')

WebUI.click(findTestObject('AquaSana/AquaSana - login/Submit button'))

WebUI.waitForElementPresent(findTestObject('AquaSana/AquaSana - Homepage logged in/Welcome Message', [('name') : 'Test']), 5)

WebUI.back()

WebUI.click(findTestObject('AquaSana/AquaSana - login/Signout button'))

WebUI.verifyElementPresent(findTestObject('AquaSana/AquaSana - login/Signin button'), 0)

WebUI.closeBrowser()

