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

not_run: WebUI.openBrowser('https://uat.centerparcs.co.uk')

not_run: WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/signIn_btn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/signIn_btn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs Login_Register/LogIn/submitBtn'), 0)

WebUI.sendKeys(findTestObject('CenterParcs/Centerparcs Login_Register/LogIn/inputUserName'), ('cpsit.tester1+' + GlobalVariable.guestEmailAddress) + 
    '@gmail.com')

WebUI.sendKeys(findTestObject('CenterParcs/Centerparcs Login_Register/LogIn/inputPassword'), 'Password123')

WebUI.click(findTestObject('CenterParcs/Centerparcs Login_Register/LogIn/submitBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/Find_out_how_it_works'), 0)

