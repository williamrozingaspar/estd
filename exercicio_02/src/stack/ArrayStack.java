package stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {

	private E[] array;

	private int position = 0;

	public ArrayStack() {
		array = (E[]) new Object[20];
	}

	public ArrayStack(int i) {
		array = (E[]) new Object[i];
	}

	@Override
	public void push(E e) {

		if (position == array.length) {
			E[] temp = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}

		array[position] = e;
		position++;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[position - 1];
			array[position - 1] = null;
			position--;
			return aux;
		}
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return array[position - 1];
		}
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return (position == 0);
	}

	@Override
	public List<E> pop(int n) {
		List<E> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			E aux = this.pop();
			list.add(aux);
			if (isEmpty()) {
				break;
			}
		}

		return list;
	}

	@Override
	public List<E> clear() {
		return pop(getSize());
	}

	@Override
	public Stack<E> cloneStack() {
		Stack<E> clone = new ArrayStack<>();

		for (int i = 0; i < position; i++) {
			clone.push(array[i]);
		}

		return clone;
	}
}
