package listeneersdemo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class ListnerDemo implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
        System.out.println("session created");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        System.out.println("on session invalidate");
    }
	
}
