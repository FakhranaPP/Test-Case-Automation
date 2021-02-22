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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.scrollToElement(findTestObject('Checkout Produk - Dynamic Website/text_Gorilla Baso Urat Sambal Kacang'), 0)

WebUI.click(findTestObject('Checkout Produk - Dynamic Website/text_200 gr'))

WebUI.delay(GlobalVariable.G_Delay)

WebUI.scrollToElement(findTestObject('Checkout Produk - Dynamic Website/text_Ulasan Pembeli'), 0)

WebUI.click(findTestObject('Checkout Produk - Dynamic Website/button_Tambah ke Keranjang'))

WebUI.delay(GlobalVariable.G_Delay)

WebUI.click(findTestObject('Checkout Produk - Dynamic Website/button_Lihat Keranjang'))

WebUI.delay(GlobalVariable.G_Delay)

