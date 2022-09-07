//package br.ada;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Test;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.time.temporal.ChronoUnit;
//
//import static org.apache.commons.io.FileUtils.copyFile;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class AppTest {
//
////    @Test
////    public void givenAValidClientAccount_WhenClienteSelecionaDeposito_DeveInserirSenha_EntaoOValorEstaraNaConta() {
////        Cliente cliente = new Cliente();
////
////        ATM atm = new ATM();
////        ATM atmResult = atm.deposit(cliente, quantidade);
////
////        atmResult.confirm(cliente, "senha");
////
////        Conta conta = cliente.getConta();
////
////        conta.getSaldo();
////    }
//
//    @Test
//    public void givenAFormWIthSobrenomeEmpty_WhenUserClickSubmit_ThenAlertRaised() {
//        WebDriverManager.chromedriver().browserVersion("103.0.5060.134").setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("file:///C:/dev/ada-upskilling-selenium/src/main/java/br/ada/aula_4/campo_treinamento/componentes.html");
//
//        WebElement inputNome = driver.findElement(By.id("form_nome"));
//        inputNome.sendKeys("Teste");
//
//        WebElement inputSobrenome = driver.findElement(By.id("form_sobrenome"));
//
//        WebElement inputSexo = driver.findElement(By.id("form_sexo:0"));
//        inputSexo.click();
//
//        WebElement comida = driver.findElement(By.id("comida:3"));
//        comida.click();
//
//        String expectedAlert = "Por favor preencha o campo [sobrenome]";
//
//        WebElement cadastrar = driver.findElement(By.id("cadastrar"));
//        cadastrar.click();
//
//        Alert alert = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS))
//                .until(ExpectedConditions.alertIsPresent());
//
//        // Armazena o texto em uma variavel
//        String text = alert.getText();
//
//        assertThat(text).isEqualTo(expectedAlert);
//
//        //Pressiona botão OK
//        alert.accept();
//
//        inputSobrenome.sendKeys("Testador");
//
//        driver.quit();
//    }
//
//    @Test
//    public void shouldOpenLetsCodeBlogAndDisplayedTrueAfterClick() throws InterruptedException, IOException {
//        WebDriverManager.chromedriver().browserVersion("103.0.5060.134").setup();
//
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://letscode.com.br/blog");
//
//        WebElement firstResult = new WebDriverWait(webDriver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.id("get-more-posts")));
//
//        assertThat(firstResult.isDisplayed()).isTrue();
//        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
//        copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
//        webDriver.quit();
//
//        Thread.sleep(1000);
//    }
//
//    @Test
//    public void activeElementTest1() throws InterruptedException {
//        WebDriverManager.chromedriver().browserVersion("103.0.5060.134").setup();
//        WebDriver driver = new ChromeDriver();
//        try {
//            driver.get("https://phptravels.com/demo/");
//
//            WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
//            firstName.sendKeys("Cauê");
//
//            WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
//            lastName.sendKeys("do Prado");
//
//            WebElement businessName = driver.findElement(By.xpath("//input[@name='business_name']"));
//            businessName.sendKeys("Teste");
//
//            WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//            email.sendKeys("caueprado@gmail.com");
//
//            WebElement loader = driver.findElement(By.xpath("xpath=//span[@id='recaptcha-anchor']/div"));
//            loader.click();
//            loader.submit();
//            WebElement button = driver.findElement(By.id("demo"));
//            button.submit();
//
//            // Obter atributo do elemento atualmente ativo
//            Thread.sleep(10000);
//        } finally {
////            driver.quit();
//        }
//    }
//}
