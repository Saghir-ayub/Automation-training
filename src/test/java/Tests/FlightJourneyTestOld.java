package Tests;


public class FlightJourneyTestOld {
//    static DriverFactory driverFactory = new DriverFactory();
//    public static WebDriver driver = driverFactory.getDriver();
//    private final HomePage homepage = new HomePage(driver);
//    private final PurchasePage purchasePage = new PurchasePage(driver);
//    private final FlightJourney flightJourney = new FlightJourney(driver);
//
//    @BeforeClass
//    public static void beforeClass() {
//        //before class
//    }
//
//    @Before
//    public void individualSetUp() {
//        homepage.goTo();
//    }
//
//    @Test
//    public void selectFlight() {
//        String[] departureCities = {"Paris", "Philadelphia"};
//        String[] destinationCities = {"Buenos Aires", "London"};
//
//        for (String departureCity : departureCities) {
//            for (String destinationCity : destinationCities) {
//                homepage.chooseDepartureCity(departureCity);
//                homepage.chooseDestinationCity(destinationCity);
//                homepage.findFlights();
//                flightJourney.verifyCorrectFlight(departureCity, destinationCity);
//                homepage.goTo();
//            }
//        }
//    }
//
//    @Test
//    public void chooseFlightByFlightNumber() {
//        homepage.chooseDepartureCity("Paris");
//        homepage.chooseDestinationCity("Rome");
//        homepage.findFlights();
//        flightJourney.selectByFlightNumber("9696");
//        purchasePage.verifyCorrectFlightPath();
//    }
//
//    @After
//    public void after() throws IOException {
//        TakesScreenshot screenshot = ((TakesScreenshot) driver);
//        File scrShot = screenshot.getScreenshotAs(OutputType.FILE);
//        File destFile = new File("C:\\Users\\saghir.ayub\\Documents\\Exceptions");
//
//        try {
//            FileUtils.copyFileToDirectory(scrShot, destFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @AfterClass
//    public static void individualTearDown() {
//        driver.quit();
//    }

}
