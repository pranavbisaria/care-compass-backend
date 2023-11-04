package com.carecompass.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.carecompass.Payloads.*;
import com.carecompass.Security.JwtAuthRequest;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.ExecutionException;

public interface AuthService {
    ResponseEntity<?> LoginAPI(JwtAuthRequest request, Integer RoleID);
    ResponseEntity<?> registerEmail(EmailDto emailDto, String type) throws Exception;
    ResponseEntity<?> verifyToRegister(OtpDto otpDto) throws ExecutionException;
    ResponseEntity<?> signupUser(UserDto userDto, String type) throws ExecutionException;
    ResponseEntity<?> signGoogle(String Token, Integer roleID) throws JsonProcessingException, NullPointerException;
    ResponseEntity<?> verifyOTPPasswordChange(OtpDto otpDto) throws ExecutionException;
    ResponseEntity<?> resetPassword(ForgetPassword forgetPassword) throws ExecutionException;
    ResponseEntity<?> sendOTPForget(EmailDto emailDto) throws Exception;
}
