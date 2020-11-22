package ua.com.pavelsavchenko.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {
	public static List<String> getBooks(){ // метод возращает все книги, которые заросились в табоицу
		List <String> result = new ArrayList<String>();
		try ( Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234")) { // присоединились к базе данных
			System.out.println("Java JDBC PostgreSQL Example");
			System.out.println("Connection to PostgreSQL database");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books"); // тут содержатся все книги
			while (resultSet.next()) { // движение по строкам
				result.add(resultSet.getString("name")); // берем только поле name и формируем список книг
			}
		} catch (SQLException e) {
			System.out.println("Connection failure");
			e.printStackTrace();
		}
		return result;
	}

}
