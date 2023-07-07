/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farigmuhammad.dao;
import farigmuhammad.model.Pinjam;
import java.util.*;
/**
 *
 * @author acer2
 */
public class PinjamDaoImpl implements PinjamDao {
    private List<Pinjam> data = new ArrayList<>();

    public PinjamDaoImpl() {
       data.add(new Pinjam("B001","A002","14-12-2019","12-12-2019"));
       
    }
    
    public void insert(Pinjam pinjam){
        data.add(pinjam);
    }
    
    public void update(int index,Pinjam pinjam){
        data.set(index,pinjam);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pinjam getPinjam(int index){
        return data.get(index);
    }
    
    public List<Pinjam> getAll(){
        return data;
    }
    
    
}
