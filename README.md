# Android_Review_1_plus
Toast &amp; extract res/val/string &amp; default import hotkey


 ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/27.output%203.png)



layout see:


          <?xml version="1.0" encoding="utf-8"?>

         <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
             android:layout_width="match_parent"
             android:layout_height="wrap_content"
             xmlns:tools="http://schemas.android.com/tools"
             android:orientation="vertical"
             android:layout_gravity="center_vertical"
             tools:context=".MainActivity">

             <TextView
                 android:layout_width="wrap_content"
                 android:layout_height="wrap_content"
                 android:layout_gravity="center_horizontal"
                 android:textSize="30sp"
                 android:text="@string/txt1" />

             <Button
                 android:id="@+id/btn"
                 android:layout_width="wrap_content"
                 android:layout_height="wrap_content"
                 android:layout_gravity="center_horizontal"
                 android:text="@string/btn1" />


         </LinearLayout>




code see:


         package com.example.kateskotlinandroid2021

         import androidx.appcompat.app.AppCompatActivity
         import android.os.Bundle
         import android.widget.Button
         import android.widget.Toast

         class MainActivity : AppCompatActivity() {

             override fun onCreate(savedInstanceState: Bundle?) {

                 super.onCreate(savedInstanceState)
                 setContentView(R.layout.activity_main)
                 // inside onCreate() and after setContentView
                 val KButton: Button = findViewById(R.id.btn)
                 KButton.setOnClickListener{ afterClick()}

             }

             private fun afterClick() {
                 Toast.makeText(this, "Welcome to 2021, Dear Kate!",
                     Toast.LENGTH_SHORT).show()
             }
         }
   
   
* build gradle at module level, not project level.

     ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/2.module%20level%20build%20gradle.png)

* attrs in Layout

     ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/16.add%20gravity%20attrs.png)
     
* debug  

    ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/24.debug.png)

* hot key ( opt + enter )

   * extract string value

     ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/11.opt%20%2B%20enter%20%3D%20extract%20string.png)
   
   * defaultly import modules
   
     ![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_1_plus/main/21.opt%20%2B%20enter%20%3D%20import%20default.png)


* project see https://github.com/QueenieCplusplus/Android_Review_1_plus/tree/main/KatesKotlinAndroid2021
