import com.techelevator.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTests {


    @Test
    public void Test_Estimated_Cost() {
        HotelReservation hotelReservation = new HotelReservation("test", 10);

        double actual = hotelReservation.getEstimatedTotal();

        Assert.assertEquals(599.90, actual, .5);


    }

    @Test
    public void Test_Minibar_and_Cleaning_Total() {
        HotelReservation hotelReservation = new HotelReservation("test", 10);
        double expected = 682.87;
        double actual = hotelReservation.actualTotal(true, true);

        Assert.assertEquals(expected, actual, .5);
    }

    @Test
    public void Test_Minibar_and_No_Cleaning_Total() {
        HotelReservation hotelReservation = new HotelReservation("test", 10);
        double expected = 634.89;
        double actual = hotelReservation.actualTotal(false, true);

        Assert.assertEquals(expected, actual, .5);
    }
    @Test
    public void Test_No_Minibar_and_Yes_Cleaning_Total() {
        HotelReservation hotelReservation = new HotelReservation("test", 10);
        double expected = 612.89;
        double actual = hotelReservation.actualTotal(true, false);

        Assert.assertEquals(expected, actual, .5);
    }
}