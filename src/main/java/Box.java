import java.util.ArrayList;

public class Box {
    private ArrayList<Object> list;

    public ArrayList<Object> getList() {
        return list;
    }

    public Box(){
        list = new ArrayList<>();
    }

    public void addFruit(Object o){
        if (list.size() < 1){
            list.add(o);
        } else if ((list.get(0) instanceof Apple) && (o instanceof Apple)){
            list.add(o);
        } else if ((list.get(0) instanceof Orange) && (o instanceof Orange)){
            list.add(o);
        } else {
            System.out.println("Данная коробка не подходит для этого фрукта");
        }
    }

    public double getWeight(){
        if (list.get(0) instanceof Apple){
            return ((Apple) list.get(0)).getWeightApple() * list.size();
        } else if (list.get(0) instanceof Orange){
            return ((Orange) list.get(0)).getWeightOrange() * list.size();
        }
        return 0;
    }

    public boolean compareTo(Box box){
        if (getWeight() == box.getWeight() ){
            return true;
        } else {
            return false;
        }
    }

    public void sprinkleFruit(Box box){
        if ((box.getList().size() != 0)){
            if (list.get(0).getClass().equals(box.getList().get(0).getClass())){
                for (int i = 0; i < list.size(); i++){
                    box.getList().add(list.get(i));
                    list.remove(i);
                    i--;
                    if (list.size() == 0){
                        break;
                    }
                }
            } else {
                System.out.println("Нельзя пересыпать данные фрукты в эту коробку");
            }
        } else {
            for (int i = 0; i < list.size(); i++){
                box.getList().add(list.get(i));
                list.remove(i);
                i--;
                if (list.size() == 0){
                    break;
                }
            }
        }

    }
}
