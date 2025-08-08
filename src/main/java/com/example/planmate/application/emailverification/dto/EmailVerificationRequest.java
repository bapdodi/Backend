package com.example.planmate.application.emailverification.dto;

import com.example.planmate.domain.emailverification.EmailVerificationPurpose;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailVerificationRequest {
    private String email;
    private EmailVerificationPurpose purpose;
    private int verificationCode;
}
