package com.tundeadetunji.blogsapi.business.internal;

import com.auth0.jwt.algorithms.Algorithm;
import com.tundeadetunji.blogsapi.business.security.vault.Secrets;

public class General extends Secrets {
    public static final Algorithm algorithm = Algorithm.HMAC256(secretKey.getBytes());

    public static enum userRoles{
        ROLE_USER,
        ROLE_ADMIN
    }

}
