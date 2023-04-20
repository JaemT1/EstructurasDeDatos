package Genericos;

import javax.swing.*;

public class Enlaces {
        
            
        
     public int  conector_int(String titulo)
	{
	int a1;
	a1=Integer.parseInt(JOptionPane.showInputDialog(null,titulo));
	return a1;
    }   
      
    public double  conector_double(String titulo)
	{
	double  a1;
	a1=Double.parseDouble(JOptionPane.showInputDialog(null,titulo));
	return a1;
    }  
        
    	public String  conec_str(String titulo)
	{
	String a1;
	a1=(JOptionPane.showInputDialog(null,titulo));
	return a1;
    } 
       public void salida(String mensaje,double resultado)
{
		JOptionPane.showMessageDialog(null, mensaje+ resultado);
		
}
 public void salida2(String mensaje,int resultado)
{
		JOptionPane.showMessageDialog(null, mensaje+ resultado);
		
}
 public void salida3(String mensaje,String resultado)
{
		JOptionPane.showMessageDialog(null, mensaje+resultado);
		
}       
        
    }

