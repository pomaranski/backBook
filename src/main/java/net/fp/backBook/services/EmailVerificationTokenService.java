package net.fp.backBook.services;

import net.fp.backBook.model.EmailVerificationToken;
import org.springframework.stereotype.Service;

@Service
public interface EmailVerificationTokenService extends BasicCrudService<EmailVerificationToken, String> {
    public EmailVerificationToken getVerificationTokenByRequested(String token);
}