package cn.net.gracefully.util;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class VelocityUtil {

	private Template template = null;
	private VelocityContext context = null; 
	static{
		Velocity.init("F:/work/workspace/JG/WebContent/WEB-INF/velocity.properties");
	}
	public void setTemplate(String template) {
		this.template = Velocity.getTemplate("index.jsp");
	}
	public void putData(String key, String value){
		if(context == null){
			context = new VelocityContext();
		}
		context.put(key, value);
	}
	public String merge(){
		StringWriter w = new StringWriter();
		template.merge(context, w);
		return w.toString();
	}
}
