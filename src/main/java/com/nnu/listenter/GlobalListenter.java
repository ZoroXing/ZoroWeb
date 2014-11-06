/**
 * 
 */
package com.nnu.listenter;

import java.io.Serializable;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author xingjl
 *
 * 监听器Listener 就是在application,session,request 三个对象创建、销毁或者
 * 往其中添加、修改、删除属性时自动执行的功能组件,Listener分为三类：
 * 1. ServletContext监听
 *    a. javax.servlet.ServletContextListener ServletContext(application)创建、销毁时触发
 *    b. javax.servlet.ServletContextAttributeListener ServletContext添加删除属性时触发
 *    
 * 2. Session监听
 *    a. javax.servlet.http.HttpSessionAttributeListener
 *    b. javax.servlet.http.HttpSessionListener
 *    
 * 3. request监听
 *    a. ServletRequestListener
 *    b. ServletRequestAttributeListener
 */
public class GlobalListenter  implements ServletContextListener,ServletContextAttributeListener,
                              HttpSessionListener,HttpSessionAttributeListener,
                              ServletRequestListener,ServletRequestAttributeListener{

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletRequestAttributeListener#attributeAdded(javax.servlet.ServletRequestAttributeEvent)
     */
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletRequestAttributeListener#attributeRemoved(javax.servlet.ServletRequestAttributeEvent)
     */
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletRequestAttributeListener#attributeReplaced(javax.servlet.ServletRequestAttributeEvent)
     */
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletRequestListener#requestDestroyed(javax.servlet.ServletRequestEvent)
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletRequestListener#requestInitialized(javax.servlet.ServletRequestEvent)
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpSessionAttributeListener#attributeAdded(javax.servlet.http.HttpSessionBindingEvent)
     */
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpSessionAttributeListener#attributeRemoved(javax.servlet.http.HttpSessionBindingEvent)
     */
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpSessionAttributeListener#attributeReplaced(javax.servlet.http.HttpSessionBindingEvent)
     */
    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletContextAttributeListener#attributeAdded(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletContextAttributeListener#attributeRemoved(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletContextAttributeListener#attributeReplaced(javax.servlet.ServletContextAttributeEvent)
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }

}
