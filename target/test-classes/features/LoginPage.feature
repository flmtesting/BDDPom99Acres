Feature: As a user, I should be able to Login successfully into 99acres website  
 
Background: 
	Given User open 99acres website 

@wip2606
Scenario Outline: Login to the Application with valid username and valid password 
	When user click on Hamburger icon
	And user click on register or login button 
	And user enter "<Username>" in input box
	And user click on continue button
	And user enter "<Password>" in input password textbox
	And user click on Login button
	Then validate user icon is present in page
	
	Examples:
	|Username                 |Password    |
	|test858@gmail.com        |Satish@123  |
	
	



	
	 
	

