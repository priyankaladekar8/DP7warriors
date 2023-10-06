package com.coupling;

interface MessageS {
	void sendMessage(String args[]);

	void sendMessage(String msg);
}

class Whatsapp implements MessageS {
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

class Telegram implements MessageS {
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

public class TightlyCoupleDemo {
	public void messagetype(Whatsapp w) {
		w.sendMessage("welcome");
	}

	public static void main(String args[]) {
		TightlyCoupleDemo obj = new TightlyCoupleDemo();

		Whatsapp w1 = new Whatsapp();
		obj.messagetype(w1);
		Telegram t1 = new Telegram();
		// obj.messagetype(t1);
	}
}
