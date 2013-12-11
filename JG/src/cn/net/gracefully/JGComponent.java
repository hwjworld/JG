package cn.net.gracefully;

import org.restlet.Component;
import org.restlet.data.Protocol;

import cn.net.gracefully.rest.StaticApplication;
import cn.net.gracefully.rest.UserApplication;

public class JGComponent extends Component {
	public JGComponent() {

//		getLogService().setLoggerName("cn.net.gracefully.jg.www34");
        getClients().add(Protocol.FILE);
        
		getDefaultHost().attach("/user", new UserApplication());
		getDefaultHost().attach("/common", new StaticApplication());
		
	}

    public static void main(String[] args) throws Exception {
    	int port = 8111;
        // Create a component
        Component component = new JGComponent();
//        VirtualHost host = new VirtualHost(component.getContext());
//        host.setHostDomain("www.rs.org|127.0.0.1");
//        host.setHostPort("80|"+Integer.toString(port));
//        host.attach(new RedirectApplication(component.getContext(), "http://baidu.com{rr}", false));
//        component.getHosts().add(host);
        component.getServers().add(Protocol.HTTP, port);
        component.start();
    }
}
