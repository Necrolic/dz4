package dz4;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private DataBase() {
    }
    private static final List<Data> database = new ArrayList<>();
    public static void putData(Data data){
        database.add(data);
    }

}
