package pl.gregrad.medicalvisitassistant.filters;


import pl.gregrad.medicalvisitassistant.dtos.Login.TherapistDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/patients/*", "/visit/*", "/stats"})
public class AccessFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        TherapistDTO therapist = (TherapistDTO) session.getAttribute("loggedUser");

        if (therapist == null) {
            res.sendRedirect("/login");
            return;
        }
        chain.doFilter(request, response);

    }
    @Override
    public void destroy() {

    }
}


