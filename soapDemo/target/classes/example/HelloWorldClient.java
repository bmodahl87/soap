package example;/**
 * Created by bmodahl on 2/27/17.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      com.daehosting.temperatureconversions.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
