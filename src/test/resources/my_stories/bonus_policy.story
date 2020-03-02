Meta: Bonus Policy
      The company follows a bonus policy, depending on the passager type and on the mileage

Narrative:
As a company
I want to be able to manage the bonus awardings
So that the policies of the company are followed


Scenario: Usual passager bonus policy
Given we have a usual passanger with a mileage
When the usual passanger travels <mileage1> and <mileage2> and <mileage3>
Then the bonus points of the usual passanger should be <points>


Examples:
| mileage1 | mileage2 | mileage3 | points |
| 349      | 319      | 623      | 64     |
| 456      | 569      | 623      | 66     |
| 484      | 566      | 623      | 68     |
| 263      | 456      | 623      | 70     |