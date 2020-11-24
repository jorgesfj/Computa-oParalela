package com.ufal.thread;

public class Campo {
	public static void main(String[] args) {
		for(int i = 0; i<=10;i++) {
			new NewThread("Jogador_"+ (i+1)).start();
		}
	}
}
