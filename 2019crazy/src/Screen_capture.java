import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screen_capture {
    public static void main(String[] args) throws AWTException, IOException {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        File save_path=new File("screen.jpg");
        ImageIO.write(img, "JPG", save_path);
    }
}
