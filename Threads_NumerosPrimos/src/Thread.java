
public class Thread implements Runnable {
	private int inicio;
	private int	fim;
	
	public Thread(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public boolean primo (int x) {
		for(int i = 2; i<x/2+1; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void run() {
		for (int i = inicio; i<fim; i++) {
			if(primo(i)) {
				//System.out.println(i);
			}
		}
		//System.out.println("");
		
	}
}
