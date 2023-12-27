package com.authen.rbacspring.services;

import com.authen.rbacspring.dto.JWTAuthenticationResponse;
import com.authen.rbacspring.dto.RefreshTokenRequest;
import com.authen.rbacspring.dto.SignInRequest;
import com.authen.rbacspring.dto.SignUpRequest;
import com.authen.rbacspring.entity.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JWTAuthenticationResponse signin(SignInRequest signInRequest);

    JWTAuthenticationResponse refresh(RefreshTokenRequest refreshTokenRequest);

}
