Feature: Adaction Booking

Scenario: Login Application

Given user is launching the application
When enter the username in username field
And enter the password in password field
Then click on the login Button And It Navigate to Search Hotel page

Scenario: Search Hotel

When user select the location
And user select the Hotels
And user select the Room Types
And user select the Number of Rooms
And user select the Check In Date
And user select the Check Out Date
And user select the Adults Per Room
And user select the Childerns Per Room
And user click on the Search Button And It Navigate to Select Hotel Page

Scenario: Select Hotel

When user click on the Select Hotel Button
Then user click on the submit Button And It will Navigate to Book Hotel Page

Scenario: Book Hotel

When user enter the First Name
And user enter the Last Name
And user enter the Billing Address
And user enter the Credit Card No
And user enter the Credit Card Type
And user enter the Expiry Date Month
And user enter the Credit Card CVV Number
And user click on the Book Now Button And It will Navigate to Booking Confirmation

Scenario: 






