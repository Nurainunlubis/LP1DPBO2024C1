/*Saya Nur Ainun 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. 
*/

public class Dpr {
    // private attribute
    private String id;
    private String name;
    private String bidang;
    private String partai;

    //constructor. Take note that it doesn't have any return type.
    public Dpr()
    {
        this.id = "";
        this.name = "";
        this.bidang = "";
        this.partai = "";
    }

    // another constructor whit parameter.
    public Dpr(String id, String name, String bidang, String partai) 
    {
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;
    }

    //Getter and Setter
    public String getId()
    {
        return this.id;
    }

    //set id
    public void setId(String id)
    {
        this.id = id;
    }

    // get name
    public String getName()
    {
        return this.name ;
    }

    // set name
    public void setName(String name)
    {
        this.name = name;
    }

    //get bidang
    public String getBidang()
    {
        return this.bidang;
    }

    public void setBidang(String bidang)
    {
        this.bidang = bidang;
    }

    //get partai
    public String getPartai()
    {
        return this.partai;
    }

    //set partai
    public void setPartai(String Partai)
    {
        this.partai = Partai;
    }
}