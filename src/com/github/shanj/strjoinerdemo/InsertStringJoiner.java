package com.github.shanj.strjoinerdemo;

/**
 * 请使用StringJoiner构造一个INSERT语句：
 */
public class InsertStringJoiner {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }
    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        return "";
    }
}
