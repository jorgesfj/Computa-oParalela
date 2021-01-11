package com.ufal.br;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class BuscaBinaria extends RecursiveTask<Integer>{

	int[] lista;
	int L;
	int R;
	int target;
	public BuscaBinaria(int [] lista,int L,int R,int target) {
		this.lista = lista;
		this.L = L;
		this.R = R;
		this.target = target;
	}
	@Override
	protected Integer compute() {
		if(R>=L) {
			int mid = (R+L)/2;
			if(target>lista[mid]) {
				BuscaBinaria subTask = new BuscaBinaria(lista,mid+1,R,target);
				subTask.fork();
				return subTask.join();
			}else if(target<lista[mid]) {
				BuscaBinaria subTask = new BuscaBinaria(lista,L,mid-1,target);
				subTask.fork();
				return subTask.join();
			}else {
				System.out.println("Encontrado");
				return mid;
			}
		}else {
			System.out.println("Não encontrado");
			return Integer.valueOf(-1);
		}
	}

public static void main(String[] args) {
	int [] lista = {1,3,4,5,7,11,20,33,50};
	int key = 5846;//Numero INTEIRO a ser buscado
	RecursiveTask<Integer> tarefa = new BuscaBinaria(lista,0,lista.length-1,key);
	ForkJoinPool pool = new ForkJoinPool();
	int r =pool.invoke(tarefa);
}

}