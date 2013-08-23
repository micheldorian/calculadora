package com.example.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


	EditText et1;
	

	double n1;
	double n2;
	String operacion;
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1 = (EditText) this.findViewById(R.id.dato1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void uno (View v)
	{
		et1.setText(et1.getText()+"1");
	}
	
	public void dos (View v)
	{
		et1.setText(et1.getText()+"2");
	}
	
	public void tres (View v)
	{
		et1.setText(et1.getText()+"3");
	}
	
	public void cuatro (View v)
	{
		et1.setText(et1.getText()+"4");
	}
	
	public void cinco (View v)
	{
		et1.setText(et1.getText()+"5");
	}
	
	public void seis (View v)
	{
		et1.setText(et1.getText()+"6");
	}
	
	public void siete (View v)
	{
		et1.setText(et1.getText()+"7");
	}
	
	public void ocho (View v)
	{
		et1.setText(et1.getText()+"8");
	}
	
	public void nueve (View v)
	{
		et1.setText(et1.getText()+"9");
	}
	
	public void cero (View v)
	{
		et1.setText(et1.getText()+"0");
	}

	public void suma (View v)
	{
		this.n1 = Double.parseDouble(this.et1.getText().toString());
		et1.setText("");	 
		operacion="+";
		
	}
	
	public void resta (View v)
	{
		this.n1 = Double.parseDouble(this.et1.getText().toString());
		et1.setText("");
		operacion="-";
		
	}
	
	public void multiplica (View v)
	{
		this.n1 = Double.parseDouble(this.et1.getText().toString());
		et1.setText("");
		operacion="*";
	}
	
	public void divide (View v)
	{
		this.n1 = Double.parseDouble(this.et1.getText().toString());
		et1.setText("");
		operacion="/";
	}
	
	public void igual (View v)
	{
		
		this.n2 = Double.parseDouble(this.et1.getText().toString());
		if(operacion.equals("+"))
				{
			    et1.setText((n1+n2)+"");
				}
		else
		{
			if(operacion.equals("-"))
			{
				  et1.setText((n1-n2)+"");
			}
	else
	{
		if(operacion.equals("*"))
		{
			 et1.setText((n1*n2)+"");
		}
else
{
	if(operacion.equals("/"))
	{
		 et1.setText((n1/n2)+"");
	}
else
{

}
}
	}
		}

	}
	public void borrar (View v)
	{
		n1=0;
		n2=0;
		operacion="";
		et1.setText("");
	}

}
