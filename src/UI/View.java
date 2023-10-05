package UI;

import Model.Pet;
import java.util.List;
import java.awt.*;

public interface View <T>{

    String getName();
    String getBirthday();
    <U> void printAll (List <U> list, Class <U> clazz);
    void showMessage (String s);

}
