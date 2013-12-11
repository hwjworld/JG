package cn.net.gracefully.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

import cn.net.gracefully.Constants;

public class StaticApplication extends Application{
	@Override
	public Restlet createInboundRoot() {
		Router router = new Router();
		Directory directory = new Directory(getContext(), Constants.ROOT_URI+"/css");
		directory.setListingAllowed(true);
		router.attach("/css",directory);
		Directory directory1 = new Directory(getContext(), Constants.ROOT_URI+"/js");
		directory1.setListingAllowed(true);
		router.attach("/js",directory1);
		
		return router;
	}
}
