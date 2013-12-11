package cn.net.gracefully.rest;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Redirector;

/**
 * Application redirecting to a target URI
 * 
 * @author Jerome Louvel (contact@noelios.com)
 *
 */
public class RedirectApplication extends Application {

	/** The target URI template. */
	private String targetUri;
	
	/** Indicates if the redirection is permanent or temporary. */
	private boolean permanent;
	
	/**
     * Constructor.
     *
     * @param parentContext
     *            The parent context. Typically the component's context.
     * @param targetUri
     *            The target URI template.
     * @param permanent
     *            Indicates if the redirection is permanent or temporary.
     */
    public RedirectApplication(Context parentContext, String targetUri,
            boolean permanent) {
        super(parentContext);
        this.targetUri = targetUri;
        this.permanent = permanent;
    }
    @Override
    public String getName() {
        return "Redirection application";
    }
    @Override
    public Restlet createRoot() {
        int mode = (this.permanent) ? Redirector.MODE_CLIENT_PERMANENT
                : Redirector.MODE_CLIENT_TEMPORARY;
        return new Redirector(getContext(), this.targetUri, mode);
    }
}

