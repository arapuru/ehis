/**
 * 
 */
package com.cluster.ehis.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.cluster.ehis.utils.HibernateUtil;

/**
 * @author aravind rapuru
 *
 */
public class AppServletContextListener implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		HibernateUtil.getSessionFactory();
		
	}

}
