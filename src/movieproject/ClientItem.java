/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

/**
 *
 * @author Simona
 */
public class ClientItem {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }  
    public ClientItem(String name,String surname) {
        setName(name);
        setSurname(surname);
        
    }

    public ClientItem() {
        this("Simona","Dimitrova");
        

    }
    


    
}
