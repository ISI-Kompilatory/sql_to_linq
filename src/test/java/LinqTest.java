import org.example.kompilatory.SQLToLinq;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinqTest {
    @Test
    void test1() {
        getLinqAndCompare("SELECT t.water, t.soda FROM table AS t",
                "from t in table\n" +
                "             select new\n" +
                "             {\n" +
                "                 t.water,\n" +
                "                 t.soda\n" +
                "             };");
    }

    @Test
    void test2() {
        getLinqAndCompare("SELECT tab.water, tab.soda FROM table AS tab",
                "from tab in table\n" +
                        "             select new\n" +
                        "             {\n" +
                        "                 tab.water,\n" +
                        "                 tab.soda\n" +
                        "             };");
    }

    @Test
    void test3() {
        getLinqAndCompare("SELECT a.column1, a.column2 FROM table1 AS a WHERE a.column1 > 10 AND a.column1 < 20",
                "from a in table1\n" +
                        "             where a.column1>10 && a.column1<20\n" +
                        "             select new\n" +
                        "             {\n" +
                        "                 a.column1,\n" +
                        "                 a.column2\n" +
                        "             };"
        );
    }

    /*@Test
    void test3() {
        getLinqAndCompare("SELECT t.column1, t.column2 FROM table1 AS t WHERE t.column1 > 10 AND t.column1 < 20 GROUP BY t.column1, t.column2",
                "from t in table1\n" +
                        "             where t.column1 > 10 && t.column1 < 20\n" +
                        "             group t by new { t.column1, t.column2 } into g\n" +
                        "             select new\n" +
                        "             {\n" +
                        "                 column1 = g.Key.column1,\n" +
                        "                 column2 = g.Key.column2\n" +
                        "             };\n"
        );
    }*/

    private void compareLinqQueries(String expected, String actual) {
        assertEquals(
                expected.trim().toLowerCase().replaceAll("[\\r\\n]", "").replaceAll("\\s+", " "),
                actual.trim().toLowerCase().replaceAll("[\\r\\n]", "").replaceAll("\\s+", " ")
        );
    }

    private String getLinq(String sql) {
        return SQLToLinq.sqlToLinq(sql);
    }

    private void getLinqAndCompare(String sql, String expectedLinq) {
        String linq = getLinq(sql);
        compareLinqQueries(expectedLinq, linq);
    }
}
