<h1>SISTEM MANAJEMEN HOTEL</h1>

<H6>Sistem Manajemen Hotel ini merupakan sebuah program berbasis Java yang dirancang untuk membantu pegawai dalam mengelola aktivitas operasional hotel secara lebih cepat, terstruktur, dan efisien. 
  Sistem ini menyediakan fitur utama seperti pengelolaan data kamar, proses check-in dan check-out tamu, pencatatan transaksi, serta pembuatan laporan mingguan. Seluruh proses dikemas dalam antarmuka 
  yang sederhana dan mudah digunakan sehingga meminimalkan kesalahan selama pengoperasian.</H6>
<h6>Aplikasi ini dilengkapi dengan fitur autentikasi pegawai melalui tampilan Login Frame sebelum masuk ke menu utama, sehingga keamanan data dan kontrol akses dapat terjamin. Setelah login berhasil, 
  pegawai akan dialihkan ke Main Menu Frame yang berisi berbagai pilihan layanan operasional hotel. Setiap fitur dalam menu dirancang menggunakan konsep modular dan object-oriented agar sistem lebih 
  mudah dikembangkan, dipelihara, serta diintegrasikan dengan layanan hotel lainnya di masa depan. Dengan fitur-fitur tersebut, sistem ini diharapkan dapat meningkatkan kualitas layanan hotel serta 
  efisiensi kerja pegawai secara signifikan.</h6>

<h1>🚀 Cara Menjalankan Project</h1>
<h4>1.Clone Repository</h4>
<h6>git clone https://github.com/sulthanahjihanzyarifah05-creator/SISTEM_MANAJEMEN_HOTEL.git</h6>
<h4>2. Buka di IDE Netbeans</h4>
<h4>3. Pastikan JDK Terinstall</h4>
<h4>4. Jalankan Program</h4> 
<h4> Ada 2 tipe Main, Menggunakan Gui "LoginFrame" dan Tanpa gui "HotelApp" </h4>

<h1>🔵 PENJELASAN GUI  PADA  SISTEM MANAJEMEN HOTEL </h1>

<h6>Project ini menggunakan Java Swing sebagai library utama untuk membuat antarmuka pengguna. Semua tampilan GUI dibuat dengan extends JFrame dan menggunakan komponen-komponen GUI seperti:

1. JFrame
2. JLabel
3. JTextField
4. JPasswordField
5. JButton
6. JTable
7. JScrollPane
8. JTextArea
9. DefaultTableModel
10. JOptionPane</h6>

<h3>LoginFrame GUI Login Pegawai</h3>
<h6>Komponen GUI yang digunakan GUI ini berfungsi sebagai halaman awal tempat pegawai memasukkan username & password. Setelah login berhasil, frame akan membuka MainMenuFrame menggunakan:
  
  1. JFrame → jendela utama login   Inheritance (Pewarisan) LoginFrame adalah anak (subclass) dari JFrame (superclass). 
     <pre><img width="376" height="74" alt="image" src="https://github.com/user-attachments/assets/6700dd48-ecee-4245-87dd-088d8223452a" />
  2. Enkapulasi, hanya bisa di akses pada class tersebut gunakan setter
     <pre><img width="319" height="67" alt="image" src="https://github.com/user-attachments/assets/08773a80-4dd9-4b86-9278-e8ebc2aa955a" /></pre>
  4. JLabel → teks "Username", "Password"
     <PRE><img width="326" height="107" alt="image" src="https://github.com/user-attachments/assets/4a90c6e8-360e-4248-96a3-293556a007f8" /></PRE>
     <PRE><img width="265" height="41" alt="image" src="https://github.com/user-attachments/assets/515e6add-e8f4-4338-a06b-015380d31b38" /></PRE>
  5. JTextField → input username
     <PRE><img width="274" height="47" alt="image" src="https://github.com/user-attachments/assets/e55d6e5c-3d32-44eb-afe0-d05f95cf301d" /></PRE>
  6. JPasswordField → input password
     <PRE><img width="282" height="44" alt="image" src="https://github.com/user-attachments/assets/953c67ed-e251-4e86-b8bf-71d3f24a324e" /></PRE>
  8. JButton → button Login
     <PRE><img width="311" height="73" alt="image" src="https://github.com/user-attachments/assets/396edd33-b30c-4fa3-8f1e-ff95a14a456b" /></PRE>
  10. JOptionPane → menampilkan pop-up login berhasil / gagal</h6>
      <PRE><img width="377" height="50" alt="image" src="https://github.com/user-attachments/assets/9196d3bb-6670-49cc-8bf6-e8314ac0d636" /></PRE>
TAMPILAN GUI 
<pre><img width="255" height="334" alt="image" src="https://github.com/user-attachments/assets/a0f02f95-f4d2-47bd-ba19-dfb319f84b64" /></pre>
  
<h3>MainMenuFrame GUI Menu Utama Sistem Hotel</h3>
<h6>Komponen GUI Frame ini menjadi hub utama, tempat user memilih fitur sistem.
  
  1. JFrame Inheritance (Pewarisan) MainMenuFrame adalah anak (subclass) dari JFrame (superclass).
     <pre><img width="358" height="20" alt="image" src="https://github.com/user-attachments/assets/ad1e3368-e666-4427-8850-b69323ecf752" /></pre>
  2. Enkapsulasi menggunkan setter
     <pre><img width="353" height="73" alt="image" src="https://github.com/user-attachments/assets/51efe0de-d401-4daa-bffc-7af765e6667d" /></pre>
  4. JLabel → Menampilkan "Selamat Datang"
     <pre><img width="389" height="48" alt="image" src="https://github.com/user-attachments/assets/35a7d1c1-fae2-4026-bb82-dd3260571e17" /></pre>
  6. JButton → menu navigasi:
     1. Lihat Semua Kamar
     2. Check-In
     3. Check-Out
     4. Export Histori
     5. Rekap Mingguan
      <pre><img width="347" height="261" alt="image" src="https://github.com/user-attachments/assets/8d443098-b973-4402-88e1-a33d9b322037" /></pre>
     TAMPILAN GUI
       <pre><img width="292" height="296" alt="image" src="https://github.com/user-attachments/assets/33a3584a-351b-4f40-aed8-b2c376154754" /></pre>

 </h6>
 
  <h3>RoomListFrame GUI Daftar Kamar</h3>
  <h6>Komponen GUI untuk menampilkan seluruh status kamar (BOOKED / AVAILABLE) lengkap dengan:
      GUI yang di pakai pada class ini
    1. JFrame
     <pre><img width="299" height="35" alt="image" src="https://github.com/user-attachments/assets/d6267964-f2f7-4092-a5c0-a22083ad74a3" /></pre>
    2. Enkapsulasi yang menggunakan setter
     <pre><img width="356" height="73" alt="image" src="https://github.com/user-attachments/assets/e71b42cd-627e-4e2d-9fb6-467f59a30561" /></pre>
    3. JTable → tabel daftar kamar
     <pre><img width="245" height="18" alt="image" src="https://github.com/user-attachments/assets/dc7d14ec-7abd-4304-9b8f-efd1dc504fba" /></pre>
    4. JScrollPane → memungkinkan tabel di-scroll
     <pre><img width="294" height="15" alt="image" src="https://github.com/user-attachments/assets/c15abaab-f0b2-4dad-a776-9f7114ea1f76" /></pre>
    5. DefaultTableModel → data model tabel</h6>
      <pre><img width="421" height="202" alt="image" src="https://github.com/user-attachments/assets/82f0ba07-e8be-4aae-9ecb-3ec65660d074" /></pre>
     Untuk menampilkan seluruh status kamar (BOOKED / AVAILABLE) lengkap dengan:
      1. Nomor kamar
      2. Harga
      3. Status
      4. Nama tamu
      5. Lama menginap
      TAMPIAN GUI
    <pre><img width="446" height="295" alt="image" src="https://github.com/user-attachments/assets/1b5086d6-9a13-4f95-b8a2-3f1b1a52b93f" /></pre>
  </h6>
<h3>ReceiptFrame GUI Struk Pembayaran</h3>
<h6>Komponen GUI
 
  1. JFrame
       <pre><img width="271" height="17" alt="image" src="https://github.com/user-attachments/assets/ca3d8d5f-2fa6-4fe2-ade2-15d51f1ae59d" /></pre>
    2. Enkapsulasi
  <pre><img width="296" height="58" alt="image" src="https://github.com/user-attachments/assets/49db084b-673d-47ef-95f8-2052e3e5f77e" /></pre>
    3. JTextArea (readonly) → menampilkan struk
   <pre><img width="349" height="50" alt="image" src="https://github.com/user-attachments/assets/12a6d6b3-c021-4514-ad86-e15ef41b3b22" /></pre>
  <pre><img width="525" height="538" alt="image" src="https://github.com/user-attachments/assets/59e8b2b3-17e9-4072-8f22-88f040fac559" /></pre>
    4. JScrollPane
  <pre><img width="265" height="45" alt="image" src="https://github.com/user-attachments/assets/2edbf96e-d563-44b4-bdd8-027de0104721" /></pre>
    5. JButton ("Print" dan "Tutup")
  <pre><img width="323" height="122" alt="image" src="https://github.com/user-attachments/assets/0bbc5a1e-ad96-4107-8663-d4f6c85a38ab" /></pre>
    6. Font monospaced untuk format struk

  Frame ini digunakan untuk:
    1. Menampilkan struk check-out
    2. Mencetak struk ke printer thermal melalui btnPrint</h6>
  TAMPILAN GUI
  <pre><img width="281" height="336" alt="image" src="https://github.com/user-attachments/assets/a0dec240-8f44-4919-a2b7-8ef35a39f2eb" /></pre>
  <pre><img width="281" height="335" alt="image" src="https://github.com/user-attachments/assets/6295b8ce-f951-44d5-8b80-97fd6221d584" /><pre>
  </h6>

<h3>WeeklyReportFrame GUI Rekap Mingguan</h3>
<h6>Komponen GUI 
  Frame ini digunakan untuk menampilkan isi file rekap_mingguan.txt hasil export dari BookingService.
    1. JFrame
      <pre><img width="326" height="28" alt="image" src="https://github.com/user-attachments/assets/13bc9215-e12e-4c20-9547-78a11f7fe567" /></pre>
    2. JTextArea
       <pre><img width="250" height="28" alt="image" src="https://github.com/user-attachments/assets/04eb619a-6be0-44d6-80be-9ca5da0ee6db" /></pre>
    3. JScrollPane
      <pre><img width="284" height="32" alt="image" src="https://github.com/user-attachments/assets/59786d71-961a-4cdb-b82f-d0a91656cb54" /></pre>
  TAMPILAN GUI
  Ke Menu Utama pilih "Export Riwayat"
  <pre><img width="289" height="292" alt="image" src="https://github.com/user-attachments/assets/6729c517-8c60-43f4-85cc-0882d3c30677" /></pre>
  <pre><img width="441" height="446" alt="image" src="https://github.com/user-attachments/assets/bba36b61-c4e8-4676-8849-4237c67efaca" /></pre>
</h6>

<h3>HistoryFrame GUI Riwayat Transaksi</h3>
<h6>Komponen GUI Menampilkan seluruh isi riwayat_transaksi.txt (log Check-In dan Check-Out).
    1. JFrame
      <pre><img width="282" height="13" alt="image" src="https://github.com/user-attachments/assets/b63945eb-96da-47ed-b9c9-fae948c309e0" /></pre>
    2. JTextArea
      <pre><img width="268" height="31" alt="image" src="https://github.com/user-attachments/assets/9b7ab755-7a44-4068-bdad-691bf08b5f6e" /></pre>
    3. JScrollPane
      <pre><img width="265" height="32" alt="image" src="https://github.com/user-attachments/assets/50ed0de1-229d-4552-bf36-61c959f06608" /></pre>
  TAMPILAN GUI
  Ke Menu Utama pilih "Export Riwayat"
  <pre><img width="289" height="292" alt="image" src="https://github.com/user-attachments/assets/6729c517-8c60-43f4-85cc-0882d3c30677" /></pre>
  <pre><img width="788" height="190" alt="image" src="https://github.com/user-attachments/assets/7ea61914-9615-47cd-8a84-98d9149d89c3" /></pre>
  </h6>

<h3>CheckOutFrame GUI Proses Check-Out</h3>
<h6>Komponen GUI
  
  1. JFrame  Inheritance (Pewarisan)CheckOutFrame adalah anak (subclass) dari JFrame (superclass).
    <pre><img width="311" height="25" alt="image" src="https://github.com/user-attachments/assets/4563488f-c990-4f8d-8343-394dfd6b900f" /></pre>
  2. Enkapsulasi
     <pre><img width="458" height="62" alt="image" src="https://github.com/user-attachments/assets/eb527baa-3460-4758-be9f-328f8ea45432" />pre>
  3. JLabel menampilkan "nomor kamar :"
     <pre><<img width="318" height="49" alt="image" src="https://github.com/user-attachments/assets/9942f871-8c12-401e-8e8e-007a3f37ff1d" />/pre>
  4. JTextField
     <pre><img width="245" height="42" alt="image" src="https://github.com/user-attachments/assets/74819a5a-2810-4a5a-9907-d50c82235811" /></pre>
  5. JButton membuat tombol "proses" dan "cetak steuk"
     <pre><img width="344" height="69" alt="image" src="https://github.com/user-attachments/assets/14e93bd3-384e-44a6-993d-2ee4a3e6cbad" /></pre> 
     <pre><img width="278" height="55" alt="image" src="https://github.com/user-attachments/assets/97e56863-805d-48f5-bc3c-f219f50fe505" /></pre>
     untuk tampilan pada struk masing masing akan di panggil
     <pre><img width="530" height="230" alt="image" src="https://github.com/user-attachments/assets/843d6456-27d8-4825-8d69-9434dd0cfc40" /></pre>
  6. Tapilan program CheckOut
     <pre><img width="571" height="296" alt="image" src="https://github.com/user-attachments/assets/79d54e56-a894-4cc2-8e68-fd5969a7ed0e" /></pre>
  7. JOptionPane  menampilkan pop-up Checkout berhasil /Eror / gagal
     <pre> <img width="593" height="127" alt="image" src="https://github.com/user-attachments/assets/59605c84-c9c1-49d3-9a20-39dfa2392cf0" /></pre>
     
    Digunakan untuk:
    
    1. Memasukkan nomor kamar
    2. Menampilkan biaya total, metode pembayaran
    3. Menyimpan data check-out
    4. Membuka ReceiptFrame untuk mencetak struk
    TAMPILAN 
   <pre><img width="278" height="239" alt="image" src="https://github.com/user-attachments/assets/e26c6e0d-7421-4cea-8d1c-6fffbaa90229" /></pre>
   <pre><img width="197" height="198" alt="image" src="https://github.com/user-attachments/assets/62924dfc-7698-490a-b228-e80f68b8927a" /></pre>
   <pre><img width="197" height="204" alt="image" src="https://github.com/user-attachments/assets/a3e3278d-c7cd-4d90-a93f-a76a644ac3d6" /></pre>
   <pre><img width="202" height="93" alt="image" src="https://github.com/user-attachments/assets/d1ffad01-9bf3-4ee5-8fd9-636191b91f28" /></pre>
   <pre><img width="99" height="35" alt="image" src="https://github.com/user-attachments/assets/fa2289a0-15df-42b4-ac39-680e1165a03a" /></pre>
  </h6>
  
<h3>CheckInFrame GUI Proses Check-In</h3>
<h6>Komponen GUI
  
  1. JFrame Inheritance (Pewarisan)CheckOutFrame adalah anak (subclass) dari JFrame (superclass).
     <pre><img width="302" height="14" alt="image" src="https://github.com/user-attachments/assets/d53075c5-7aba-4740-ac46-3dca3bcc473d" /></pre>
  2. Enkapulasi
     <pre><img width="356" height="69" alt="image" src="https://github.com/user-attachments/assets/cf82891c-548c-49d3-a501-9ae009aa72d4" /></pre>
  3. JLabel
     <pre> <img width="256" height="43" alt="image" src="https://github.com/user-attachments/assets/195f6224-5fba-4270-99cf-523707b6ca8e"/></pre>
     <pre><img width="313" height="43" alt="image"     src="https://github.com/user-attachments/assets/20388560-c1ae-40de-b083-a664c8b3268f"/></pre>
  5. JTextField
     <pre><img width="261" height="43" alt="image" src="https://github.com/user-attachments/assets/7f09d324-e63a-44d0-b283-640d814857dd" /></pre>
     <pre><img width="257" height="38" alt="image" src="https://github.com/user-attachments/assets/949f23a3-106c-4183-9101-57533145c9d0" /></pre>
     <pre><img width="271" height="43" alt="image" src="https://github.com/user-attachments/assets/824f8626-625f-4785-a1bd-014c34a8d151" /></pre>
  6. JButton membuat tombol "CheckIn"
     <pre><img width="262" height="47" alt="image" src="https://github.com/user-attachments/assets/a528af6b-c950-4d01-b77a-dc71bd3bd1dd" /></pre>
  7. JOptionPane
      <pre><img width="358" height="218" alt="image" src="https://github.com/user-attachments/assets/5274853e-28c4-4f00-a1a9-e577eda2e172" /></pre>
  Digunakan untuk:
  1. Input nama tamu
  2. Memilih nomor kamar
  3. Mengisi lama menginap
  4. Melakukan Check-In dengan validasi lengkap

  Tamu 1
  <pre><img width="277" height="191" alt="image" src="https://github.com/user-attachments/assets/4da3b943-a83b-4447-a055-fc1ba68f20e1" /></pre>
  <pre><img width="199" height="93" alt="image" src="https://github.com/user-attachments/assets/895f3868-5cc3-4bc6-aad4-d405a54b24d9" /></pre>
  Tamu 2
  <pre><img width="278" height="191" alt="image" src="https://github.com/user-attachments/assets/41275325-cd21-4279-a726-ba617b794ce2" /></pre>
  <pre><img width="197" height="97" alt="image" src="https://github.com/user-attachments/assets/a1d3215d-a58d-41d8-974a-b9bea5f4be84" /></pre>
  Cek status dengan memilih menu "Lihat Kamar"
  <pre><img width="443" height="297" alt="image" src="https://github.com/user-attachments/assets/f0703c4d-e8fd-4a7a-97ea-e8c843df9c11" /></pre>
  </h6>
  
  


  
