package org.java.features.demo.text_blocks;

public class Java8 {
    private static final String SQL = "SELECT INVOICE_AMT \n"
            + "FROM \n"
            + "    TABLE A, TABLE B \n"
            + "WHERE \n"
            + "    Customer_Id IS NOT NULL \n";

    public static void main(String[] args) {
        System.out.println(SQL);
    }
}
