package kr.co.tjoeun.a20200318_java02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1) 이벤트 설정
//        2) 초기 화면 값 세팅 .setText 등

        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
