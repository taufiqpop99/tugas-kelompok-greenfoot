import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

public class Spider extends Actor //Memperluas Subclass Spider Actor Terhadap Fungsi Lainnya
{
       public void act() //Memanggil Fungsi Class Pada Actor
       {
           int x = getX(); //Untuk Menjalankan Masukkan dari X
           int y = getY(); //Untuk Menjalankan Masukkan Y
           setLocation (x, y + 1); //Untuk Meletakkan Spider Sesuai Masukan int X dan Y nya
           if(getY() ==499) //Berfungsi Jika Masukkan dari Y sama dengan 499
           {
               setLocation(getX(),0); //Maka Lokasi nya Akan Diletakkan Sesuai Masukan getX dan Masukkan getY nya 0
           }
       }
}
