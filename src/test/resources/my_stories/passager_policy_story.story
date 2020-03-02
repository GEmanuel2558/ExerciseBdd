Meta: Passager Policy
      The company follows a policy of adding and removing passagers, depending on the passager type and on the flight type


Narrative:
As a company
I want to be able to passagers and flights
So that the policies of the company are followed

Scenario: Economy flight, usual passager
Given there is an economy flight
When we have a usual passager
Then you can add or remove him from an economy flight

Scenario: Economy flight, VIP passanger
Given there is an economy flight
When we have a VIP passanger
Then you can add him but not remove him from the economy flight


Scenario: Business flight, usial passanger
Given there is an business flight
When we have a usual passager
Then you can add or remove him from an economy flight


Scenario: Business flight, VIP passanger
Given there is an business flight
When we have a VIP passanger
Then you can add or remove him from an economy flight