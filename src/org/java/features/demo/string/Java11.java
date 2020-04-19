package org.java.features.demo.string;

public class Java11 {
    public static void main(String[] args) {
        System.out.println("".isBlank());
        
        String.format("a%nb")
            .lines()
            .forEach(System.out::println);
        
        System.out.println("repeat10_".repeat(10));
        
        System.out.println();
        String html = 
                "    <html>\n" + 
                "        <head>\n" + 
                "            <title>sample</title>\n" + 
                "        </head>\n" + 
                "        <body>\n" + 
                "            <div>page content</div>\n" + 
                "        </body>\n" + 
                "    </html>";
        
        System.out.println("==========plain===========");
        System.out.println(html);
        System.out.println("==========================");
        
        System.out.println();
        
        System.out.println("===========strip indent=========");
        System.out.println(html.stripIndent());
        System.out.println("==========================");
    }
}
