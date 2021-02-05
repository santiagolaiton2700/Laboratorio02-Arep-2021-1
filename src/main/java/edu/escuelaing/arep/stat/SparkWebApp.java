package edu.escuelaing.arep.stat;
import edu.escuelaing.arep.stat.Stat;

import static spark.Spark.*;
import static spark.route.HttpMethod.post;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        post("/stat",(request,response)->{
            Stat calculadora=new Stat();
            calculadora.leerCadena(request.body());
            return "{\"media\":"+calculadora.mean()+",\"desviacion\":"+calculadora.stddev()+"}";
        });
        //get("/hello", (req, res) -> "Hello Heroku");

    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't se (i.e. on localhost)
    }
}
