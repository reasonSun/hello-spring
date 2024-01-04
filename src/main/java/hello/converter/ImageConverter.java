package hello.converter;

import org.xhtmlrenderer.simple.Graphics2DRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ImageConverter {
    private static final int WIDTH = 1024;
    private static final String IMAGE_FORMAT = "png";

    public void convertHtmlToImage(String htmlFilePath, String imageFilePath) {
        try {
            File htmlFile = new File(htmlFilePath);
            String url = htmlFile.toURI().toURL().toExternalForm();
            BufferedImage image = Graphics2DRenderer.renderToImageAutoSize(url, WIDTH, BufferedImage.TYPE_INT_ARGB_PRE);
            ImageIO.write(image, IMAGE_FORMAT, new File(imageFilePath));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
