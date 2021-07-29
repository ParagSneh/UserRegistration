package com.kd.userRegistrationService.email;

public interface EmailSender {
	void send(String to, String email);
}
