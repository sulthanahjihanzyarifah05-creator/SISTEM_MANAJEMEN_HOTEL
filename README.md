<h1 align="center">SISTEM MANAJEMEN HOTEL</h1>

<p>
  <h6>
    Sistem Manajemen Hotel ini merupakan sebuah program berbasis Java yang dirancang untuk membantu pegawai dalam mengelola aktivitas operasional hotel secara lebih cepat, terstruktur, dan efisien. Sistem ini menyediakan fitur utama seperti pengelolaan data kamar, proses check-in dan check-out tamu, pencatatan transaksi, serta pembuatan laporan mingguan.
    <br><br>
    Aplikasi ini dilengkapi dengan fitur autentikasi pegawai melalui tampilan Login Frame sebelum masuk ke menu utama, sehingga keamanan data dan kontrol akses dapat terjamin. Setelah login berhasil, pegawai akan dialihkan ke Main Menu Frame yang berisi berbagai pilihan layanan operasional hotel.
    <br><br>
    Dengan fitur-fitur tersebut, sistem ini diharapkan dapat meningkatkan kualitas layanan hotel serta efisiensi kerja pegawai secara signifikan.
  </h6>
</p>

<hr>
<h1>🚀 Cara Menjalankan Project</h1>

<details>
  <summary><strong>1. Clone Repository</strong></summary>
  <pre>git clone https://github.com/sulthanahjihanzyarifah05-creator/SISTEM_MANAJEMEN_HOTEL.git</pre>
</details>

<details>
  <summary><strong>2. Buka di IDE Netbeans</strong></summary>
  Buka folder project yang sudah di-clone melalui NetBeans.
</details>

<details>
  <summary><strong>3. Pastikan JDK Terinstall</strong></summary>
  Pastikan sudah menginstall JDK minimal versi 17 atau versi yang kompatibel.
</details>

<details>
  <summary><strong>4. Jalankan Program</strong></summary>
  <p>Ada 2 tipe Main:</p>
  <ul>
    <li>GUI: <b>LoginFrame</b></li>
    <li>Tanpa GUI: <b>HotelApp</b></li>
  </ul>
</details>

<hr>

<h1>🔵 PENJELASAN GUI PADA SISTEM MANAJEMEN HOTEL</h1>

<h6>
  Project ini menggunakan Java Swing sebagai library utama untuk membuat antarmuka pengguna. Semua tampilan GUI dibuat dengan extends JFrame dan menggunakan komponen GUI seperti:
  <br>1. JFrame
  <br>2. JLabel
  <br>3. JTextField
  <br>4. JPasswordField
  <br>5. JButton
  <br>6. JTable
  <br>7. JScrollPane
  <br>8. JTextArea
  <br>9. DefaultTableModel
  <br>10. JOptionPane
</h6>

<hr>

<h3>LoginFrame — GUI Login Pegawai</h3>

<details>
  <summary><strong>Komponen GUI LoginFrame</strong></summary>

  1. <strong>JFrame — Inheritance (Pewarisan)</strong>
  <pre><img width="376" src="https://github.com/user-attachments/assets/6700dd48-ecee-4245-87dd-088d8223452a" /></pre>

  2. <strong>Enkapsulasi — Setter</strong>
  <pre><img width="319" src="https://github.com/user-attachments/assets/08773a80-4dd9-4b86-9278-e8ebc2aa955a" /></pre>

  3. <strong>JLabel</strong>
  <pre><img width="326" src="https://github.com/user-attachments/assets/4a90c6e8-360e-4248-96a3-293556a007f8" /></pre>
  <pre><img width="265" src="https://github.com/user-attachments/assets/515e6add-e8f4-4338-a06b-015380d31b38" /></pre>

  4. <strong>JTextField</strong>
  <pre><img width="274" src="https://github.com/user-attachments/assets/e55d6e5c-3d32-44eb-afe0-d05f95cf301d" /></pre>

  5. <strong>JPasswordField</strong>
  <pre><img width="282" src="https://github.com/user-attachments/assets/953c67ed-e251-4e86-b8bf-71d3f24a324e" /></pre>

  6. <strong>JButton (Login)</strong>
  <pre><img width="311" src="https://github.com/user-attachments/assets/396edd33-b30c-4fa3-8f1e-ff95a14a456b" /></pre>

  7. <strong>JOptionPane</strong>
  <pre><img width="377" src="https://github.com/user-attachments/assets/9196d3bb-6670-49cc-8bf6-e8314ac0d636" /></pre>

  <summary><strong>Tampilan GUI LoginFrame</strong></summary>
    <pre><img width="255" src="https://github.com/user-attachments/assets/a0f02f95-f4d2-47bd-ba19-dfb319f84b64" /></pre>
  </details>




<hr>

<h3>MainMenuFrame — GUI Menu Utama Sistem Hotel</h3>
<h6>
  1. JFrame — Inheritance
  <pre><img width="358" src="https://github.com/user-attachments/assets/ad1e3368-e666-4427-8850-b69323ecf752" /></pre>

  2. Enkapsulasi — Setter
  <pre><img width="353" src="https://github.com/user-attachments/assets/51efe0de-d401-4daa-bffc-7af765e6667d" /></pre>

  3. JLabel — "Selamat Datang"
  <pre><img width="389" src="https://github.com/user-attachments/assets/35a7d1c1-fae2-4026-bb82-dd3260571e17" /></pre>

  4. JButton — Navigasi Menu
  <pre><img width="347" src="https://github.com/user-attachments/assets/8d443098-b973-4402-88e1-a33d9b322037" /></pre>

  <b>Tampilan GUI</b>
  <pre><img width="292" src="https://github.com/user-attachments/assets/33a3584a-351b-4f40-aed8-b2c376154754" /></pre>
</h6>

<hr>

<h3>RoomListFrame — GUI Daftar Kamar</h3>
<h6>
  1. JFrame
  <pre><img width="299" src="https://github.com/user-attachments/assets/d6267964-f2f7-4092-a5c0-a22083ad74a3" /></pre>

  2. Enkapsulasi
  <pre><img width="356" src="https://github.com/user-attachments/assets/e71b42cd-627e-4e2d-9fb6-467f59a30561" /></pre>

  3. JTable
  <pre><img width="245" src="https://github.com/user-attachments/assets/dc7d14ec-7abd-4304-9b8f-efd1dc504fba" /></pre>

  4. JScrollPane
  <pre><img width="294" src="https://github.com/user-attachments/assets/c15abaab-f0b2-4dad-a776-9f7114ea1f76" /></pre>

  5. DefaultTableModel
  <pre><img width="421" src="https://github.com/user-attachments/assets/82f0ba07-e8be-4aae-9ecb-3ec65660d074" /></pre>

  <b>Tampilan GUI</b>
  <pre><img width="446" src="https://github.com/user-attachments/assets/1b5086d6-9a13-4f95-b8a2-3f1b1a52b93f" /></pre>
</h6>

<hr>

<h3>CheckInFrame GUI Proses Check-In</h3>
<h6>
1. JFrame — Inheritance (Pewarisan)  
<pre><img width="302" src="https://github.com/user-attachments/assets/d53075c5-7aba-4740-ac46-3dca3bcc473d" /></pre>

2. Enkapsulasi  
<pre><img width="356" src="https://github.com/user-attachments/assets/cf82891c-548c-49d3-a501-9ae009aa72d4" /></pre>

3. JLabel  
<pre><img width="256" src="https://github.com/user-attachments/assets/195f6224-5fba-4270-99cf-523707b6ca8e" /></pre>
<pre><img width="313" src="https://github.com/user-attachments/assets/20388560-c1ae-40de-b083-a664c8b3268f" /></pre>

4. JTextField  
<pre><img width="261" src="https://github.com/user-attachments/assets/7f09d324-e63a-44d0-b283-640d814857dd" /></pre>
<pre><img width="257" src="https://github.com/user-attachments/assets/949f23a3-106c-4183-9101-57533145c9d0" /></pre>
<pre><img width="271" src="https://github.com/user-attachments/assets/824f8626-625f-4785-a1bd-014c34a8d151" /></pre>

5. JButton — tombol "CheckIn"  
<pre><img width="262" src="https://github.com/user-attachments/assets/a528af6b-c950-4d01-b77a-dc71bd3bd1dd" /></pre>

6. JOptionPane  
<pre><img width="358" src="https://github.com/user-attachments/assets/5274853e-28c4-4f00-a1a9-e577eda2e172" /></pre>

<b>Digunakan untuk:</b>  
1. Input nama tamu  
2. Memilih nomor kamar  
3. Mengisi lama menginap  
4. Validasi lengkap saat Check-In  

<b>Tamu 1</b>  
<pre><img width="277" src="https://github.com/user-attachments/assets/4da3b943-a83b-4447-a055-fc1ba68f20e1" /></pre>
<pre><img width="199" src="https://github.com/user-attachments/assets/895f3868-5cc3-4bc6-aad4-d405a54b24d9" /></pre>

<b>Tamu 2</b>  
<pre><img width="278" src="https://github.com/user-attachments/assets/41275325-cd21-4279-a726-ba617b794ce2" /></pre>
<pre><img width="197" src="https://github.com/user-attachments/assets/a1d3215d-a58d-41d8-974a-b9bea5f4be84" /></pre>

<b>Cek status dengan memilih menu "Lihat Kamar"</b>  
<pre><img width="443" src="https://github.com/user-attachments/assets/f0703c4d-e8fd-4a7a-97ea-e8c843df9c11" /></pre>

</h6>

<hr>

<h3>CheckOutFrame GUI Proses Check-Out</h3>
<h6>

1. JFrame — Inheritance (Pewarisan)  
<pre><img width="311" src="https://github.com/user-attachments/assets/4563488f-c990-4f8d-8343-394dfd6b900f" /></pre>

2. Enkapsulasi  
<pre><img width="458" src="https://github.com/user-attachments/assets/eb527baa-3460-4758-be9f-328f8ea45432" /></pre>

3. JLabel — menampilkan "nomor kamar :"  
<pre><img width="318" src="https://github.com/user-attachments/assets/9942f871-8c12-401e-8e8e-007a3f37ff1d" /></pre>

4. JTextField  
<pre><img width="245" src="https://github.com/user-attachments/assets/74819a5a-2810-4a5a-9907-d50c82235811" /></pre>

5. JButton — tombol "proses" dan "cetak struk"  
<pre><img width="344" src="https://github.com/user-attachments/assets/14e93bd3-384e-44a6-993d-2ee4a3e6cbad" /></pre>
<pre><img width="278" src="https://github.com/user-attachments/assets/97e56863-805d-48f5-bc3c-f219f50fe505" /></pre>
<pre><img width="571" src="https://github.com/user-attachments/assets/79d54e56-a894-4cc2-8e68-fd5969a7ed0e" /></pre>

6. JOptionPane — pop-up Berhasil/Error/Gagal  
<pre><img width="593" src="https://github.com/user-attachments/assets/59605c84-c9c1-49d3-9a20-39dfa2392cf0" /></pre>

Untuk tampilan pada struk masing masing akan dipanggil:  
<pre><img width="530" src="https://github.com/user-attachments/assets/843d6456-27d8-4825-8d69-9434dd0cfc40" /></pre>

<b>Tampilan Program Check-Out:</b>  
<b>Tampilan:</b>  
<pre><img width="278" src="https://github.com/user-attachments/assets/e26c6e0d-7421-4cea-8d1c-6fffbaa90229" /></pre>
<pre><img width="197" src="https://github.com/user-attachments/assets/62924dfc-7698-490a-b228-e80f68b8927a" /></pre>
<pre><img width="197" src="https://github.com/user-attachments/assets/a3e3278d-c7cd-4d90-a93f-a76a644ac3d6" /></pre>
<pre><img width="202" src="https://github.com/user-attachments/assets/d1ffad01-9bf3-4ee5-8fd9-636191b91f28" /></pre>
<pre><img width="99" src="https://github.com/user-attachments/assets/fa2289a0-15df-42b4-ac39-680e1165a03a" /></pre>

</h6>
<hr>

<h3>ReceiptFrame — GUI Struk Pembayaran</h3>
<h6>
  1. JFrame
  <pre><img width="271" src="https://github.com/user-attachments/assets/ca3d8d5f-2fa6-4fe2-ade2-15d51f1ae59d" /></pre>

  2. Enkapsulasi
  <pre><img width="296" src="https://github.com/user-attachments/assets/49db084b-673d-47ef-95f8-2052e3e5f77e" /></pre>

  3. JTextArea (readonly)
  <pre><img width="349" src="https://github.com/user-attachments/assets/12a6d6b3-c021-4514-ad86-e15ef41b3b22" /></pre>
  <pre><img width="525" src="https://github.com/user-attachments/assets/59e8b2b3-17e9-4072-8f22-88f040fac559" /></pre>

  4. JScrollPane
  <pre><img width="265" src="https://github.com/user-attachments/assets/2edbf96e-d563-44b4-bdd8-027de0104721" /></pre>

  5. JButton — Print & Tutup
  <pre><img width="323" src="https://github.com/user-attachments/assets/0bbc5a1e-ad96-4107-8663-d4f6c85a38ab" /></pre>

  <b>Tampilan GUI</b>
  <pre><img width="281" src="https://github.com/user-attachments/assets/a0dec240-8f44-4919-a2b7-8ef35a39f2eb" /></pre>
  <pre><img width="281" src="https://github.com/user-attachments/assets/6295b8ce-f951-44d5-8b80-97fd6221d584" /></pre>

</h6>

<hr>

<h3>HistoryFrame — GUI Riwayat Transaksi</h3>
<h6>
  1. JFrame
  <pre><img width="282" src="https://github.com/user-attachments/assets/b63945eb-96da-47ed-b9c9-fae948c309e0" /></pre>

  2. JTextArea
  <pre><img width="268" src="https://github.com/user-attachments/assets/9b7ab755-7a44-4068-bdad-691bf08b5f6e" /></pre>

  3. JScrollPane
  <pre><img width="265" src="https://github.com/user-attachments/assets/50ed0de1-229d-4552-bf36-61c959f06608" /></pre>

  <b>Tampilan GUI</b>
  <h6>Pergi Ke menu utama pilih "Export Riwayat"</h6>
  <pre><img width="289" src="https://github.com/user-attachments/assets/6729c517-8c60-43f4-85cc-0882d3c30677" /></pre>
  <pre><img width="788" src="https://github.com/user-attachments/assets/7ea61914-9615-47cd-8a84-98d9149d89c3" /></pre>
</h6>

<hr>

<h3>WeeklyReportFrame — GUI Rekap Mingguan</h3>
<h6>
  1. JFrame
  <pre><img width="326" src="https://github.com/user-attachments/assets/13bc9215-e12e-4c20-9547-78a11f7fe567" /></pre>

  2. JTextArea
  <pre><img width="250" src="https://github.com/user-attachments/assets/04eb619a-6be0-44d6-80be-9ca5da0ee6db" /></pre>

  3. JScrollPane
  <pre><img width="284" src="https://github.com/user-attachments/assets/59786d71-961a-4cdb-b82f-d0a91656cb54" /></pre>

  <b>Tampilan GUI</b>
  <h6>Pergi ke menu utama pilih "Rekap Mingguan"</h6>
  <pre><img width="289" src="https://github.com/user-attachments/assets/6729c517-8c60-43f4-85cc-0882d3c30677" /></pre>
  <pre><img width="441" src="https://github.com/user-attachments/assets/bba36b61-c4e8-4676-8849-4237c67efaca" /></pre>
</h6>

<hr>



<h1>🟦 Penjelasan Dua Materi Sebelum UTS</h1>

<h6>

<br>1. <b>Class</b> adalah blueprint atau cetak biru yang mendefinisikan atribut dan perilaku. 
Object adalah instance nyata yang dibuat dari class.
<pre>
<img width="325" height="261" alt="image" 
src="https://github.com/user-attachments/assets/ecabc8a0-b503-453d-993f-a79027849e2d" />
</pre>

<br>2. <b>Method</b> adalah fungsi yang dimiliki class untuk menjalankan proses.
<pre>
<img width="305" height="41" alt="image" 
src="https://github.com/user-attachments/assets/eb3ab7af-0b2d-4d1d-ba26-129591b97ffd" />
</pre>

<br>3. <b>Package</b> membantu mengelompokkan class berdasarkan fungsi.
<pre>
<img width="234" height="410" alt="image" 
src="https://github.com/user-attachments/assets/8e4cdab3-cd22-4aad-baff-1b7ff8365574" />
</pre>

<br>4. <b>Constructor</b> digunakan untuk menginisialisasi nilai awal object.
<pre>
<img width="469" height="82" alt="image" 
src="https://github.com/user-attachments/assets/b24f39e2-16fe-477b-a79a-51246f4bb9c1" />
</pre>

<br>5. <b>Variabel</b> menyimpan nilai yang dapat berubah. 
<b>Konstanta</b>: nilai tetap (menggunakan <code>final</code>).
<pre>
<img width="186" height="55" alt="image" 
src="https://github.com/user-attachments/assets/7cd258bc-d839-4ff5-bcd3-e5dcde91eaab" />
</pre>

<br>6. <b>Primitive types</b>: int, double, char, boolean
<pre>
<img width="83" height="15" alt="image" 
src="https://github.com/user-attachments/assets/d794dd21-b8b8-46ba-9d1a-3d8fde429758" />
</pre>

<br>7. <b>Kondisional</b> (if, switch)
<pre>
<img width="318" height="239" alt="image" 
src="https://github.com/user-attachments/assets/58fb9124-0197-4999-a77d-3ebe4417a14d" />
</pre>

<br>8. <b>Looping</b> (for, while)
<pre>
<img width="425" height="112" alt="image" 
src="https://github.com/user-attachments/assets/9347c545-90f9-4194-bedf-6d765f89a5c9" />
</pre>

</h6>

<h1>🟩 Penjelasan Materi Setelah UTS (Non-GUI)</h1>

<h6>

<br>1. <b>Encapsulation (Enkapsulasi)</b> Menyembunyikan data agar lebih aman menggunakan private + getter/setter.
<pre>
<img width="216" height="194" alt="image" src="https://github.com/user-attachments/assets/77840267-2436-40c9-ba0f-4292ae4cffc0" />
</pre>

<br>2. <b>Inheritance (Pewarisan)</b> Class turunan mewarisi atribut dan method class induk.
<pre>
<img width="298" height="117" alt="image" src="https://github.com/user-attachments/assets/ebee639f-6270-4b6d-9c0b-c71f96dc52c6" />
</pre>

<br>3. <b>Polymorphism</b> Satu method dapat memiliki banyak bentuk.
<pre>
<img width="364" height="164" alt="image" src="https://github.com/user-attachments/assets/5be4fc8c-a9a5-43d8-b79a-f02f3aafe766" />
</pre>

</h6>



<h1>📝 Daftar Anggota dan Pembagian Tugas</h1>

<table>
  <thead>
    <tr>
      <th>No</th>
      <th>Nama</th>
      <th>NIM</th>
      <th>Tugas</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>Muhammad Rafi Setianto</td>
      <td>L0324026</td>
      <td>Mengembangkan ide, mengedit video, berkontribusi dalam pembuatan program</td>
    </tr>
    <tr>
      <td>2</td>
      <td>Risma Ramadhani</td>
      <td>L0324034</td>
      <td>Membuat ide, mengedit video, berkontribusi dalam pembuatan program</td>
    </tr>
    <tr>
      <td>3</td>
      <td>Sulthanah Jihan Zyarifah</td>
      <td>L0324034</td>
      <td>Mengembangkan ide, membuat program Java, membuat tampilan GUI, membuat repository GitHub, membuat Readme</td>
    </tr>
  </tbody>
</table>




