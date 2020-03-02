package tests;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BonusPolicy {

    @Given("we have a usual passanger with a mileage")
    public void givenWeHaveAUsualPassangerWithAMileage() {

    }

    @When("the usual passanger travels <mileage1> and <mileage2> and <mileage3>")
    public void whenTheUsualPassangerTravelsMileageAndMileageAndMileage(@Named("mileage1") int mileage1,
                                                                        @Named("mileage2") int mileage2,
                                                                        @Named("mileage3") int mileage3) {
        System.out.println("mileage1 = " + mileage1 + ", mileage2 = " + mileage2 + ", mileage3 = " + mileage3);
    }

    @Then("the bonus points of the usual passanger should be <points>")
    public void thenTheBonusPointsOfTheUsualPassangerShouldBePoints(@Named("points") String points) {
        System.out.println("points = " + points);
    }
}
