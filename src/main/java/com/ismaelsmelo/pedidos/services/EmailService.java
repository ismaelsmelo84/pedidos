package com.ismaelsmelo.pedidos.services;

import org.springframework.mail.SimpleMailMessage;

import com.ismaelsmelo.pedidos.domain.Cliente;
import com.ismaelsmelo.pedidos.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
