SmartMailbox

An IoT application that sends notification to a user when a mailbox has been opened.

Application stack: This application is ran using a combination of different tools, API's, and frameworks. Framework description: TI SensorTag -> Mobile phone as a gateway using EvoThings -> AWS: DynamoDB, Lambda, and SNS.-> Firebase -> Android phone app

Prerequisites:

Evothings workbench: https://evothings.com/download/ and Evothings Viewer app from Google play store (only available on Android)
TI Sensortag
How to run:

Pull the repository
Download the android studio APK to phone A
Connect to Evothings workbench through Evothings viewer app
Drag the Index.html file from SmartMailbox\Index.html onto the My Apps section of Evothings workbench and select run
The evothings smartmailbox app should run on phone B
Start the sensor.
Connect the sensor to the Evothings viewer app on phone B
Attach the sensor to the door of the mailbox
Close the door and open again to test it
The application should send a notification to the android app on the phone A
For any questions about this project or files within please conatact either Jessica or Swetha.

Jessica E-mail: jess2018@uw.edu, Swetha E-mail: stahtews@gmail.com
