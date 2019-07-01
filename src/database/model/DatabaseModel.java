/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.model;

/**
 *
 * @author Simon Plogmann
 */
public class DatabaseModel {
    DatabaseConnectorMySQL connector;
    QueryResult result;
    String ip = "sql.woeste.org", database = "simon", username, password;
    int port = 3036;
    
    
    public DatabaseModel()
    {
        connector = new DatabaseConnectorMySQL(ip, port, database,username, password);
        
        
    }
}
