package com.itr.control;

import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author newlife
 */
@Named
@RequestScoped
public class LogoutBean {
    
    public void logoutAction() throws IOException {        
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();        
        context.invalidateSession();
        context.redirect(context.getRequestContextPath());
    }   
}
