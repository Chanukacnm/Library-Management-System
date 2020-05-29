package controllers;

import Connection.Conn;
import Person.Pesrson;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class AppSummary {
    private String content;



    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {



    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Westminister Library Manager"));
        return ok(jsonNode).as("application/json");
    }

    public Result postTest() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Post Request Test => Data Sending Success"));
        return ok(jsonNode).as("application/json");
    }
    public Result Test() throws SQLException {
        JsonNode test = Json.parse(request().body().asText());
        System.out.println(test.get("bookCode").textValue());

        Conn conn=new Conn();
        Connection connection= conn.getConnection();

       String sql = "INSERT INTO addbooks VALUES('" + test.get("bookCode") + "','" + test.get("bookName") + "','" +
               test.get("ISBN") + "','" + test.get("bookAuthor") + "','" + test.get("bookPublisher") + "','" + test.get("numberOfPages") + "')";

        try{  Statement statement=connection.createStatement();

            int c =statement.executeUpdate(sql);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        JsonNode jsonNode = Json.toJson("Book Added");
        return ok(jsonNode).as("application/json");
    }

    public Result ADVD() throws SQLException{
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("dvdCode").textValue());
        Conn conn=new Conn();
        Connection connection= conn.getConnection();

        String sql2 = "INSERT INTO adddvds VALUES('" + test.get("dvdCode") + "','" + test.get("dvdName") + "','" +
                test.get("languages") + "','" + test.get("subtitles") + "','" + test.get("producer") + "','" + test.get("actor") + "')";

        try{  Statement statement=connection.createStatement();

            int d =statement.executeUpdate(sql2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        Pesrson r = new Pesrson("Dvd Added");
        JsonNode jsonNode = Json.toJson(r);
        return ok(jsonNode).as("application/json");

    }

    public Result DELBOOK() throws SQLException{
        JsonNode test = Json.parse(request().body().asText());
        System.out.println(test.get("bookCode").textValue());
        Conn conn=new Conn();
        Connection connection= conn.getConnection();


        String sql3="DELETE from addbooks where bookCode='"+test.get("bookCode")+"'";

          Statement statement=connection.createStatement();

            int d =statement.executeUpdate(sql3);


        JsonNode jsonNode = Json.toJson("Book deleted");
        return ok(jsonNode).as("application/json");

    }

    public Result DELDVD() throws SQLException{
        JsonNode test = Json.parse(request().body().asText());
        System.out.println(test.get("dvdCode").textValue());
        Conn conn=new Conn();
        Connection connection= conn.getConnection();


        String sql3="DELETE from adddvds where dvdCode='"+test.get("dvdCode")+"'";

        Statement statement=connection.createStatement();

        int d =statement.executeUpdate(sql3);


        JsonNode jsonNode = Json.toJson("Dvd deleted");
        return ok(jsonNode).as("application/json");

    }

    public Result BORROWBK() throws SQLException{
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("brrBkCode").textValue());
        Conn conn=new Conn();
        Connection connection= conn.getConnection();

        String sql5 = "INSERT INTO borrowbooks VALUES('" + test.get("brrBkCode") + "','" + test.get("bookName") + "','" +
                test.get("curReader") + "','" + test.get("brrDate") + "','" + test.get("bookCode") + "')";

        try{  Statement statement=connection.createStatement();

            int br =statement.executeUpdate(sql5);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        Pesrson r = new Pesrson("Book Borrowed");
        JsonNode jsonNode = Json.toJson(r);
        return ok(jsonNode).as("application/json");
    }
    public Result BORROWDVDS() throws SQLException{
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("brDvdCode").textValue());
        Conn conn=new Conn();
        Connection connection= conn.getConnection();

        String sql6 = "INSERT INTO borrowdvds VALUES('" + test.get("brDvdCode") + "','" + test.get("dvdName") + "','" +
                test.get("currOwner") + "','" + test.get("brrDate") + "','" + test.get("dvdCode") + "')";

        try{  Statement statement=connection.createStatement();

            int dv =statement.executeUpdate(sql6);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        Pesrson r = new Pesrson("Dvd Borrowed");
        JsonNode jsonNode = Json.toJson(r);
        return ok(jsonNode).as("application/json");
    }

    public Result Disbk() throws SQLException {
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("bookCode").textValue());

        Conn conn=new Conn();
        Connection connection= conn.getConnection();
        Statement statement=connection.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT * from addbooks where bookCode='"+test.get("bookCode")+"'");

        while (resultSet.next()){
            ArrayList<Object> book= new ArrayList<>();
            book.add(resultSet.getString(1));
            book.add(resultSet.getString(2));
            book.add(resultSet.getString(3));
            book.add(resultSet.getString(4));
            book.add(resultSet.getString(5));
            book.add(resultSet.getString(6));

            JsonNode jsonNode = Json.toJson(book);
            return ok(jsonNode).as("application/json");
        }

        JsonNode jsonNode = Json.toJson("");
        return ok(jsonNode).as("application/json");


    }

    public Result DISDVDS() throws SQLException {
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("dvdCode").textValue());

        Conn conn=new Conn();
        Connection connection= conn.getConnection();
        Statement statement=connection.createStatement();


        ResultSet dvdResult = statement.executeQuery("SELECT * from adddvds where dvdCode='"+test.get("dvdCode")+"'");

        while (dvdResult.next()){
            ArrayList<Object> dvds= new ArrayList<>();
            dvds.add(dvdResult.getString(1));
            dvds.add(dvdResult.getString(2));
            dvds.add(dvdResult.getString(3));
            dvds.add(dvdResult.getString(4));
            dvds.add(dvdResult.getString(5));
            dvds.add(dvdResult.getString(6));

            JsonNode jsonNode = Json.toJson(dvds);
            return ok(jsonNode).as("application/json");
        }

        JsonNode jsonNode = Json.toJson("");
        return ok(jsonNode).as("application/json");


    }


    public Result GENBK() throws SQLException {
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("brrBkCode").textValue());

        Conn conn=new Conn();
        Connection connection= conn.getConnection();
        Statement statement=connection.createStatement();


        ResultSet genBook = statement.executeQuery("SELECT * from borrowbooks where brBook_Code='"+test.get("brrBkCode")+"'");

        while (genBook.next()){
            ArrayList<Object> genRBooK= new ArrayList<>();

            genRBooK.add(genBook.getString(2));

            JsonNode jsonNode = Json.toJson(genRBooK);
            return ok(jsonNode).as("application/json");
        }

        JsonNode jsonNode = Json.toJson("");
        return ok(jsonNode).as("application/json");


    }

    public Result GENDV() throws SQLException {
        JsonNode test = Json.parse(request().body().asText());

        System.out.println(test.get("brDvdCode").textValue());

        Conn conn=new Conn();
        Connection connection= conn.getConnection();
        Statement statement=connection.createStatement();


        ResultSet genRDvD = statement.executeQuery("SELECT * from borrowdvds where brDvd_Code='"+test.get("brDvdCode")+"'");

        while (genRDvD.next()){
            ArrayList<Object> genRd= new ArrayList<>();

            genRd.add(genRDvD.getString(2));

            JsonNode jsonNode = Json.toJson(genRd);
            return ok(jsonNode).as("application/json");
        }

        JsonNode jsonNode = Json.toJson("");
        return ok(jsonNode).as("application/json");


    }

}
