import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CylinderTest {
    //means test will now accept parameters

    @ParameterizedTest

    //list of values for the test method (as an array of strings)
    //e.g. if I pass 1.0 in for the radius, 1.0 for height, I expect the volume to be 3.14
    @CsvSource({
            "1.0, 1.0, 3.14",
            "2.0, 2.0, 25.13",
            "3.0, 3.0, 84.82",
            "0.0, 1.0, 0.0",
            "1.0, 0.0, 0.0",
            "0.0, 0.0, 0.0"
    })



void testCalculateVolume(double radius, double height, double expectedVolume){
    //arrange
    Cylinder cylinder = new Cylinder();

    //act
    double actualVolume = cylinder.calculateVolume(radius, height);

    //assert
    assertEquals(expectedVolume,actualVolume,"Cylinder with radius of " + radius + "and height of " +
            height + " did not produce expected result of " + expectedVolume + ". Instead produced: " + actualVolume
    );
}


}