package TestingPKG;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.SerenityStory;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.protocol.HTTP;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.print.resources.serviceui_es;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by abhishek.verma02 on 29-12-2016.
 */
public class TestClass extends SerenityStory {

    @Given("I print my $name")
    public void displayname(String name){
        System.out.println("Abhishek First Test"+name);

    }
    @Then("I do nothing")
    public void displaynamenothing(){
        System.out.println("nothing");

    }

    @Given("I open my $weblink")
    public void opensite(String weblink) throws MalformedURLException, URISyntaxException {
        System.out.println("SItE To oPen iS::::"+weblink);
        WebDriver driver =new FirefoxDriver();
        URIBuilder u=new URIBuilder().setScheme("http").setHost(weblink);
        URI uri= u.build();
        driver.get(u.toString());
    }




}
