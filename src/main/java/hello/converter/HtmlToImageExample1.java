package hello.converter;

import java.io.IOException;

public class HtmlToImageExample1 {
    public static void main(String... args) throws IOException {
        String htmlFilePath = "/Users/yuseon/imageConverter/receipt.html";
        String imageFilePath = "/Users/yuseon/imageConverter/receipt.png";

        ImageConverter converter = new ImageConverter();
        converter.convertHtmlToImage(htmlFilePath, imageFilePath);
    }
}
