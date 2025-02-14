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
import com.kms.katalon.core.util.KeywordUtil

WebUI.callTestCase(findTestCase('DemoQA_HomePage/Access Elements'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Upload and Download'))

String filePath = System.getenv("USERPROFILE") + "\\Downloads\\UploadFileExample.txt"

// Create the file
File file = new File(filePath)
file.createNewFile()
file.write("This is a sample file content")

//String filePath = System.getenv("USERPROFILE") + "\\Downloads\\sampleFile.jpeg"

// Verify the TestObject for the file input element
TestObject uploadInput = findTestObject('Object Repository/Page_DEMOQA/input_Select a file_uploadFile')

//upload the file into input
WebUI.sendKeys(uploadInput, filePath)

// Verify the file upload
WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/p_uploadedFilePath'), 'C:\\fakepath\\UploadFileExample.txt')