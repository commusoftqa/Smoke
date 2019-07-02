package git.git;

import java.io.IOException;

import org.testng.annotations.Test;

public class test extends FrameworkFinal {

	
	
	
	@Test(priority = 0)
	public static void login() throws InterruptedException, IOException 
	{
		//Login
		launchchrome("https://stage.commusoft.co.uk");
		iwait();
		type("#logintype_clientid","16833");
		type("#logintype_username","ranjit");
		type("#logintype_password","welcome123");
		click("//span[@ng-hide='saving']");
		Thread.sleep(4000);
		
	}
}
