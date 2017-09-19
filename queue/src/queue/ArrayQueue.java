package queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {

	private E[] array;

	private int head = 0;

	private int tail = 0;

	private int size = 0;

	public ArrayQueue() {
		array = (E[]) new Object[20];
	}

	public ArrayQueue(int i) {
		array = (E[]) new Object[i];
	}

	@Override
	public void enqueue(E e) {
		if (isFull()) {
			E[] temp = (E[]) new Object[array.length * 2];

			for (int i = 0; i < array.length; i++) {
				temp[i] = array[head];
				head = (head + 1) % array.length;
			}
			head = 0;
			tail = array.length;
			array = temp;
		}
		array[tail] = e;
		tail = (tail + 1) % array.length;
		size++;
		System.out.println(Arrays.toString(array));
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[head];
			array[head] = null;
			head = (head + 1) % array.length;
			size--;
			System.out.println(Arrays.toString(array));
			return aux;
		}
	}

	@Override
	public E front() {
		return array[head];
	}

	@Override
	public boolean isEmpty() {
		return getSize() == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	private boolean isFull() {
		return getSize() == array.length;
	}

}
