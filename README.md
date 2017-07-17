# SmartMailbox
An IoT application that sends notification to a user when a mailbox has been opened.

Application stack:
This application is ran using a combination of different tools, API's, and frameworks.
Framework description:
TI SensorTag -> Mobile phone as a gateway using EvoThings -> AWS: DynamoDB, Lambda, and SNS.-> 
Firebase -> Android phone app

Prerequisites: 
1. Evothings workbench: https://evothings.com/download/ and Evothings Viewer app from Google play store (only available on Android)
2. TI Sensortag
 
How to run:
1. Pull the repository
2. Download the android studio APK to phone A
3. Connect to Evothings workbench through Evothings viewer app  
4. Drag the Index.html file from SmartMailbox\Index.html onto 
the My Apps section of Evothings workbench and select run
5. The evothings smartmailbox app should run on phone B
6. Start the sensor. 
7. Connect the sensor to the Evothings viewer app on phone B
8. Attach the sensor to the door of the mailbox
9. Close the door and open again to test it
10. The application should send a notification to the android app on the phone A

For any questions about this project or files within please conatact either Jessica or 
Swetha. 

Jessica E-mail: jess2018@uw.edu, Swetha  E-mail: stahtews@gmail.com

