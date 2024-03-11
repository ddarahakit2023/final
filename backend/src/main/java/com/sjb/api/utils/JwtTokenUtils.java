package com.sjb.api.utils;

import com.sjb.api.member.model.Member;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtTokenUtils {
    @Value("${jwt.secret-key}")
    private static String secretKey;
    @Value("${jwt.token.expired-time-ms}")
    private static Integer expiredTimeMs;

    public JwtTokenUtils(@Value("${jwt.secret-key}") String secretKey, @Value("${jwt.token.expired-time-ms}") Integer expiredTimeMs) {
        this.secretKey = secretKey;
        this.expiredTimeMs = expiredTimeMs;
    }

    // 토큰 생성
    public String generateAccessToken(Member member) {
        Claims claims = Jwts.claims();
        claims.put("id", member.getId());
        claims.put("name", member.getName());
        claims.put("roles", member.getAuthority());

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiredTimeMs))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();

        return token;
    }

    public Key getSignKey() {

        return Keys.hmacShaKeyFor(secretKey.getBytes());

    }
    public Claims getClaims(String token) {

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims;
    }

    public Long getId(String token) {
        Long id = getClaims(token).get("id", Long.class);

        return id;
    }
    public String getName(String token) {
        String name = getClaims(token).get("name", String.class);

        return name;
    }
    public String getRoles(String token) {
        String roles = getClaims(token).get("roles", String.class);

        return roles;
    }
}

