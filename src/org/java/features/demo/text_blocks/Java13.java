package org.java.features.demo.text_blocks;

public class Java13 {
    private static final String SQL = """
            SELECT INVOICE_AMT 
            FROM 
                TABLE A, TABLE B
            WHERE
                Customer_Id IS NOT NULL
            """;
    public static void main(String[] args) {
        System.out.println(SQL);
    }
}
