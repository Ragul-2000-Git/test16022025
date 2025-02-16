package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	FileInputStream fs=new FileInputStream("E:\\Workspace\\TestAutomation\\test.properties");
	Properties pp=new Properties();
	pp.load(fs);
String a=	pp.getProperty("url");
System.out.println(a);
System.out.println("TESTING GIT");
				






















	}

}
