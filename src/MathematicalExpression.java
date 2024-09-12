import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MathematicalExpression {


    public String readMathExp() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);
                return line;
            }


        } catch (IOException e) {
            System.out.println("Не верно указан путь к файлу или такого пути не сущесвует, при чтении файлы возникла ошибка ");
            e.printStackTrace();
        }
        return null;

    }
}





