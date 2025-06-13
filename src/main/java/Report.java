interface IPrinter {
    void print(String message);
}

class Printer implements IPrinter {
    @Override
    public void print(String message) {
        var logger = java.util.logging.Logger.getLogger("OvercatchingExceptionExample");
        logger.info(message);
    }
}

public class Report {
    private IPrinter printer = new Printer(); // tightly coupled

    void generate() {
        printer.print("Generating report...");
    }
}
