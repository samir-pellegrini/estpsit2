
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class calcolodata {
    private Date data;
   
    public calcolodata(Date data)
    {
        this.data=data;
    }
   
    public Date calcolodata()
    {
        if(data.getDay()== 31 && data.getMonth()==11)
        {
            
            data.setDate(1); 
            data.setMonth(1);
            data.setYear(data.getYear()+1);
            
        }
        if(data.getDay()== 31 && data.getMonth()== 2 && data.getMonth()==4 &&data.getMonth()==7 && data.getMonth()==9)
        {
             data.setDate(1); 
            data.setMonth(data.getMonth()+1);
            data.setYear(data.getYear());
        }
        if(data.getDay()== 30 && data.getMonth()== 2 && data.getMonth()==4 &&data.getMonth()==7 && data.getMonth()==9)
        {
            data.setDate(31); 
          data.setMonth(data.getMonth());
            data.setYear(data.getYear());
        }
        if(data.getDay()== 30){
            data.setDate(1); 
            data.setMonth(data.getMonth()+1);
            data.setYear(data.getYear());
        }
          if(data.getMonth()==2)
          {
          boolean bise = ( data.getYear()>1584 && ( (data.getYear()%400==0) ||  (data.getYear()%4==0 && data.getYear()%100!=0) ) );
          if(bise==true)
          {
              if(data.getDate()==28)
              {
                   data.setDate(29);
                   data.setMonth(data.getMonth());
                   data.setYear(data.getYear());
        
              }
              if(data.getDate()==29)
              {
                 data.setDate(1);
                  data.setMonth(data.getMonth()+1);
                  data.setYear(data.getYear());
              }
          }
            if(bise==false)
          {
              if(data.getDate()==28)
              {
                  data.setDate(1);
                  data.setMonth(data.getMonth()+1);
                  data.setYear(data.getYear());
              }
          }
          }
                  data.setDate(data.getDate()+1);
                  data.setMonth(data.getMonth());
                  data.setYear(data.getYear());
                
                
    return data;
    }
    
    
    public String giorno()
    {
        
        int num=data.getDay();
        String nom="";
        if(num==0)
        {
          nom="sabato";
        }
        if(num==1)
        {
            nom="lunedi";
        }
        if(num==2)
        {
             nom="martedi";
        }
          if(num==3)
        {
             nom="mercoledi";
        }
          if(num==4)
        {
             nom="giovedi";
        }
          if(num==5)
        {
             nom="venerdi";
        }
         if(num==6)
        {
            nom="sabato";
        }
         return nom;
    }
}

