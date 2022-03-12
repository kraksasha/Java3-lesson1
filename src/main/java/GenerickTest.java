import java.util.ArrayList;

public class GenerickTest<T> {
    private T obj[];

    public GenerickTest(T obj[]) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void swapPlaces(int index1, int index2){
        Object obj1 = obj[index1];
        obj[index1] = obj[index2];
        obj[index2] = (T) obj1;
    }

    public void printGenerick(){
        for (T elementG: obj){
            System.out.println(elementG);
        }
    }

    public ArrayList arrayToList(){
        ArrayList<T> list = new ArrayList<>();
        for (T o: obj){
            list.add(o);
        }
        return list;
    }

}
