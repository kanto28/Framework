package test_framework;
import framework.annotation.*;
public class Emp {
    int idemp;
    String nom;
    String nee;
    String genre;
    @Url(url_map="save")
    public void insert(){
        
    }
    
    @Url(url_map="findall")
    public void findEmp(){

    }
    public void update(){
        
    }
    @Url(url_map="findall")
    public void searchEmp(){
        
    }
    

}
