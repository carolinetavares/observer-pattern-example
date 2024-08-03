public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay1 = new PhoneDisplay("1");
        PhoneDisplay phoneDisplay2 = new PhoneDisplay("2");
        WindowDisplay windowDisplay1 = new WindowDisplay("A1");

        weatherStation.registerObserver(phoneDisplay1);
        weatherStation.registerObserver(phoneDisplay2);
        weatherStation.registerObserver(windowDisplay1);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(phoneDisplay2);
        weatherStation.setTemperature(28.0f);
    }
}