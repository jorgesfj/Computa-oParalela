package com.ufal.thread;

public class NewThread extends Thread{
	
	private String nomeJogador;
	private static Boolean rodada;
	private static int tempo;
	private static Object bola;
	
	public NewThread(String nomeJogador){
		this.nomeJogador = nomeJogador;
		this.rodada = false;
		this.tempo = 1000;
		this.bola = new Object();
	}
	
	public void run() {
		synchronized (NewThread.bola) {
			
		}
		try {
			while(NewThread.rodada)
				NewThread.bola.wait();
			NewThread.rodada = true;
			System.out.println("O Jogador_"+ this.nomeJogador + " pegou a bola");
			Thread.sleep(tempo);
			System.out.println("O Jogador_" + this.nomeJogador + " perdeu a bola");
			NewThread.rodada = false;
			NewThread.bola.notifyAll();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}


