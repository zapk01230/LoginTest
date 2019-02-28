package sdu.cs.eakkapod.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Explicit
    String nameString,userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปลบน Java กับ xml
        final EditText nameEditText     = findViewById(R.id.edtName);
        final EditText userEditText     = findViewById(R.id.edtUsername);
        final EditText passEditText     = findViewById(R.id.edtPassword);
        Button loginButton = findViewById(R.id.btnLoing);

        //onClick Login Button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //Check ค่าว่าง
                if ((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(), "กรอกข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                } else {

                    //Check Username and Password
                    if ((userString.equals("admin")) && (passString.equals("1234"))) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                        //ส่งข้อมูลไปหน้า Menu
                        Intent menuIntent = new Intent(MainActivity.this, MenuActivity.class);
                        menuIntent.putExtra("Name", nameString);
                        startActivity(menuIntent);
                    } else {
                        Toast.makeText(getApplicationContext(), "กรอกข้อมูลไม่ถูกต้อง", Toast.LENGTH_SHORT).show();//Toast คือการแสคงข้อความระยะสั้นๆ
                            }
                        }
                                        }
        });//end OnClickListener

    }//end onCreate

}//end class
