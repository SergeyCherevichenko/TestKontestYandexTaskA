import java.io.FileWriter;
import java.io.IOException;

public class SaveIntegerSum {

    public void save(String result){
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
            // запись всей строки

            writer.write(result);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch( IOException ex){
            System.out.println("При записи файла возникла ошибка!");
            System.out.println(ex.getMessage());
        }
    }
}

