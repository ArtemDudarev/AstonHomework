package Fourth;

import java.util.Arrays;

public class MyList<T> {
//    private final int INIT_SIZE = 16;
//    private final int CUT_RATE = 4;
    private final int size = 16;
    private Object[] array = new Object[size];
    private int counter;


    public void add(T item) {
        if(counter == array.length-1){
            Object[] newArray = new Object[size * 2];
            System.arraycopy(array, 0 , newArray, 0, counter);
            array = newArray;
        }
        array[counter++] = item;
    }

    public void addAll(T[] item){
        if(counter == array.length-1){
            Object[] newArray = new Object[size * 2];
            System.arraycopy(array, 0 , newArray, 0, counter);
            array = newArray;
        }
        for (int i = counter; i < array.length + counter; i++){
            for (int j = 0; j < item.length-1; j++){
                array[i] = item[j];
               // array[counter++] = item;
            }
        }

    }

    /*
    Возвращает элемент списка по индексу.
    */
    public T get(int index) {
        return (T) array[index];
    }

    /*
    Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    перемещаются на шаг налево. Если после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.
    */
    public void remove(int index) {
        for (int i = index; i< counter; i++)
            array[i] = array[i+1];
        array[counter] = null;
        counter--;
//        if (array.length > INIT_SIZE && counter < array.length / CUT_RATE)
//            resize(array.length/2); // если элементов в CUT_RATE раз меньше чем
//        // длина массива, то уменьшу в два раза
    }
    /*Возвращает количество элементов в списке*/
    public int size() {
        return counter;
    }

    /*Вспомогательный метод для масштабирования.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, counter);
        array = newArray;
    }

    @Override
    public String
    toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        Integer[] integers = {1,2,3,4};
        myList.addAll(integers);
        System.out.println(myList);
    }
}
