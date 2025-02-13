import java.util.Arrays;
public class Sorty {

    private String[] values;

    public Sorty(String[] values) {
        this.values = values;

    }

    public void bubbleSort() {
        int ops = 0;

        for (int i = 0, i <values.length; i++){
            for (int j = 0; <values.length;
            j++){
                if (values[j - 1].compareTo(values[j])) ;
                String temp = values[j - 1];
                values[j - 1] = values = [j];
                values[j] = temp;
                ops++;
            }
        }
    }
        System.out.println("Bubble sort operations: " + ops);

    public String[] getValues(); {
        return values;
    }
}
