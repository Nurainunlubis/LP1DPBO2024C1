/* Saya Nur Ainun id 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

//Import library dan file
#include <bits/stdc++.h>
#include "Dpr.cpp"

//using Standard namespace
using namespace std;

int main()
{
    //premade linked list library
    list<Dpr> llist;

    int fitur = 0;
    
    while(fitur < 5)
    {
        cout << '\n' << "     DATA NAMA ANGGOTA DPR " << '\n';


        cout << "|-------------------------------|" << endl;
        cout << "|    PILIH FITUR DIBAWAH INI    |" << '\n';
        cout << "|-------------------------------|" << endl;
        cout << "| 1. CREATE DATA                |" << '\n';
        cout << "| 2. READ DATA                  |" << '\n';
        cout << "| 3. UPDATE DATA                |" << '\n';
        cout << "| 4. DELETE DATA                |" << '\n';
        cout << "| 5. EXIT                       |" << '\n';
        cout << "|-------------------------------|\n" << endl;

        cout << "\nMASUKAN PILIHAN FITUR" << endl;
        cin >> fitur; // meminta inputan pilihan fitur 

        // Create data 
        if(fitur == 1)
        {
            //attribute
            int n = 0;
            int find = 0;
            string id;
            string name;
            string bidang;
            string partai;

            //Menampung jumlah data yang akan ditambahkan
            cout << "\nJumlah data yang akan dimasukkan: ";
            cin >> n; // Attribute input banyak jumlah data 
            
            //Menambahkan Data List sebanyak n
            for(int i = 0; i < n; i++)
            {
                // Temporary Object
                Dpr temp; 
                // Attribute input
                cout << "ID : ";
                cin >> id;
                cout << "NAMA : ";
                cin >> name; 
                cout << "BIDANG : ";
                cin >> bidang;
                cout << "PARTAI : ";
                cin >> partai;

                //Mengecek id
                for(list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if(id == it->get_id())
                    {
                        find = 1;
                    }
                }

                //kondisi jika data gagal ditambah 
                if(find == 1)
                {
                    cout << "ID Sudah Ada, data gagal ditambahkan!" << '\n';
                }
                else 
                {
                    // Assign input to the temporary object
                    temp.set_id(id);
                    temp.set_name(name);
                    temp.set_bidang(bidang);
                    temp.set_partai(partai);
                    llist.push_back(temp);
                    cout<< "\nCreate data berhasil!" << '\n';
                }
            }
        }

        //Read Data 
        else if(fitur == 2)
        {
            cout<< "DAFTAR NAMA ANGGOTA DPR " << '\n';
            int i = 0;
            //Menampilkan data list
            for(list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                cout << (i+1) << ". " << it->get_name() << '\n';
                cout << "   ID            : " << it->get_id() << '\n';
                cout << "   BIDANG        : " << it->get_bidang() << '\n';
                cout << "   PARTAI        : " << it->get_partai() << '\n';
                i++;
            }
        }
        // Update Data
        else if(fitur == 3)
        {
            string new_id;
            int find = 0;
            string id;
            string new_name;
            string new_bidang;
            string new_partai;

            cout<< "Masukkan ID yang akan di Update" << '\n';
            cin  >> new_id;

            //Update list
            for(list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                if(new_id == it->get_id())
                {
                    //Menampung data baru lalu meng-set list yang akan diupdate
                    cout << "NAMA : ";
                    cin >> new_name;
                    cout << "BIDANG : ";
                    cin >> new_bidang;
                    cout << "PARTAI : ";
                    cin >> new_partai;
                    it->set_name(new_name);
                    it->set_bidang(new_bidang);
                    it->set_partai(new_partai);
                    find = 1;
                    cout<< "Update data berhasil!!" << '\n';
                } 
            }
            if(find == 0)
            {
                cout<< "Gagal, data yang di masukkan tidak ada!" << '\n';
            }
        }
        //Delete Data
        else if(fitur == 4)
        {
            string delete_id;
            int find = 0;
            
            //Menampung data id yang akan di delete
            cout<< "Masukkan ID yang akan di-delete" << '\n';
            cin  >> delete_id;;

            //Delete List
            for(list<Dpr>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                //menghapus data sesuai id yang di cari
                if(delete_id == it->get_id())
                {
                    //Delete list
                    llist.erase(it);
                    find = 1;
                    it = llist.end();
                    cout<< "Delete data berhasil!" << '\n';
                } 
            }
            //kondisi jika id tidak ada 
            if(find == 0)
            {
                cout<< "Gagal, data yang di masukkan tidak ada!" << '\n';
            }
        }
    }

    return 0;
}