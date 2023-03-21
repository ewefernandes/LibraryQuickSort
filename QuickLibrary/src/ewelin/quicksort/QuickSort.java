package ewelin.quicksort;

public class QuickSort {
	
	public int[] quickSort (int[] vetor, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo-1);
			quickSort(vetor, posicaoPivo + 1, fim);
			}
		return vetor;
	}
	
	private int dividir (int[] vetor, int inicio, int fim) {
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = vetor[inicio];
		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && vetor[ponteiroDir] >= pivo) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		trocar(vetor, inicio, ponteiroDir);
		return ponteiroDir;
	}
	
	private void trocar (int[] v, int esq, int dir) {
		int aux = v[dir];
		v[dir] = v[esq];
		v[esq] = aux;
	}
}
