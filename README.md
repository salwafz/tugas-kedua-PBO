# Pemrograman Berbasis Obyek - Pertemuan Kedua
Tugas Porrograman Berbasis Objek (PBO) pertemuan kedua ini yaitu mengimplementasikan `constructor`, `casting`, `super`, `this`, dan `interface`.

---

## Daftar Isi
- [Constructor)(Constructor)
- [Interface] (interface)
- [This] (#This)
- [Super] (#Super)
- [Casting] (Casting)

---
## Constructor
### Pengertian
Constructor adalah sebuah method khusus dalam kelas yang memiliki nama yang sama persis dengan nama kelasnya. Constructor digunakan untuk menginisialisasi atau mempersiapkan sebuah objek ketika objek tersebut dibuat (diinstansiasi).
### Contoh
````java
public class Hewan {
    public void hewan() {
        System.out.println("Ini konstruktor hewannnnnnnn");
    }}
`````
Constructor Hewan() adalah default constructor tanpa parameter yang secara otomatis dipanggil saat objek dari class Hewan dibuat. Constructor ini mencetak pesan "Ini konstruktor hewannnnnnnn", menandakan eksekusinya. Meskipun sederhana, constructor ini biasanya digunakan untuk menginisialisasi objek ketika objek tersebut diciptakan, meskipun dalam contoh ini hanya berfungsi untuk menampilkan pesan.

---
## Interface
### Pengertian
Interface adalah sekumpulan method yang harus diimplementasikan oleh kelas lain atau kelas turunannya. Interface tidak memiliki implementasi method sendiri, hanya deklarasi methodnya saja. Kelas yang ingin mengakses interface harus mencantumkan semua method yang didefinisikan dalam interface tersebut.
### Contoh
````java
public interface Berternak {
    public void ngarit();
}
public interface Berkebun {
    public void menanam();
}
public interface Bertani {
    public void memanen();
}
````
Interface ini tidak memiliki implementasi di dalamnya, jika ingin memberi implementasi pada Interface, maka kita dapat memberi implementasi pada kelas lain.
````java
public class HewanPeliharaan extends Hewan implements Berkebun, Berternak, Bertani {
    @Override
    public void menanam() {
        System.out.println("Aku makan apa saja");
    }

    @Override
    public void ngarit() {
        System.out.println("Aku ngarit untuk hewanku");
    }

    @Override
    public void memanen() {
        System.out.println("Aku memanen");
    }
}
````
Pada contoh kode tersebut, terdapat tiga interface yang didefinisikan: `Berternak`,  `Bertani`, dan `Berkebun`. Masing-masing interface mendeklarasikan satu method abstrak: menanam(), ngarit(), dan memanen(), yang harus diimplementasikan oleh class yang mengimplementasikan interface tersebut. Class HewanPeliharaan kemudian mengimplementasikan ketiga interface ini, yaitu `Berternak`,  `Bertani`, dan `Berkebun`, serta mewarisi dari class Hewan. Ini berarti HewanPeliharaan harus menyediakan implementasi konkret untuk ketiga method dari interface tersebut, yaitu menanam(), ngarit(), dan memanen(),  yang memungkinkan objek HewanPeliharaan untuk memiliki fitur-fitur yang didefinisikan oleh interface-interface tersebut.

---
## This
### Pengertian
this adalah sebuah referensi yang merujuk pada objek saat ini. Dalam konteks method, this mengacu pada objek yang memanggil method tersebut.
### Contoh
````java
public void iniHewan() {
        System.out.println("Ini this hewan peliharaan");
    }
 public void HewanPeliharaan() {
        this.iniHewan();
}
````
- public void IniHewan() adalah method yang mencetak pesan "Ini this hewan peliharaan" ke utama saat dipanggil. Method ini tidak menerima parameter dan tidak mengembalikan nilai.
- public void HewanPeliharaan() adalah method yang memanggil method IniHewan() menggunakan this.IniHewan(). Keyword this digunakan di sini untuk menunjukkan bahwa kita ingin memanggil method IniHewan() dari objek saat ini.

---
## Super
### Pengertian
super adalah sebuah referensi yang merujuk ke objek induk (parent object) atau objek dari kelas superclass.
### Contoh
ini adalah source code kelas induk yang akan di jadikan super pada kelas anak / turunan
````java
public class Hewan{
  public void iniHewan() {
        System.out.println("Ini super hewannnnnnnn");
    }}
````
ini adalah source code untuk menggunakan super
````java
public class HewanPeliharaan extends Hewan
public void HewanPeliharaan() {
super.iniHewan();
}
````
`super.IniHewan()` adalah pernyataan yang digunakan untuk memanggil method `IniHewan()` dari superclass dari kelas Hewan. Artinya, jika kelas HewanPeliharaan adalah subclass dari kelas Hewan yang memiliki method `IniHewan()`, maka pernyataan ini akan memanggil method tersebut dari kelas Hewan. Oleh karena itu, jika keyword super di jalankan maka output yang keluar adalah "Ini super hewannnnnnnn".

---
## Casting
### Pengertian
Casting adalah proses mengubah tipe data satu variabel ke tipe data lainnya. 
### Contoh
```` java
Hewan miaw = (Hewan) comel;
````
