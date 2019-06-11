package com.test.bahasapemrograman;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovePage extends AppCompatActivity implements View.OnClickListener {
    public static final String pics = "extra_pic";
    public static final String names = "extra_name";
    public static final String descs = "extra_des";
    private Context context;

    private ArrayList<Pemrograman> listpmg;

    public ArrayList<Pemrograman> getListpmg()
    {
        return listpmg;
    }

    public void setListpmg(ArrayList<Pemrograman> listpmg)
    {
        this.listpmg = listpmg;
    }

    TextView judul,desc;
    ImageView foto;
    Button btndetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_page);

        judul = findViewById(R.id.judul);
        foto = findViewById(R.id.foto);
        desc = findViewById(R.id.desc);
        btndetail = findViewById(R.id.buttondetail);
        btndetail.setOnClickListener(this);

        String name = getIntent().getStringExtra(names);
        String pic = getIntent().getStringExtra(pics);
        String des = getIntent().getStringExtra(descs);

        Glide.with(getApplicationContext())
                .load(pic)
                .apply(new RequestOptions().override(60,60))
                .into(foto);

        String text = name + pic;
        judul.setText(name);
        desc.setText(des);
    }

    @Override
    public void onClick(View v) {
        String nmpmg = getIntent().getStringExtra(names);

        switch (nmpmg){
            case "JavaScript":
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/JavaScript"));
                startActivity(viewIntent);
                break;
            case "HTML":
                Intent viewIntent1 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/HTML"));
                startActivity(viewIntent1);
                break;
            case "CSS":
                Intent viewIntent2 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Cascading_Style_Sheets"));
                startActivity(viewIntent2);
                break;
            case "SQL":
                Intent viewIntent3 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/SQL"));
                startActivity(viewIntent3);
                break;
            case "Python":
                Intent viewIntent4 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Python_(programming_language)"));
                startActivity(viewIntent4);

                break;
            case "Java":
                Intent viewIntent5 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Java_(programming_language)"));
                startActivity(viewIntent5);
                break;
            case "Bash/Shell":
                Intent viewIntent6 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Bash_(Unix_shell)"));
                startActivity(viewIntent6);
                break;
            case "PowerShell":
                Intent viewIntent7 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/PowerShell"));
                startActivity(viewIntent7);
                break;
            case "C#":
                Intent viewIntent8 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/C_Sharp_(programming_language)"));
                startActivity(viewIntent8);
                break;
            case "PHP":
                Intent viewIntent9 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/PHP"));
                startActivity(viewIntent9);
                break;
            case "C++":
                Intent viewIntent10 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/C%2B%2B"));
                startActivity(viewIntent10);
                break;
            case "TypeScript":
                Intent viewIntent11 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/TypeScript"));
                startActivity(viewIntent11);
                break;
            case "C":
                Intent viewIntent12 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/C_(programming_language)"));
                startActivity(viewIntent12);
                break;
            case "Ruby":
                Intent viewIntent13 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Ruby_(programming_language)"));
                startActivity(viewIntent13);
                break;
            case "Go":
                Intent viewIntent14 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Go_(programming_language)"));
                startActivity(viewIntent14);
                break;
            case "Assembly":
                Intent viewIntent15 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Assembly_language"));
                startActivity(viewIntent15);
                break;
            case "Swift":
                Intent viewIntent16 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Swift_(programming_language)"));
                startActivity(viewIntent16);
                break;
            case "Kotlin":
                Intent viewIntent17 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Kotlin_(programming_language)"));
                startActivity(viewIntent17);
                break;
            case "R":
                Intent viewIntent18 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/R_(programming_language)"));
                startActivity(viewIntent18);
                break;
            case "VBS":
                Intent viewIntent19 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/VBScript"));
                startActivity(viewIntent19);
                break;
            case "Objective-C":
                Intent viewIntent20 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Objective-C"));
                startActivity(viewIntent20);
                break;
            case "Scala":
                Intent viewIntent21 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Scala_(programming_language)"));
                startActivity(viewIntent21);
                break;
            case "Rust":
                Intent viewIntent22 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Rust_(programming_language)"));
                startActivity(viewIntent22);
                break;
            case "Dart":
                Intent viewIntent23 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Dart_(programming_language)"));
                startActivity(viewIntent23);
                break;
            case "Elixir":
                Intent viewIntent24 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Elixir_(programming_language)"));
                startActivity(viewIntent24);
                break;
            case "Clojure":
                Intent viewIntent25 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/Clojure"));
                startActivity(viewIntent25);
                break;
            case "WebAssembly":
                Intent viewIntent26 =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://en.wikipedia.org/wiki/WebAssembly"));
                startActivity(viewIntent26);
                break;
            default:
                Toast.makeText(this, "SOMETHING WENT WRONG", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
