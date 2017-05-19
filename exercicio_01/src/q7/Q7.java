package q7;

public class Q7 {

	public static SLinkedList<String> copyArrayToList(String[] array) {
		SLinkedList<String> result = new SLinkedList<>();
		for (String s : array) {
			Node<String> node = new Node<String>(s);
			result.add(node);
		}
		return result;
	}

	public static String[] copyListToArray(SLinkedList<String> list) {
		int counter = 0;
		String[] result = new String[(int) list.getSize()];
		Node<String> aux = list.getFirst();
		while (aux != null) {
			result[counter] = aux.getValue();
			aux = aux.getNext();
			counter++;
		}

		return result;

	}

}
