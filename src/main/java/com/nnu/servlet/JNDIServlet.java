/**
 * 
 */
package com.nnu.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xingjl
 *
 * http://localhost:8080/ZoroWeb/JNDI
 */
public class JNDIServlet extends HttpServlet{

    /** 
     * (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(req, resp);
    }

    /** 
     * (non-Javadoc)
     * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        super.init(config);
        
        String param = config.getInitParameter("jndi-des");
        System.out.println("jndi-des:"+param);
        
        // 获取JNDI数据
        try {
            Context c = new InitialContext();
            String home = (String)c.lookup("java:comp/env/"+"solr/home");
            System.out.println("solr.home:"+home);
        }
        catch (NamingException e) {
            e.printStackTrace();
        }
      
        String globalParam = config.getServletContext().getInitParameter("Global");
        System.out.println("Global Parameter:"+globalParam);
    }

    
}
