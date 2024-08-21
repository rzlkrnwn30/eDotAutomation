import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open eDot
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.edot.id')
WebUI.maximizeWindow()

// Navigate to eSuite
WebUI.click(findTestObject('Object Repository/header/button_product'))
WebUI.click(findTestObject('Object Repository/header/menu_eSuite'))
WebUI.click(findTestObject('Object Repository/header/button_product'))

// Assertion
WebUI.delay(3)
String url = WebUI.getUrl()
WebUI.verifyMatch(url, "https://edot.id/products/esuite", false)
WebUI.verifyElementVisible(findTestObject('Object Repository/eSuite_page/img_eSuite'))
WebUI.verifyElementVisible(findTestObject('Object Repository/eSuite_page/text_title_eSuite'))
WebUI.verifyElementVisible(findTestObject('Object Repository/eSuite_page/text_desc_eSuite'))