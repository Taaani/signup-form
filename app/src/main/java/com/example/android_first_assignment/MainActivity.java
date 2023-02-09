package com.example.android_first_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clear_form(View view){
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.psword);
        EditText cpassword = findViewById(R.id.cpasword);
        EditText dob = findViewById(R.id.dob);
        EditText city = findViewById(R.id.city);
        EditText country = findViewById(R.id.country);
        name.setText("");
        email.setText("");
        password.setText("");
        cpassword.setText("");
        dob.setText("");
        city.setText("");
        country.setText("");



    }


    public void submit_form(View view){

        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.psword);
        EditText cpassword = findViewById(R.id.cpasword);
        RadioGroup gender = findViewById(R.id.gender);
        CheckBox cricket  = findViewById(R.id.cricket);
        CheckBox football = findViewById(R.id.football);
        CheckBox hockey = findViewById(R.id.hockey);
        EditText dob = findViewById(R.id.dob);
        EditText city = findViewById(R.id.city);
        EditText country = findViewById(R.id.country);
        RadioGroup skills = findViewById(R.id.skills);
        CheckBox conditions = findViewById(R.id.conditions);
        TextView show_result = findViewById(R.id.show_result);
        String n = name.getText().toString();
        String e = email.getText().toString();
       String p = password.getText().toString();
       String cp = cpassword.getText().toString();
        String d = dob.getText().toString();
        String ci = city.getText().toString();
        String co = country.getText().toString();
        String game = "sport:";
        if(cricket.isChecked()){
           game += " cricket";
        }
        if(football.isChecked()){
            game += " football";
        }
        if(hockey.isChecked()){
            game += " hockey";
        }
//        code for gender selections
        String  storeGenderValue = "gender: ";
        RadioButton ourRbutton = findViewById(gender.getCheckedRadioButtonId());
        String g = ourRbutton.getText().toString();
         storeGenderValue +=g;
//         code skill selection
        String  storeSkillValue = "skill: ";
        RadioButton ourRbutton2 = findViewById(skills.getCheckedRadioButtonId());
        String si = ourRbutton.getText().toString();
        storeSkillValue +=si;
       // n.isEmpty()||e.isEmpty()||p.isEmpty()||cp.isEmpty()||d.isEmpty()||ci.isEmpty()||co.isEmpty()
//        Toast.makeText(this, "please match your password", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,"name"+n +"\n"+"E-mail:"+e+"\n"+storeGenderValue+"\n"+"birh day "+d+"\n"+"City"+ci+"\n"+"Country "+co+"\n"+storeSkillValue, Toast.LENGTH_SHORT).show();
//        ;

        if(n.isEmpty()||e.isEmpty()||p.isEmpty()||cp.isEmpty()||d.isEmpty()||ci.isEmpty()||co.isEmpty()){
            Toast.makeText(this, "please fill the all input", Toast.LENGTH_SHORT).show();
        }else{
            if(p.equals(cp)){
                Toast.makeText(this,"name"+n +"\n"+"E-mail:"+e+"\n"+storeGenderValue+"\n"+"birh day "+d+"\n"+"City"+ci+"\n"+"Country "+co+"\n"+storeSkillValue, Toast.LENGTH_SHORT).show();
                String s = "Wellcome "+n +"\n"+"E-mail: "+e+"\n"+storeGenderValue+"\n"+"birh day "+d+"\n"+"City :"+ci+"\n"+"Country :"+co+"\n"+storeSkillValue;
                show_result.setText(s);
            }else{
                Toast.makeText(this, "your password does not match", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void SignInForm(View view){
        Intent it = new Intent(getApplicationContext(),signInform.class);
        startActivity(it);
    }

    public void goToGoogle(View view){
        Intent goToGo = new Intent(Intent.ACTION_VIEW);
        goToGo.setData(Uri.parse("https://www.w3schools.com/"));
        startActivity(goToGo);
    }



}