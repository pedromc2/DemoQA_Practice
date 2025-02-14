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

WebUI.callTestCase(findTestCase('DemoQA_HomePage/Access Elements'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Check Box'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg_Check Box_rct-icon rct-icon-uncheck'))

// Verify the header exists
WebUI.verifyTextPresent("You have selected :", false) 

WebUI.verifyTextPresent("home", false) 
WebUI.verifyTextPresent("desktop", false) 
WebUI.verifyTextPresent("notes", false) 
WebUI.verifyTextPresent("commands", false) 
WebUI.verifyTextPresent("documents", false) 
WebUI.verifyTextPresent("workspace", false) 
WebUI.verifyTextPresent("react", false) 
WebUI.verifyTextPresent("angular", false) 
WebUI.verifyTextPresent("veu", false) 
WebUI.verifyTextPresent("office", false) 
WebUI.verifyTextPresent("public", false) 
WebUI.verifyTextPresent("private", false) 
WebUI.verifyTextPresent("classified", false) 
WebUI.verifyTextPresent("general", false) 
WebUI.verifyTextPresent("downloads", false) 
WebUI.verifyTextPresent("wordFile", false) 
WebUI.verifyTextPresent("excelFile", false) 

//é posível combinar as checkboxes desejadas com o resultado esperado, caso seja necessário adicionar casos de teste para itens ou combinações específicas