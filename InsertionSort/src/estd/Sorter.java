package estd;

public class Sorter {

	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int aux = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > aux)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = aux;
		}
	}

	public void sort(char[] a) {
		for (int i = 1; i < a.length; i++) {
			char aux = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > aux)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = aux;
		}
	}

	public void sort(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			Comparable aux = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j].compareTo(aux) > 0)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = aux;
		}
	}
}
