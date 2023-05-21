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
                "                 water = t.water,\n" +
                "                 soda = t.soda\n" +
                "             };");
    }

    @Test
    void test2() {
        getLinqAndCompare("SELECT column1, column2, table1.col3 FROM table1 WHERE column1 > 10 AND column1 < 20 GROUP BY column1, table1.column2;",
                "from t in table1\n" +
                        "             where t.column1 > 10 && t.column1 < 20\n" +
                        "             group new { t.column1, t.table1.column2, t.table1.col3 } by new { t.column1, t.table1.column2 } into g\n" +
                        "             select new\n" +
                        "             {\n" +
                        "                 column1 = g.Key.column1,\n" +
                        "                 column2 = g.Key.column2,\n" +
                        "                 col3 = g.Select(x => x.col3)\n" +
                        "             };");
    }

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
