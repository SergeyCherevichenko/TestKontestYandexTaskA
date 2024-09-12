public class Calculate {

   MathematicalExpression mathematicalExpression = new  MathematicalExpression();
   SaveIntegerSum saveIntegerSum = new SaveIntegerSum();

    public  String sum() {
        // Пример строки
        String[] numbers = mathematicalExpression.readMathExp().split(" ");
        if (numbers.length > 2) {
            throw new IllegalArgumentException("Не верный формат строки!");
        }
        String sum = null;

        try {

            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);
            int sumNumbers = firstNumber + secondNumber;
            System.out.println(sumNumbers);
            sum = String.valueOf(sumNumbers);
            saveIntegerSum.save(sum);

        } catch (NumberFormatException e) {
            System.out.println("Не верный формат числа");
        }
        return sum;
    }

}
