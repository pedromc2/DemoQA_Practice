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
import org.openqa.selenium.WebElement as WebElement


WebUI.callTestCase(findTestCase('DemoQA_HomePage/Access Forms'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_DEMOQA/li_Practice Form'), 0)
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Practice Form'))

// Locate the mandatory fields
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 0)
TestObject mandatoryField = findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName')

//To Do: Other Mandatory Fields

// Scroll to the submit button
WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), 0)

// Submit the form
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), 10)
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

// Verify mandatory fields
String backgroundImage = WebUI.getCSSValue(mandatoryField, 'background-image')
WebUI.verifyMatch(backgroundImage, "url(\"data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' width='12' height='12' fill='none' stroke='%23dc3545' viewBox='0 0 12 12'%3e%3ccircle cx='6' cy='6' r='4.5'/%3e%3cpath stroke-linejoin='round' d='M5.8 3.6h.4L6 6.5z'/%3e%3ccircle cx='6' cy='8.2' r='.6' fill='%23dc3545' stroke='none'/%3e%3c/svg%3e\")", false)

//To Do: Other Mandatory Fields