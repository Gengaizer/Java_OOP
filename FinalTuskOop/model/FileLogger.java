package FinalTuskOop.model;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger<T> implements FinalTuskOop.model.Logger<T> {
    static Logger logger = Logger.getLogger("string");
    private String file = "FinalTuskOop\\log\\log.txt";

    @Override
    public void log(T data) {
        try {
            FileHandler fh = new FileHandler(file, true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(true);
            logger.info(data.toString());
            fh.close();
        } catch (Exception e) {
            System.out.println("Fatal");
        }
    }

}
