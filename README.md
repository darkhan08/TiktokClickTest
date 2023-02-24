# TiktokClickTest 

#### First step download [Appium Desktop](https://github.com/appium/appium-desktop) and [Appium Inspector](https://github.com/appium/appium-inspector). 
**Appium Desktop** is an app for Mac, Windows, and Linux which gives you the power of the Appium automation server in a beautiful and flexible UI. It is basically a graphical interface for the Appium Server. <br />
**Appium Inspector** is basically just an Appium client (like WebdriverIO, Appium's Java client, Appium's Python client, etc...) with a user interface. There's an interface for specifying which Appium server to use, which capabilities to set, and then interacting with elements and other Appium commands once you've started a session.

#### Second step Download Android Studio 
Link to download Android studio https://developer.android.com/studio?gclid=Cj0KCQiA3eGfBhCeARIsACpJNU-JttmG2bdlb0WH995UJdEsEDryMp4WeOHUbHSdTVctHeUW7f3Bw0EaArhoEALw_wcB&gclsrc=aw.ds
#### Third step setup JAVA_HOME and ANDROID_HOME 
This is important, Appium server will not work without it. **Pay attention** after you install android studio, setup JAVA_HOME and ANDROID_HOME, open appium desktop and click 'Edit Configurations' button. if ANROID_HOME AND JAVA_HOME fields are not filled in the "Edit Configurations" screen, fill them in manually.
#### Fourth step edit script and run code
In script you must edit DesiredCapabilities  <br />
- capabilities.setCapability(**"deviceName"**, "Mi A2 Lite"); deviceName is-alias, you can write any name
- capabilities.setCapability(**"udid"**, "6788eaed0305"); udid - is device id, connect your device by usb and type ***adb devices*** comand in terminal.
- capabilities.setCapability(**"platformName"**, "Android"); platformName is device platform
- capabilities.setCapability(**"platformVersion"**, "10"); platfrom version in my case Android 10
- capabilities.setCapability(**"appPackage"**, "com.zhiliaoapp.musically"); **appPackage** is application id, in order to get an appPackage, you must download the applications ***apk info*** or ***apk analyzer*** in the play market. Open ***"Apk analyzer"*** and find the app you want to test.
 - capabilities.setCapability(**"appActivity"**, "com.ss.android.ugc.aweme.main.MainActivity"); appActivity is activity that you want to open. In ***"Apk analyzer"*** find the app you want to test and go to section "Activities" where you can see all Activities inside app.
 
 to get more info watch this tutorial https://www.youtube.com/watch?v=N7vY3cPSo8g&list=PLhW3qG5bs-L8npSSZD6aWdYFQ96OEduhk&index=7

#### Appium Inspector
Use the Appium Inspector to find the id of the elements. **in order to use Appium Inspector Appium server must be running and the mobile phone must be connected to the computer**
![image](https://user-images.githubusercontent.com/43945836/221167079-c8b722b2-0808-4f34-9cee-851d78f49d11.png)
