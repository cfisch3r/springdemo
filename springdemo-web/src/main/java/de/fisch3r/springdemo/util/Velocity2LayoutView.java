package de.fisch3r.springdemo.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.Scope;
import org.apache.velocity.tools.ToolboxFactory;
import org.apache.velocity.tools.config.XmlFactoryConfiguration;
import org.apache.velocity.tools.view.ViewToolContext;
import org.springframework.web.context.support.ServletContextResource;

/**
 * This view extensions adds support for velocity tools 2.0.
 * 
 * For details see <a href="http://www.elepha.info/elog/archives/305-configuring-velocity-tools-20-in-spring.html>blog post</a>
 * 
 * @author retrorunner
 *
 */
public class Velocity2LayoutView extends
		org.springframework.web.servlet.view.velocity.VelocityLayoutView {

	@Override
    protected Context createVelocityContext(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
            // Create a ViewToolContext instance since ChainedContext is deprecated in Velocity Tools 2.0.
            ViewToolContext velocityContext = new ViewToolContext(
                            getVelocityEngine(), request, response, getServletContext());
            velocityContext.putAll(model);

            // Load a Configuration and publish toolboxes to the context when necessary
            if (getToolboxConfigLocation() != null) {
                    XmlFactoryConfiguration cfg = new XmlFactoryConfiguration();
                    cfg.read(new ServletContextResource(getServletContext(), getToolboxConfigLocation()).getURL());
                    ToolboxFactory factory = cfg.createFactory();

                    velocityContext.addToolbox(factory.createToolbox(Scope.APPLICATION));
                    velocityContext.addToolbox(factory.createToolbox(Scope.REQUEST));
                    velocityContext.addToolbox(factory.createToolbox(Scope.SESSION));
            }

            //change layout url according to request parameter
            if (request.getMethod().equals("GET") && (null != request.getParameter("layout"))) {
            	setLayoutUrl(request.getParameter("layout") + "Layout.vm");
            }

            return velocityContext;
    }

}
