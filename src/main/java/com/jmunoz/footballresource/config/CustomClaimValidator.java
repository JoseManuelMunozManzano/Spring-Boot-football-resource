package com.jmunoz.footballresource.config;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

public class CustomClaimValidator implements OAuth2TokenValidator<Jwt> {

    OAuth2Error error = new OAuth2Error("custom_code",
            "This feature is only for special football fans", null);

    @Override
    public OAuth2TokenValidatorResult validate(Jwt token) {
        if (token.getClaims().containsKey("specialFan")) {
            return OAuth2TokenValidatorResult.success();
        }

        return OAuth2TokenValidatorResult.failure(error);
    }
}
