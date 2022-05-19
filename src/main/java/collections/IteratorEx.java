package collections;

import java.util.Iterator;

public class IteratorEx {

    public static void main(String args[]) {

        String[] data = new String[]{"apple", "orange", "apricot", "peach"};
        CustomList<String> list = new CustomList<>(data);
        Iterator<String> customIterator = list.iterator();
        while (customIterator.hasNext()) {
            String value = customIterator.next();
            customIterator.remove();
            System.out.print(value + ", ");
        }

        System.out.println("\n" + list.currentSize());
    }
}


class CustomList<Type> implements Iterable<Type> {

    private Type[] arrayList;

    public CustomList(Type[] newArray) {
        this.arrayList = newArray;
    }

    public int currentSize(){
        return arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<>() {
            private int currentIndex = 0;
            boolean elementRemoved = false;

            @Override
            public boolean hasNext() {
                return currentIndex < arrayList.length && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                elementRemoved = false;
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                if(elementRemoved)
                    throw new IllegalStateException("must call next() before calling remove()");

                Type[] newData = (Type[]) new Object[arrayList.length-1];
                System.arraycopy(arrayList, 0, newData, 0, currentIndex-1); // bottom half.

                if(currentIndex-1 < newData.length)
                    System.arraycopy(arrayList, currentIndex, newData, currentIndex-1, arrayList.length-currentIndex--); // top half.


                arrayList = newData;
                elementRemoved = true;
            }
        };
        return it;
    }
}
