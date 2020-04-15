package onlineShop.log;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger")
public class ServerLogger implements Logger {

	public void log(String info) {
		// TODO Auto-generated method stub
		System.out.println("Server log = " + info);
	}

}
