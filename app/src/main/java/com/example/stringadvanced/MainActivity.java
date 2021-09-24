package com.example.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String nameString = "Андрей, Алексей, Роман, Павел, Михаил";
//        String[] names = nameString.split(", ");
//        for (String name : names) {
//            Log.i("MyName", name);
//        }

//        String geometry = "Геометрия";
//        String meter = geometry.substring(3, 7);
//        Log.i("Meter", meter);

//        String river = "MississippiMississippi";
//        Pattern pattern = Pattern.compile("Mi(.*?)pi");
//        Matcher matcher = pattern.matcher(river);
//        while (matcher.find()) {
//            Log.i("Pattern", matcher.group());

        String url = "<img style=\"display:block\" src=\"https://www.udemy.com/staticx/udemy/images/v7/logo-udemy-inverted.svg\" alt=\"Udemy\" width=\"91\" height=\"34\">";
        Pattern patternImg = Pattern.compile("src\"(.*=)\"");
        Pattern patternName = Pattern.compile("alt=\"(.*?)\"");
        Matcher matcherImg = patternImg.matcher(url);
        Matcher matcherName = patternName.matcher(url);
        while (matcherImg.find()) {
            Log.i("PatternImg", matcherImg.group(1));
    }

        while (matcherName.find()) {
            Log.i("PatternName", matcherName.group(1));
        }



}
}