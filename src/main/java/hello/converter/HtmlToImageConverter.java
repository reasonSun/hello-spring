package hello.converter;

import gui.ava.html.image.generator.HtmlImageGenerator;

public class HtmlToImageConverter {
    public static void main(String[] args) {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        imageGenerator.loadHtml("<div style='font-size:25px''>Hello World! Please goto</div> <img src='https://image.istyle24.com/Upload/ProductImage/0000024302/20231204/A234ST847P_NA_02.jpg'>.");
        imageGenerator.saveAsImage("/Users/yuseon/imageConverter/test.png");
//        imageGenerator.saveAsImage("hello-world.jpeg");
    }
}
