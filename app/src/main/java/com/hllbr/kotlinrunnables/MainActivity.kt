package com.hllbr.kotlinrunnables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(view : View){

        /*
        number = 0 eğer fonksiyon her çağrıldığında 0 olsun istemiyorsam bu alanı bloklamam lazım
        eğer butona basıldığında arttırmak isteseydim verimi =
        number = number +1
        textView.text = "Time : ${number}"


          while(number < 1000){
            number += 1
            textView.text = "number : ${number}"
        }//direkt olarak sonuca ulşaırım aradaki sayıların geçişlerini görmem bunun bir sebebi var sebebi ise pc nin hesaplama hızından kaynaklanıyor eğer ben işlemimi yavaşlatmak ve aradaki sayı geçişlerini görmek istersem Thread kullanabilirim

         */
        while(number <1000){
            number += number
            textView.text = "Time : ${number}"
            Thread.sleep(1000)
        /*Eğer ben bir thread ile işlemi gerçekleştirmek istersem kullanıcının App ile olan iletişimini kesmek zorunda kalırım.
            Bu işlem sadece Thread'i bir saniye bekletmekle değil internetten bir veri çekme işleminde çok yığun çok fazla zaman alcak bir işlemi yaparkende  geçerli
            Biz böyle işlemleri ön planda değil arkaplanda yapmayı tercih ederizki kullanıcının app ile olan iletişimi kitlenmesin
            Bu işlem sadece app ile iletişimi kesmez aynı zamanda appi de çökertebilir.
            İşlemi yapıcam derken şuan kullanıcı arayüzünü kitledim :( app çöktü
            Bu işlemi doğru yapmanın yolu Runnable'dan faydalanmak
            */
        }


    }
    fun stop(view : View){

    }
}