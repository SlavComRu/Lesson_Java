package main;

public class MyArrayListTwo {
    private String[] arrayList = new String[10];
    private int size;


    public void add(String s) {
        arrayList[size] = s;
        size++;

        if (size == arrayList.length) {
            String[] newArrayList = new String[arrayList.length * 2];
            for (int i = 0; i < arrayList.length; i++) {
                newArrayList[i] = arrayList[i];
            }
            arrayList = newArrayList;
        }

    }

    public void remove (int index){
        if (index >= 0 && index < size){
        for (int i = index; i < arrayList.length -1; i++) {
            arrayList[i] = arrayList[i+1];
        } size--;}
    }

    public void remove (String s){
        int index = -1;
        for (int i = 0; i < size; i++) {
           if (s.equals(arrayList[i])){
               index =i;
               break;
           }
        }
        if (index !=-1){
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String[] getArrayList() {
        return arrayList;
    }

    public String get(int index){
        if (size >=0 && index <=  size){
      return arrayList[index];}
        else return "Элемент не найден";

    }
}