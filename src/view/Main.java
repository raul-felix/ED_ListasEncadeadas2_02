package view;

import br.edu.fateczl.listaEncadeada.ListaEncadeada;
import br.edu.fateczl.quicksort.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		ListaEncadeada<Integer> l = new ListaEncadeada<>();
		
		int[] vet = { 10, 5, 8, 1, 9, 2, 4, 7, 3, 6 };
		for (int i : vet) {
			try {
				l.addLast(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		int tamanho = l.size();
		int[] lArr = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			try {
				lArr[i] = l.get(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		try {
			l.clean();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		QuickSort quickSort = new QuickSort();
		lArr = quickSort.sort(lArr, 0, tamanho - 1);
		for (int i : lArr) {
			try {
				l.addLast(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(l.get(i) + " ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
