package com.carecompass.config;

public class AppConstants {
    public static final Integer ROLE_ADMIN = 1001;
    public static final Integer ROLE_PATIENT = 1002;
    public static final int ROLE_DOCTOR = 1003;
    public static final long JWT_ACCESS_TOKEN_VALIDITY = 24 * 60 *60; //30 sec
    public static final long JWT_REFRESH_TOKEN_VALIDITY = 100 * 24 * 60 *60; //2 min
    public static final Integer EXPIRE_MINs = 10;
    public static final String secret = "jwtTokenKeyJwtTokenKeyJwtTokenKeyJwtTokenKeyJwtTokenKeyJwtTokenKeyjwtTokenKeyJwtTokenKey";
    public static final String path = "https://elasticbeanstalk-ap-south-1-665793442236.s3.ap-south-1.amazonaws.com/resources/images/";
    public static final String GOOGLE_CLIENT_ID = "728124675759-b4unf0ep4k3477nucn8udef3fttc4das.apps.googleusercontent.com";
    public static final String GOOGLE_ISSUER = "https://accounts.google.com";
    public static  final String malePhoto = "https://elasticbeanstalk-ap-south-1-665793442236.s3.ap-south-1.amazonaws.com/resources/images/default.png";
    public static  final String femalePhoto = "https://elasticbeanstalk-ap-south-1-665793442236.s3.ap-south-1.amazonaws.com/resources/images/default.png";
    public static final String otherPhoto = "https://elasticbeanstalk-ap-south-1-665793442236.s3.ap-south-1.amazonaws.com/resources/images/default.png";
}
