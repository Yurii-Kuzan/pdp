package collections;

import java.util.Iterator;

public class IteratorEx {

    public static void main(String args[]) {

        String[] data = new String[]{"apple", "orange", "apricot", "peach"};
        CustomList<String> list = new CustomList<>(data);
        Iterator<String> customIterator = list.iterator();
        while (customIterator.hasNext()) {
            String value = customIterator.next();
            System.out.print(value + ", ");
        }
    }
}


class CustomList<Type> implements Iterable<Type> {

    private final Type[] arrayList;
    private final int Size;

    public CustomList(Type[] newArray) {
        this.arrayList = newArray;
        this.Size = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < Size && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
