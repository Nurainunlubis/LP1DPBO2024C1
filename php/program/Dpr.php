<?php
/* Saya Nur Ainun Nim 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Dpr{
    //Private attributes 
    private $id = '';
    private $nama = '';
    private $bidang = '';
    private $partai = '';
    private $foto = '';

    //Public methods
    /*Constructors*/
    //Methods  set attributes dari class Dpr dengan parameter
    public function __construct($id = '', $nama = '', $bidang = '', $partai = '', $foto = '')
    {
        //Set attributes pada class Dpr sesuai isi parameter
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->foto = $foto;
    }

    //setter id 
    public function setId($id){
        $this->id = $id;
    }
    //getter id
    public function getId(){
        return $this->id;
    }

    //setter nama
    public function setNama($nama){
        $this->nama = $nama;
    }
    //geter nama
    public function getNama(){
        return $this->nama;
    }

    //setter bidang 
    public function setbidang($bidang){
        $this->bidang = $bidang;
    }
    //getter bidang
    public function getbidang(){
        return $this->bidang;
    }

    //setter partai 
    public function setpartai($partai){
        $this->partai = $partai;
    }
    //getter partai
    public function getpartai(){
        return $this->partai;
    }

    //setter  foto 
    public function setFoto($foto){
        $this->foto = $foto;
    }
    //getter foto
    public function getFoto(){
        return $this->foto;
    }
}

?>