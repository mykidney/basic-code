package com.coder.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    private static final Log log=LogFactory.getLog(EncodingFilter.class);
    private String charset=null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String charset=filterConfig.getInitParameter("charset");
        this.charset=charset;
        log.info(charset);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (charset!=null&&!"".equals(charset)){
            servletRequest.setCharacterEncoding(charset);
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
