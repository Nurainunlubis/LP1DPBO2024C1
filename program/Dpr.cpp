/* Saya Nur Ainun id 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// import liblary
#include <iostream>
#include <string>

//using standard namespace
using namespace std;

//class declaration. for C++ the first letter doesn't have to be
//capitalized, but it's better so we can distinguish it wish the other types.

class Dpr
{
    //Privat attributs
    private:
        string id;
        string name;
        string bidang;
        string partai;

    //public methods
    public:

    /*Constructors*/

    //constructor. Take note that it doesn't have any return type
        Dpr()
        {
            //set name and partai to default value.
            this->id = "";
            this->name = "";
            this->bidang = "";
            this->partai = "";
        }

        //Another constructor with parameter. This will be called if the
        //object is instanced with the given parameter
        Dpr(string id, string name, string bidang ,string partai)
        {
            //"this" object atributes will be set with the given parameter atrib
            this->id = id;
            this->name = name;
            this->bidang = bidang;
            this->partai = partai;
        }

    //Getter and setter

    //get id
    string get_id()
    {
        return id;
    }

    //set id
    void set_id(string id)
    {
        this->id = id;
    }

    //get name
    string get_name()
    {
        return this->name;
    }

    //set name
    void set_name(string name)
    {
        this->name = name;
    }

    //get bidang
    string get_bidang()
    {
        return this->bidang;
    }

    //set bidang
    void set_bidang(string bidang)
    {
        this->bidang = bidang;
    }
    //get partai
    string get_partai()
    {
        return this->partai;
    }

    //set partai
    void set_partai(string partai)
    {
        this->partai = partai;
    }

    /*public methods, or in this case if you prefer, "behaviors"*/

    //Destructors
    //Default destructor. leave it blank for now
    ~Dpr()
    {

    }
};