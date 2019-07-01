/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.model;

import java.util.Observable;

/**
 *
 * @author Simon Plogmann
 */
public class DatabaseModel extends Observable {
    DatabaseConnectorMySQL connector;
    QueryResult result;
    String ip = "sql.woeste.org", database = "simon";
    int port = 3306;
    
    
    public DatabaseModel()
    {
        
        
        
    }
    
    public void erstelleConnector(String pUsername, String pPassword)
    {
        connector = new DatabaseConnectorMySQL(ip, port, database, pUsername, pPassword);
    }
    
    public void fuehreSQLAus(String pSQLStatement)
    {
        connector.executeStatement(pSQLStatement);
    }
}
