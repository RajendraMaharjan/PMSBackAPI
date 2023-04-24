package com.miu.rsmanagementbackendapi.service.auth;

import com.miu.rsmanagementbackendapi.domain.auth.dto.request.LoginRequest;
import com.miu.rsmanagementbackendapi.domain.auth.dto.request.RefreshTokenRequest;
import com.miu.rsmanagementbackendapi.domain.auth.dto.response.LoginResponse;
import com.miu.rsmanagementbackendapi.domain.auth.dto.response.RefreshResponse;
import jakarta.servlet.ServletException;

public interface AuthService {

    LoginResponse login(LoginRequest loginRequest);

    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    RefreshResponse refreshTokenAPI() throws ServletException;
}
