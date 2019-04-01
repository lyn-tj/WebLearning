package com.lyn0801.filter;

import com.lyn0801.controller.TokenController;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*",filterName = "tokenfilter")
//@Order(1)
public class TokenFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String token = request.getHeader("X-Marstor-Token");
        System.out.println("===TokenFilter==="+token);
        if(null == token || token.equals("")){
            token = TokenController.getToken("admin","admin");
            TokenRequestWrapper tokenRequestWrapper = new TokenRequestWrapper(request);
            tokenRequestWrapper.addHeader("X-Marstor-Token", token);
            filterChain.doFilter(tokenRequestWrapper, response);
        }else {
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
