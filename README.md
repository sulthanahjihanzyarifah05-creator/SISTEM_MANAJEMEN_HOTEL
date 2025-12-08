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

<h4>LoginFrame GUI Login Pegawai</h4>
<h6>Komponen GUI yang digunakan GUI ini berfungsi sebagai halaman awal tempat pegawai memasukkan username & password. Setelah login berhasil, frame akan membuka MainMenuFrame menggunakan:
  
  1. JFrame → jendela utama login
  2. JLabel → teks "Username", "Password"
  3. JTextField → input username
  4. JPasswordField → input password
  5. JButton → button Login
  6. JOptionPane → menampilkan pop-up login berhasil / gagal</h6>
<h4>MainMenuFrame GUI Menu Utama Sistem Hotel</h4>
<h6>Komponen GUI Frame ini menjadi hub utama, tempat user memilih fitur sistem.
  
  1. JFrame
  2. JLabel → Menampilkan "Selamat Datang"
  3. JButton → menu navigasi:
  4. Lihat Semua Kamar
  5. Check-In
  6. Check-Out
  7. Export Histori
  8. Rekap Mingguan</h6>
