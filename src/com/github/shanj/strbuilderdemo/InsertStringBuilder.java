package com.github.shanj.strbuilderdemo;

/**
 * 请使用StringBuilder构造一个INSERT语句：
 */
public class InsertStringBuilder {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");

    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder(1024);

        for (String field : fields) {
            sb.append(',').append(field);
        }

        String s = sb.toString();
        System.out.println(s);
        return "";
    }
}



