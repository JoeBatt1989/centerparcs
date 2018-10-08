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

GlobalVariable.emailAddress = 'winston'

WebUI.openBrowser('https://uat.centerparcs.co.uk')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Discover Center Parcs/DiscoverCPTab'))

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Discover Center Parcs/activitiesLink'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Activities/actvitiesText'), 0)

