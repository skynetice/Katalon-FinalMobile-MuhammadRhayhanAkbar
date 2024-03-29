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

Mobile.startApplication('C:\\Users\\skyne\\Documents\\1. BRI\\Bootcampt\\Automation\\Shop\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('TC 1 - Login/android.widget.RelativeLayoutUsername'), 'nicehsk', 0)

Mobile.setText(findTestObject('TC 1 - Login/android.widget.RelativeLayoutPW'), 'Bumblebee1', 0)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.Button - NO'), 0)

Mobile.setText(findTestObject('Object Repository/TC 2 - Cart/android.widget.EditText - Search'), 'pavilion', 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.TextView - APPLY'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.Button - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/TC 2 - Cart/android.widget.TextView - Remove'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/TC 2 - Cart/android.widget.TextView - Shopping Cart (0)'), 'Shopping Cart (0) ')

Mobile.closeApplication()

