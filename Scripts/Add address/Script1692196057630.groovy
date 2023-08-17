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

Mobile.startExistingApplication('com.pmaapp.ehashtag')

Mobile.tap(findTestObject('Object Repository/address/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/address/com.horcrux.svg.PathView'), 0)

Mobile.tap(findTestObject('Object Repository/address/android.widget.TextView - My Account'), 0)

Mobile.tap(findTestObject('Object Repository/address/android.widget.TextView - Addresses List'), 0)

Mobile.tap(findTestObject('Object Repository/address/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input recipients name'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input recipients name (1)'), 'winrou', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input number'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input number (1)'), '081232838414', 0)

Mobile.tap(findTestObject('Object Repository/com.horcrux.svg.PathView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input full address'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input full address (1)'), 'Salatiga', 0)

Mobile.tap(findTestObject('Object Repository/com.horcrux.svg.SvgView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input note address'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input note address (1)'), 'Salatiga', 0)

Mobile.tap(findTestObject('Object Repository/com.horcrux.svg.PathView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Input label address'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input label address (1)'), 'Salatiga', 0)

Mobile.tap(findTestObject('Object Repository/com.horcrux.svg.SvgView (1)'), 0)

Mobile.tap(findTestObject('address/com.horcrux.svg.SvgView'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Search province'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search province (1)'), 'jawa tengah', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Jawa Tengah'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Jawa Tengah'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Choose city  regency'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Search city  regency'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search city  regency (1)'), 'salatiga', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Kota Salatiga'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Kota Salatiga'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Choose district'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - SIDOMUKTI'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Choose ward'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Kalicacing'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Save Address'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Save Address'), 0)

Mobile.tap(findTestObject('Object Repository/com.horcrux.svg.PathView (7)'), 0)

Mobile.closeApplication()

