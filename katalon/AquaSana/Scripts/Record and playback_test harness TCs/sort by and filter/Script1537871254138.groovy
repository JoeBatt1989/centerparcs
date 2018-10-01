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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.aquasana.co.uk/')

WebUI.selectOptionByValue(findTestObject('Page_Spa Days and Spa Breaks  Aqua /select_Choose your spa        '), 'SF', true)

WebUI.setText(findTestObject('Page_Spa Days and Spa Breaks  Aqua /input_When_date'), '26-09-2018')

WebUI.selectOptionByValue(findTestObject('Page_Spa Days and Spa Breaks  Aqua /select_- 0 days               '), '1', true)

WebUI.click(findTestObject('Page_Spa Days and Spa Breaks  Aqua /button_Search now'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/li_Recommended'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Price lowest to highest'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Price highest to lowest'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Recommended'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/li_Filters'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Spa days'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Spa packages'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Spa days'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Search  Aqua Sana/label_Spa packages'))

WebUI.closeBrowser()

