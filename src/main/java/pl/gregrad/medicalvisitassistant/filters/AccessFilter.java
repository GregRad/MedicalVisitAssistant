package pl.gregrad.medicalvisitassistant.filters;

import org.springframework.web.filter.OncePerRequestFilter;
import pl.gregrad.medicalvisitassistant.dtos.Login.TherapistDTO;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AccessFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws ServletException, IOException {

        String url = req.getRequestURI();
        if (!url.equals("/login")) {
            HttpSession session = req.getSession();
            TherapistDTO therapist = (TherapistDTO) session.getAttribute("loggedUser");
            if (therapist == null) {
                res.sendRedirect("/login");
                return;
            }
        }
        chain.doFilter(req, res);
    }
}


