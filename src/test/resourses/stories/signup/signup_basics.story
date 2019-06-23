Narrative:
This story covers basics test of signup


Lifesycle:
Before:
Given I open sign up page


Scenario: Type invalid year
When I set date:
|month    |day|year|
|December |15 |85  |
|October  |1  |80  |
|September|5  |90  |
And I check share
Then I see error "Please enter a valid year."
And I do not see error "When were you born?"




Scenario: Type invalid email
Meta: @skip
When I type email "test@mail.test"
And I type confirmation email "wrong@mail.test"
And I type name "Testname"
And I click signup
Then I see error "Email address doesn't match."
And I see error "Not exist"

Scenario: Sign up with empty password
Meta: @skip
Given I open sign up page
When I type email "test@mail.test"
And I type confirmation email "test@mail.test"
And I type name "Testname"
And I click signup
Then I see error "Please choose a password."

Scenario: Type ivalid values
When I type email "test@mail.test"
And I type confirmation email "wrong@test.mail"
And I type password "qweqwe!"
And I type name "Name"
And I select sex "Male"
And I uncheck share
And I click signup
Then I see "4" error
And I see that "3" error "When were you born"