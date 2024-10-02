package collections;

public class Array<E> {

	private E[] array;
	private int position = 0;

	@SuppressWarnings("unchecked")
	public Array(int size) {
		array = (E[]) new Object[size];
	}

	public void add(E e) {

		if (position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		array[position++] = e;
	}

	public E get(int index) {
		return array[index];
	}

	public int size() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i != array.length - 1) {
				sb.append(", ");
			}
		}

		return sb.toString();
	}
}
