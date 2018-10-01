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

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'), 
    0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/aquaSanaExperienceLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/aquaSanaExperienceText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/spaEtiquetteLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Etiquette/spaEtiquetteText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/spaLocationsLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Locations/spaLocationsText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Days/spaDaysText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaPackagesLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Packages/spaPackagesText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/treatmentsLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Treatments/treatmentText'), 0)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Breaks/spaBreaksTab'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Breaks/spaBreaksTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Breaks/spaBreaksLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Breaks/spaBreaksText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Breaks/spaBreaksTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Breaks/luxurySpaLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Luxury Breaks/luxuryBreakText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Treatments/spaTreatmentsTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Treatments/spaTreatmentsLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Treatments/treatmentText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/newsOffersTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/newsLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - News/newsText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/newsOffersTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/offersLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Offers/offersText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/newsOffersTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/News_Offers/lifestyleLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Lifestyle/lifestyleText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Help Links/helpLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Help/contactUsText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Help Links/signUpEmailLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Email Sign Up/signUpText'), 0)

