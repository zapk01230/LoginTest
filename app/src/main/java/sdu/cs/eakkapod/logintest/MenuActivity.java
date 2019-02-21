package sdu.cs.eakkapod.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    //Explicit
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ผูกตัวแปลบน java กับ xml
        TextView nameTextView = findViewById(R.id.tvNameLogin);

        //รับค่าตัวแปล Name จากการ Intent
        getNameString = getIntent().getStringExtra("Name");
        nameTextView.setText("ยินดีต้อนรับ,  "+ getNameString+"  เข้าสู่ระบบ");

    }//End onCreate

}//end Class
