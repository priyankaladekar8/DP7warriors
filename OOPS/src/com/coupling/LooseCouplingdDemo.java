package com.coupling;

interface MessageS {
	void sendMessage(String args[]);

	void sendMessage(String msg);
}

class Whatsapp1 implements MessageS {
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type = "Whatsapp";
		System.out.println(type + ": " + msg);

	}

	@Override
	public void sendMessage(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Telegram1 implements MessageS {
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type = "Telegram";
		System.out.println(type + ": " + msg);

	}

	@Override
	public void sendMessage(String[] args) {
		// TODO Auto-generated method stub

	}
}

public class LooseCouplingdDemo {
	public void messagetype(MessageS) {
		w.sendMessage("welcome");
	}

	public static void main(String args[]) {
		TightlyCoupleDemo obj = new TightlyCoupleDemo();

		Whatsapp1 w1 = new Whatsapp1();
		obj.messagetype(w1);
		Telegram1 t1 = new Telegram1();
		obj.messagetype(t1);
	}
}

p
