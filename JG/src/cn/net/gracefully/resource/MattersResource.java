package cn.net.gracefully.resource;

import java.util.List;
import java.util.Map;

import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import cn.net.gracefully.model.matter.Matter;
import cn.net.gracefully.repository.MattersRepository;
import cn.net.gracefully.repository.MattersRepositoryImpl;

public class MattersResource extends ServerResource {


	private String nickname = "";
	@Override
	protected void doInit() throws ResourceException {
		nickname = (String)getRequestAttributes().get("nickname");
	}
	
	public List<Matter> representation() {
		MattersRepository repository = new MattersRepositoryImpl();
		List<Matter> list = repository.getMatterList(null);
		return list;
	}
	
	@Get("xml")
	public Representation toStrin() {
		MattersRepository repository = new MattersRepositoryImpl();
		List<Matter> list = repository.getMatterList(null);
		return new StringRepresentation(list);
	}
}
