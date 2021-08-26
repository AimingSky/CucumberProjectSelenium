Feature: File 

Background: 
	Given load browser 
	
Scenario: File 
	Given open file 
	
Scenario Outline: JavaOne 
	Given open file 
	Then close file
	Given <name> <value> 
	
	Examples: 
		|name|value|
		|one|www.google.com| 
		|Two|www.google.com|
	Examples: 
		|name|value|
		|one|www.google.com| 
		|Two|www.google.com| 