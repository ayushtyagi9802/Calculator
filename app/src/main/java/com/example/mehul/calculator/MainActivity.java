package com.example.mehul.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="vfs";
    int a;
    double c;
    EditText e;
    int t=1;
    int s;
    double m,l,g;
    StringBuilder b =new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.editText2);
    }
  public void ButtonClicked(View view)
   {
       if(view.getId()==R.id.button15)
       {
           a=9;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button19)
       {
           a=8;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button17)
       {
           a=7;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button18)
       {
           a=6;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button16)
       {
           a=5;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button20)
       {
           a=4;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button23)
       {
           a=3;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button24)
       {
           a=2;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button25)
       {
           a=1;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.button30)
       {
           a=0;
           b.append(a);
           e.setText(String.valueOf(b));
       }
       if(view.getId()==R.id.dot)
       {
           char n='.';
           String j = Character.toString(n);
           b.append(j);
           e.setText(String.valueOf(b));
       }
       try{
       if(view.getId()==R.id.button26)
       {
           c = Double.parseDouble(b.toString());
           b.setLength(0);
           e.getText().clear();
           s=1;
       }}
       catch (NumberFormatException nf)
       {
           Log.d(TAG,"no probs",nf);
       }
        try{
       if(view.getId()==R.id.button27)
       {
           c = Double.parseDouble(b.toString());
           b.setLength(0);
           e.getText().clear();
           s=2;
       }}
        catch (NumberFormatException nf)
        {
            Log.d(TAG,"no probs",nf);
        }
        try{
       if(view.getId()==R.id.button28)
       {
           c = Double.parseDouble(b.toString());
           b.setLength(0);
           e.getText().clear();
           s=3;
       }}
        catch (NumberFormatException nf)
        {
            Log.d(TAG,"no probs",nf);
        }
        try{
       if(view.getId()==R.id.button29)
       {
           c = Double.parseDouble(b.toString());
           b.setLength(0);
           e.getText().clear();
           s=4;
       }}
        catch (NumberFormatException nf)
        {
            Log.d(TAG,"no probs",nf);
        }
       if(view.getId()==R.id.button21)
       {
           b.setLength(0);
           e.getText().clear();
       }
       try{
       if(view.getId()==R.id.button22)
       {
           double d = Double.parseDouble(b.toString());
          if(s==1)
          {
               g= d+c;
                e.setText(String.valueOf(g));
          }
           if(s==2)
           {
                g= c-d;
               e.setText(String.valueOf(g));
           }
           if(s==3)
           {
                g= d*c;
               e.setText(String.valueOf(g));
           }
           if(s==4)
           {
                g= c/d;
               e.setText(String.valueOf(g));
           }
       }}
       catch (NumberFormatException nf)
       {
           Log.d(TAG,"no probs",nf);
       }
       if(view.getId()==R.id.saveIt)
       {
          m=g;
           b.setLength(0);
            e.getText().clear();
       }
       try
       {
       if(view.getId()==R.id.add)
       {
           double d = Double.parseDouble(b.toString());
           l = m+d;
           e.setText(String.valueOf(l));
       }}
       catch (NumberFormatException nf)
       {
           Log.d(TAG,"no probs",nf);
       }
       try
       {
       if(view.getId()==R.id.sub)
       {
           double d = Double.parseDouble(b.toString());
           l = d-l;
           e.setText(String.valueOf(l));
       }}
       catch (NumberFormatException nf)
       {
           Log.d(TAG,"no probs",nf);
       }






   }

}
