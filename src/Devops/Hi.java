package Devops;
import java.util.*;

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String u_name = "shahidbysui@gmail.com";
		String pwd = "suiii@2004";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String ip1 = sc.nextLine();
		System.out.println("enter password");
		String ip2 = sc.nextLine();
		if(u_name.equals(ip1) && pwd.equals(ip2))
		{
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login Failed");
		}
	}

}