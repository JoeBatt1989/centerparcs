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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/signInRegisterBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/signInRegisterBtn'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - Login_Register/LogIn/submitBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - Login_Register/LogIn/registerTab'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/inputFirstName'), 0)

WebUI.selectOptionByValue(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/titleDropDown'), 'OTHR', true)

WebUI.setText(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/inputFirstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/inputLastName'), GlobalVariable.lastName)

WebUI.setText(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/emailAddress'), ('cpsit.tester1+' + GlobalVariable.emailAddress) + 
    '@gmail.com')

WebUI.setText(findTestObject('CenterParcs/Centerparcs - Login_Register/Register/password'), 'Password123')

WebDriver driver = DriverFactory.getWebDriver()

registerButton = driver.findElements(By.xpath('//*[@value = \'Create an account\']' //driver.findElements(By.xpath('//*[@class = \'gigya-input-submit\']')) // data-screenset-element-id="__gig_template_element_35_1537196833246"
        ))

registerButton[1].submit()

