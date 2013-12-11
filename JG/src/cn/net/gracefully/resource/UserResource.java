package cn.net.gracefully.resource;

import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import cn.net.gracefully.util.VelocityUtil;

public class UserResource extends ServerResource{

	private String nickname = "";
	@Override
	protected void doInit() throws ResourceException {
		nickname = (String)getRequestAttributes().get("nickname");
	}
	
	@Get("html")
	@Override
	public String toString() {
		VelocityUtil vu = new VelocityUtil();
		vu.setTemplate("index.jsp");
		vu.putData("nickname", nickname);
		return vu.merge();
	}
}
