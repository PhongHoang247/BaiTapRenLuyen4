package com.phong.baitaprenluyen4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNamDuong;
    Button btnChuyenDoi;
    TextView txtNamAm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();//Khởi tạo controls
        addEvent();//Gán sự kiện controls
    }

    private void addEvent() {
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyChuyenDuongQuaAm();
            }
        });
    }

    private void XuLyChuyenDuongQuaAm() {
        String arrCan[] = {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
        String arrChi[] = {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mão","Thìn","Tỵ","Ngọ","Mùi"};
        int namDuong = Integer.parseInt(edtNamDuong.getText().toString());//getText trả về một EditTable, lấy chuỗi toString
        String can = arrCan[namDuong%10];
        String chi = arrChi[namDuong%12];
        txtNamAm.setText(can+" "+chi);
    }

    private void addControls() {
        edtNamDuong = (EditText) findViewById(R.id.edtNamDuong);
        btnChuyenDoi = (Button) findViewById(R.id.btnChuyenDoi);
        txtNamAm = (TextView) findViewById(R.id.txtNamAm);
    }
}
