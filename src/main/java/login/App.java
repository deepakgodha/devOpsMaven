package login;

import java.io.FileInputStream;
import java.util.Properties;

public class App {
	public boolean userLogin(String user,String pwd)
	{
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/credentials.property"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid file reading");
		}
		String un=prop.getProperty("user");
		String pass=prop.getProperty("pwd");
		if(user.equals(un) && pwd.equals(pass))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
