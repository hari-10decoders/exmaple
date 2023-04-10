package step;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import runner.runner;

public class stepde {
	public static WebDriver driver = runner.driver;
	@Given(": User lauch the web application")
	public void user_lauch_the_web_application() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	@When(": User enter the click the radio button on Radio button Example field")
	public void user_enter_the_click_the_radio_button_on_radio_button_example_field() {
	}
	@When(": User enter the country in Radio button Example Suggession Class Example field")
	public void user_enter_the_country_in_radio_button_example_suggession_class_example_field() {
	}
	@When(": User select the option in Dropdown Examples field")
	public void user_select_the_option_in_dropdown_examples_field() {
	}
	@When(": User click the open window in Switch Window Example field")
	public void user_click_the_open_window_in_switch_window_example_field() {
	}
	@When(": User click the Alert button and handle the alert in simple alert")
	public void user_click_the_alert_button_and_handle_the_alert_in_simple_alert() {
	}
	@When(": User click the confirm alert and handle the confirm alert field")
	public void user_click_the_confirm_alert_and_handle_the_confirm_alert_field() {
	}
	@When(": User click and enter the data and handle promt alert in promt alert field")
	public void user_click_and_enter_the_data_and_handle_promt_alert_in_promt_alert_field() {
	}
	@When(": User click the and enter the data and handle promt alert in promt alert field")
	public void user_click_the_and_enter_the_data_and_handle_promt_alert_in_promt_alert_field() {
	}
	@When(": User click and select the text from table in Web Table Example")
	public void user_click_and_select_the_text_from_table_in_web_table_example() {
	}


}
