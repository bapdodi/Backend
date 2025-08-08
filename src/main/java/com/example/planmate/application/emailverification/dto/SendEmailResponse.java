package com.example.planmate.application.emailverification.dto;
import com.example.planmate.dto.CommonResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailResponse extends CommonResponse{
    boolean isVerificationSent;
}
