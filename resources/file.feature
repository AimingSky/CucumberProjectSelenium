Feature: File 

Background: 
	Given load browser 
	
Scenario: File 
	Given open file 
	Given Login with credentials 
		|email|RGV.gmail.com|
		|password|passwordRgv@RGV|
	Given close broswer
	
Scenario Outline: JavaOne 
	Given open file 
	Given Login with credentials 
		|email|<email>|
		|password|<password>|
	Given close broswer
	Examples: 
	|email|password|
	|password@124|email@123|