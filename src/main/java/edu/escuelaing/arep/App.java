package edu.escuelaing.arep;

import static spark.Spark.port;
import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    public static void main(String... args) {
        port(getPort());
        get("hello", (req, res) -> "Hello Docker!");
    }

}
