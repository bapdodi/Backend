package com.example.planmate.application.emailverification.dto;

import com.example.planmate.domain.emailverification.EmailVerificationPurpose;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailRequest {
    private String email;
    private EmailVerificationPurpose purpose;
}
