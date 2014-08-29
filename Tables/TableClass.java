/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testproject.Tables;

import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import testproject.Checks.Check;
import testproject.dbase.DbHelper;
/**
 *
 * @author root
 */
public class TableClass {
    DbHelper db;
    Check chek;
    
    public TableClass() throws SQLException{
        db = new DbHelper();
        chek = new Check();
    }
    
    
    ObservableList<SimpleString> composeData;
    public void makeTable(String query, TableColumn C1, TableView tabId) throws SQLException{
        
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());

            composeData.add(trans);
        }
        
    }
    
    public void makeTable(String query, TableColumn C1, TableColumn C2, TableView tabId) throws SQLException{
        
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        C2.setCellValueFactory(new PropertyValueFactory<>("col2"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());
            trans.col2.setValue(db.getValueAt(i, 1).toString());

            composeData.add(trans);
        }
        
    }
    
    public void makeTable(String query, TableColumn C1, TableColumn C2, TableColumn C3,  TableView tabId) throws SQLException{
        
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        C2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        C3.setCellValueFactory(new PropertyValueFactory<>("col3"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());
            trans.col2.setValue(db.getValueAt(i, 1).toString());
            trans.col3.setValue(db.getValueAt(i, 2).toString());

            composeData.add(trans);
        }
        
    }
    
    public void makeTable(String query, TableColumn C1, TableColumn C2, TableColumn C3, 
                                        TableColumn C4, TableView tabId) throws SQLException{
        
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        C2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        C3.setCellValueFactory(new PropertyValueFactory<>("col3"));
        C4.setCellValueFactory(new PropertyValueFactory<>("col4"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());
            trans.col2.setValue(db.getValueAt(i, 1).toString());
            trans.col3.setValue(db.getValueAt(i, 2).toString());
            trans.col4.setValue(db.getValueAt(i, 3).toString());

            composeData.add(trans);
        }
        
    }
    
    public void makeTable(String query, TableColumn C1, TableColumn C2, TableColumn C3, 
                                        TableColumn C4, TableColumn C5, TableView tabId) throws SQLException{
        
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        C2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        C3.setCellValueFactory(new PropertyValueFactory<>("col3"));
        C4.setCellValueFactory(new PropertyValueFactory<>("col4"));
        C5.setCellValueFactory(new PropertyValueFactory<>("col5"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());
            trans.col2.setValue(db.getValueAt(i, 1).toString());
            trans.col3.setValue(db.getValueAt(i, 2).toString());
            trans.col4.setValue(db.getValueAt(i, 3).toString());
            trans.col5.setValue(db.getValueAt(i, 4).toString());

            composeData.add(trans);
        }
        
    }
    
     public void makeTable(String query, TableColumn C1, TableColumn C2, TableColumn C3, 
                                        TableColumn C4, TableColumn C5,  TableColumn C6, TableView tabId) throws SQLException{
         
        C1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        C2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        C3.setCellValueFactory(new PropertyValueFactory<>("col3"));
        C4.setCellValueFactory(new PropertyValueFactory<>("col4"));
        C5.setCellValueFactory(new PropertyValueFactory<>("col5"));
        C6.setCellValueFactory(new PropertyValueFactory<>("col6"));
            
        composeData = FXCollections.observableArrayList();
        tabId.setItems(composeData);

        System.out.println("Printing the Users History");
        System.out.println("Query is \n" + query);
        db.setQuery(query);

         System.out.println("before loop");
        for (int i = 0; i < db.getRowCount(); i++) {
            SimpleString trans = new SimpleString();

            trans.col1.setValue(db.getValueAt(i, 0).toString());
            trans.col2.setValue(db.getValueAt(i, 1).toString());
            trans.col3.setValue(db.getValueAt(i, 2).toString());
            trans.col4.setValue(db.getValueAt(i, 3).toString());
            trans.col5.setValue(db.getValueAt(i, 4).toString());
            trans.col6.setValue(db.getValueAt(i, 5).toString());

            composeData.add(trans);
        }
        
    }
    
    
    
    
}
