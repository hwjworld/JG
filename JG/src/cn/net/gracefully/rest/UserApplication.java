package cn.net.gracefully.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import cn.net.gracefully.resource.MatterResource;
import cn.net.gracefully.resource.MattersResource;
import cn.net.gracefully.resource.UserResource;

public class UserApplication extends Application {
	@Override
	public Restlet createInboundRoot() {
		Router router = new Router();
		router.attach("/{nickname}", UserResource.class);
		router.attach("/{nickname}/matter/", MattersResource.class);
		router.attach("/{nickname}/matter/{matterId}", MatterResource.class);
		return router;
	}
}
