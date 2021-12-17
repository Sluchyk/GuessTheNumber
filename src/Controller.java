import java.util.Scanner;

public class Controller {
private Model model;
private  View view ;
Controller(Model model, View view)
{
    this.model = model;
    this.view = view;

}
public void enterBrarier(){
Scanner  scanner =new Scanner(System.in);
model.setBarier(0,100);
   model.setNumber();
    System.out.println(model.getNumber());
     while(model.checkValue(inputIntValueWithScanner(scanner)));

    view.printMessage(View.CONGRATULATION + model.getNumber());
    view.printMessage(View.YOUR_WAY + String.valueOf(model.getYourWay()));




}
    private int inputIntValueWithScanner(Scanner scanner) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA + getInputIntMessage());
                scanner.next();
            }
            if ((res = scanner.nextInt()) <= model.getMin() ||
                    res >= model.getMax()) {
                view.printMessage(View.WRONG_INPUT_DATA + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                View.INPUT_INT_DATA, View.OPENS_BRACKET,
                String.valueOf(model.getMin()), View.SPACE_SING,
                String.valueOf(model.getMax()),
                View.CLOSING_BRACKET, View.SPACE_SING,
                View.EQUAL, View.SPACE_SING );
    }
}
