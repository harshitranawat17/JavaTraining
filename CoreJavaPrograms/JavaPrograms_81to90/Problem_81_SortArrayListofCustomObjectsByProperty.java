package JavaPrograms_81to90;

import java.util.ArrayList;

public class Problem_81_SortArrayListofCustomObjectsByProperty {
	
	private String customProperty;

    public Problem_81_SortArrayListofCustomObjectsByProperty(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<Problem_81_SortArrayListofCustomObjectsByProperty> list = new ArrayList<>();
        
        list.add(new Problem_81_SortArrayListofCustomObjectsByProperty("H"));
        list.add(new Problem_81_SortArrayListofCustomObjectsByProperty("A"));
        list.add(new Problem_81_SortArrayListofCustomObjectsByProperty("R"));
        list.add(new Problem_81_SortArrayListofCustomObjectsByProperty("S"));
        list.add(new Problem_81_SortArrayListofCustomObjectsByProperty("i"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (Problem_81_SortArrayListofCustomObjectsByProperty obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
}
