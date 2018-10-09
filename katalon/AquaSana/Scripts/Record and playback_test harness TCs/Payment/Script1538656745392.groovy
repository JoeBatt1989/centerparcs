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

WebUI.navigateToUrl('https://uat.centerparcs.co.uk/')

WebUI.click(findTestObject('Page_UK Breaks  Center Parcs/a_Which village'))

WebUI.click(findTestObject('Page_UK Breaks  Center Parcs/div_Whinfell Forest'))

WebUI.click(findTestObject('Page_UK Breaks  Center Parcs/div_Check                    i'))

WebUI.click(findTestObject('Page_UK Breaks  Center Parcs/a_Check                    in'))

WebUI.setText(findTestObject('Page_UK Breaks  Center Parcs/input_Arrival date_alternateIn'), '08-10-2018')

WebUI.setText(findTestObject('Page_UK Breaks  Center Parcs/input_Departure date_alternate'), '12-10-2018')

WebUI.click(findTestObject('Page_UK Breaks  Center Parcs/button_Search'))

WebUI.click(findTestObject('Page_Search  Center Parcs/a_Book now  349'))

WebUI.click(findTestObject('Page_Location  Center Parcs/label_No preference(free of ch'))

WebUI.click(findTestObject('Page_Location  Center Parcs/span_Continue'))

WebUI.click(findTestObject('Page_Little extras  Center Parcs/span_Continue'))

WebUI.click(findTestObject('Page_Your Details  Center Parcs/button_Verify Email'))

WebUI.click(findTestObject('Page_Your Details  Center Parcs/button_Sign in'))

WebUI.click(findTestObject('Page_Your Details  Center Parcs/button_Next'))

WebUI.click(findTestObject('Page_Your Details  Center Parcs/input_SMS_terms'))

WebUI.click(findTestObject('Page_Your Details  Center Parcs/span_Continue'))

WebUI.selectOptionByValue(findTestObject('Page_Guest Details  Center Parcs/select_Select a guest         '), 'SymondsSymonds', 
    true)

WebUI.click(findTestObject('Page_Guest Details  Center Parcs/button_Next'))

WebUI.selectOptionByValue(findTestObject('Page_Guest Details  Center Parcs/select_Please select          '), '0', true)

WebUI.click(findTestObject('Page_Guest Details  Center Parcs/span_Continue to payment'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Payment  Center Parcs/input_ Add 35.00_addInsurance'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Payment  Center Parcs/button_Proceed to payment'))

WebUI.click(findTestObject('Object Repository/Recorded objects/Page_Payment  Center Parcs/input_Choose payment method_sa'))

WebUI.setText(findTestObject('Object Repository/Recorded objects/Page_Payment  Center Parcs/input_Enter security code (CVV'), 
    '424')

WebUI.click(findTestObject('CenterParcs/CenterParcs - Booking Journey/Payment/input_Enter a new card_btn--bo'))

WebUI.closeBrowser()

