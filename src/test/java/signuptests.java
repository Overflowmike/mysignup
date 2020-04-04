public class signuptests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/r.php?_rdc=1&_rdr");

        Thread.wait(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.label=("First name")).sendKeys("Avatar");
        driver.findElement(By.label=("Surname")).sendKeys("AV");
        driver.findElement(By.label=("Mobile number or email address")).sendKeys("rskeqemm2@bareed.ws");
        driver.findElement(By.label=("new-password")).sendKeys("Rs001@");

        driver.findElement(By.label=("birthday_day")).sendKeys("05");
        driver.findElement(By.label=("birthday_month")).sendKeys("Oct");
        driver.findElement(By.label=("birthday_year")).sendKeys("1990");

        driver.findElement(By.label=("sex")).sendKeys("female");

        driver.findElement(By.id("Signupbutton")).click(); }

    public static void main(String args[]) throws InterruptedException {
        signuptests = new signuptests();
        signuptests.setUp();

    }
}
