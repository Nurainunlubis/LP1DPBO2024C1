 <?php
/* Saya Nur Ainun Nim 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// Import file
require ('Dpr.php');

// List class Dpr
$data_dpr = array();

// Create Data List
$anggota1 = new Dpr('2202046', 'Nur Ainun', 'pertahanan', 'abc', 'foto\FOTO BUTA.jpg');
array_push($data_dpr, $anggota1);
$anggota2 = new Dpr('2202035', 'Iqbal Ramadhan ', 'pengawasan', 'bcd', 'foto\iqbal.jpg');
array_push($data_dpr, $anggota2);
$anggota3 = new Dpr('2202013', 'Refal hadi', 'keuangan', 'dsc', 'foto\refal.jpg');
array_push($data_dpr, $anggota3);

// Function to display the table
function displayTable($data, $count) {
    echo "<table border='3'>";
    echo "<tr>
        <th> ID </th>
        <th> NAMA </th>
        <th> BIDANG  </th>
        <th> PARTAI </th>
        <th> FOTO </th>
        </tr>";

    for ($i = 0; $i < $count; $i++) {
        echo "<tr><td>";
        echo $data[$i]->getId();
        echo "</td><td>";
        echo $data[$i]->getNama();
        echo "</td><td>";
        echo $data[$i]->getbidang();
        echo "</td><td>";
        echo $data[$i]->getpartai();
        echo "</td><td>";
        echo "<img src='" . $data[$i]->getFoto(). "' style='width: 200px'>";
        echo "</td></tr>";
    }

    echo "</table>";
    echo '<br><hr><br>';
}

// Read Awal
echo "<h2>DAFTAR NAMA ANGGOTA DPR!</h2>";
displayTable($data_dpr, 3);

// Update Data
$data_dpr[1]->setNama("shakila");
$data_dpr[1]->setbidang("pertahanan");
$data_dpr[1]->setpartai("apa aja");

// Read list setelah di update
echo "Data Anggota setelah Update" . '<br><br>';
echo "<h2>DAFTAR NAMA ANGGOTA DPR!</h2>";
displayTable($data_dpr, 3);

// Delete Data
array_splice($data_dpr, 1, 1);

// Read list setelah di delete
echo "<h2>DAFTAR NAMA ANGGOTA DPR!</h2>";
displayTable($data_dpr, 2);
?>
