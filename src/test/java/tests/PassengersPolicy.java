package tests;

import flight.BusinessFlight;
import flight.EconomyFlight;
import flight.Flight;
import flight.Passenger;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.jupiter.api.Assertions;

public class PassengersPolicy {

    private Flight economicFlight;
    private Flight businessFlight;
    private Passenger mike;
    private Passenger luck;


    @Given("there is an economy flight")
    public void givenThereIsAnEconomyFlight() {
        this.economicFlight = new EconomyFlight("1");
    }

    @When("we have a usual passager")
    public void whenWeHaveAUsualPassager() {
        this.mike = new Passenger("Mike", false);
    }

    @Then("you can add or remove him from an economy flight")
    public void thenYouCanAddOrRemoveHimFromAnEconomyFlight() {
        Assertions.assertAll("Verify all conditions for usual passanger and economy flight",
                () -> Assertions.assertEquals("1", economicFlight.getId()),
                () -> Assertions.assertEquals(true, economicFlight.addPassenger(mike)),
                () -> Assertions.assertEquals(1, economicFlight.getPassengersList().size()),
                () -> Assertions.assertEquals("Mike", mike.getName()),
                () -> Assertions.assertEquals(true, economicFlight.removePassenger(mike)),
                () -> Assertions.assertEquals(0, economicFlight.getPassengersList().size()));
    }

    @When("we have a VIP passanger")
    public void whenWeHaveAVipPassanger() {
        this.luck = new Passenger("Lick", true);
    }

    @Then("you can add him but not remove him from the economy flight")
    public void thenYouCanAddHimButNotRemoveHimFromTheEconomyFlight() {
        Assertions.assertAll("Verify all conditions for a usual passanger and business flight",
                () -> Assertions.assertEquals(true, economicFlight.addPassenger(mike)),
                () -> Assertions.assertEquals(1, economicFlight.getPassengersList().size()),
                () -> Assertions.assertEquals(true, economicFlight.removePassenger(mike)),
                () -> Assertions.assertEquals(0, economicFlight.getPassengersList().size()));
    }

    @Given("there is an business flight")
    public void givenThereIsAnBusinessFlight() {
        this.businessFlight = new BusinessFlight("1");
    }

    @Then("you can add or remove him from an business flight")
    public void thenYouCanAddOrRemoveHimFromAnBusinessFlight() {
        Assertions.assertAll("Verify all conditions for a usual passanger and business flight",
                () -> Assertions.assertEquals(false, businessFlight.addPassenger(mike)),
                () -> Assertions.assertEquals(0, businessFlight.getPassengersList().size()),
                () -> Assertions.assertEquals(false, businessFlight.removePassenger(mike)),
                () -> Assertions.assertEquals(0, businessFlight.getPassengersList().size()));
    }
}
