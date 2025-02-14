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

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/a_Download'))

WebUI.delay(3)

// Use %USERPROFILE% to create a path that doesn't include the username explicitly
// Editar "\\Downloads" para a pasta para onde forem descarregados os ficheiros

String path = System.getenv("USERPROFILE") + "\\Downloads"

File downloadFolder = new File(path)

if (downloadFolder.exists() && downloadFolder.isDirectory()) {
    List<String> namesOfFiles = Arrays.asList(downloadFolder.list())
    boolean fileDownloaded = namesOfFiles.stream().anyMatch { it.contains("sampleFile") && it.endsWith(".jpeg") }
    
    if (fileDownloaded) { 
        KeywordUtil.markPassed("File downloaded successfully")
    } else { 
        KeywordUtil.markFailed("File not downloaded")
    }
} else {
    KeywordUtil.markFailed("Download folder does not exist or is not accessible")
}
