package com.example.planmate.presentation.emailverification;

import com.example.planmate.application.emailverification.EmailVerificationService;
import lombok.RequiredArgsConstructor;
import com.example.planmate.application.emailverification.dto.SendEmailRequest;
import com.example.planmate.application.emailverification.dto.SendEmailResponse;
import com.example.planmate.application.emailverification.dto.EmailVerificationRequest;
import com.example.planmate.application.emailverification.dto.EmailVerificationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth/email/verification")
public class EmailVerificationController {
    private final EmailVerificationService emailVerificationService;

    @PostMapping("")
    public ResponseEntity<SendEmailResponse> sendEmail(@RequestBody SendEmailRequest request) {
        SendEmailResponse response = emailVerificationService.sendVerificationCode(request.getEmail(), request.getPurpose());
        return ResponseEntity.ok(response);
    }
    @PostMapping("/confirm")
    public ResponseEntity<EmailVerificationResponse> verifyEmail(@RequestBody EmailVerificationRequest request) {
        EmailVerificationResponse response = emailVerificationService.registerEmailVerify(request.getEmail(), request.getPurpose(), request.getVerificationCode());
        return ResponseEntity.ok(response);
    }
}
