import controller.Controller;
import model.NoteBook;
import view.View;

public class Main {
    public static void main(String[] args) throws Exception {

        Controller controller =
                new Controller(new NoteBook(), new View());
        // Run
        controller.processUser();
    }
}

