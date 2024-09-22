package org.chu.ecommercemvc.security;

import org.chu.ecommercemvc.model.bo.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {
    private JwtUtil jwtUtil;
    private UserService userService;

    @Autowired
    public void setJwtUtil(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtFilter.class);
    private final RequestMatcher loginRequestsPattern = new AntPathRequestMatcher("/api/login");

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!this.loginRequestsPattern.matches(request)) {
            String token = getAccessToken(request);
            if (token != null && jwtUtil.validateAccessToken(token)) {
                String id = jwtUtil.getUserIdFromAccessToken(token);
                UserDetails userDetails = userService.findById(Long.parseLong(id));
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authentication.setDetails((new WebAuthenticationDetailsSource()).buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        filterChain.doFilter(request, response);
    }

    private String getAccessToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        return !ObjectUtils.isEmpty(header) && header.startsWith("Bearer ") ? header.split(" ")[1].trim() : null;
    }
}