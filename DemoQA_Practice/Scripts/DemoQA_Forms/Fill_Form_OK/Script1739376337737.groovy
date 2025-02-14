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

WebUI.callTestCase(findTestCase('DemoQA_HomePage/Access Forms'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 'First')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), 'Last')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'firstlast@email.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '12 Feb 2025')

WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_12'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'Maths')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Maths'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'sc')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Computer Science'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'g')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Biology'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_MathsComputer ScienceBiology'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Music'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'test address')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Select State_react-select-3-input'), 'n')

WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/div_Select City'), 0)
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Delhi'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_First Last'), 'First Last')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_firstlastemail.com'), 'firstlast@email.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_Male'), 'Male')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_1234567890'), '1234567890')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_12 February,2000'), '12 February,2000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_Maths, Computer Science, Biology'), 'Maths, Computer Science, Biology')

WebUI.rightClick(findTestObject('Object Repository/Page_DEMOQA/td_test address'))

WebUI.rightClick(findTestObject('Object Repository/Page_DEMOQA/td'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_test address'), 'test address')

WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/td_NCR Delhi'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_DEMOQA/td_NCR Delhi'), 'NCR Delhi')

WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/button_Close'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Close'))

WebUI.closeBrowser()

