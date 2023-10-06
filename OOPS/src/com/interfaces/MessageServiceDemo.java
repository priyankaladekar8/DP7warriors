package com.interfaces;

interface MessageService {

	void sendmessage();
}

class Whatsapp implements MessageService {

	public void sendmessage() {
		System.out.println("massage send through whatsapp:");

	}
	class Facebook implements MessageService{
		public void sendmessage() {
			System.out.println("massage send throught facebook");
		}

	

	}

	public class MessageServiceDemo {
		public static void main(String args[]) {
		}

	}

	@Override
	public void sendmessage() {
		// TODO Auto-generated method stub
		
	}
}