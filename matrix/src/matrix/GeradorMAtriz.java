package matrix;

import java.util.Random;

public class GeradorMAtriz {
	private int[][]matriz;
	private int linhas;
	private int coluna;
	Random random = new Random();
	
	
	public void getLinhasEcolunas(int linhas, int colunas) {
		this.coluna = colunas;
		this.linhas= linhas;
	}
	
	public void getMatriz() {
		this.matriz = new int[this.linhas][this.coluna];
	}
	
	
	public void setMatriz() {
		getMatriz();
		for(int i = 0;i<this.linhas;i++) {
			for(int j=0;j<this.coluna;j++) {
				this.matriz[i][j] = random.nextInt(100);
			}
			
		}
	}
	
	public void printMatiz() {
		setMatriz();
		for(int i = 0;i< this.linhas;i++) {
			for(int j =0;j<this.coluna;j++) {
				System.out.print(this.matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	

}
