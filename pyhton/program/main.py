#Saya Nur Ainun 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. 

from Dpr import Dpr

# output awal
print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
print("|  Selamat Datang di Aplikasi Data Anggota DPR   |")
print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")

print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
print("|                PILIHAN MENU                    |")
print("| (1) Tambah Anggota DPR                         |")
print("| (2) Edit Anggota DPR                           |")
print("| (3) Hapus Anggota DPR                          |")
print("| (4) Tampilkan Data Anggota DPR                 |")
print("| (5) Keluar                                     |")
print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
print("")
print("Tekan angka yang di pilih 1 sampai 5 : ", end='')

data_anggota_dpr = []
tekan = int(input())

while 1 <= tekan <= 5:
    if tekan == 1:
        # Tambah Anggota DPR
        print("Masukkan ID Anggota     : ", end="")
        id_anggota = str(input())
        print("Masukkan Nama Anggota   : ", end="")
        nama_anggota = str(input())
        print("Masukkan Nama Bidang    : ", end="")
        bidang_anggota = str(input())
        print("Masukkan Nama Partai    : ", end="")
        partai_anggota = str(input())

        data_anggota_dpr.append(Dpr(id_anggota, nama_anggota, bidang_anggota, partai_anggota))
        print(f"Berhasil! Anggota DPR {nama_anggota} telah ditambahkan.")

    elif tekan == 2:
        # Edit Anggota DPR
        print("Masukkan ID Anggota yang ingin di edit : ", end='')
        id_anggota_edit = str(input())

        for anggota_dpr in data_anggota_dpr:
            if id_anggota_edit == anggota_dpr.get_id():
                print(f"Selamat datang, {anggota_dpr.get_name()}!")
                print("Apa yang ingin Anda ubah ?")
                print("1. Nama")
                print("2. Bidang")
                print("3. Partai")
                print("0. Batal")

                pilihan_ubah = int(input())
                if pilihan_ubah == 1:
                    print("Masukkan Nama Baru     : ", end="")
                    nama_anggota_edit = str(input())
                    anggota_dpr.set_name(nama_anggota_edit)
                    print(f"Nama Anggota DPR berhasil diubah menjadi {nama_anggota_edit}.")
                elif pilihan_ubah == 2:
                    print("Masukkan Bidang Baru   : ", end="")
                    bidang_anggota_edit = str(input())
                    anggota_dpr.set_bidang(bidang_anggota_edit)
                    print(f"Bidang Anggota DPR berhasil diubah menjadi {bidang_anggota_edit}.")
                elif pilihan_ubah == 3:
                    print("Masukkan Partai Baru   : ", end="")
                    partai_anggota_edit = str(input())
                    anggota_dpr.set_partai(partai_anggota_edit)
                    print(f"Partai Anggota DPR berhasil diubah menjadi {partai_anggota_edit}.")
                elif pilihan_ubah == 0:
                    print("Perubahan dibatalkan.")
                else:
                    print("Pilihan tidak valid.")
                
                break

        else:
            # jika id tidak ada 
            print(f"ID Anggota {id_anggota_edit} tidak ditemukan.")

    elif tekan == 3:
        # Hapus Anggota DPR
        print("Masukkan ID Anggota yang ingin dihapus : ", end='')
        id_anggota_hapus = str(input())

        for anggota_dpr in data_anggota_dpr:
            if id_anggota_hapus == anggota_dpr.get_id():
                data_anggota_dpr.remove(anggota_dpr)
                print(f"Anggota DPR dengan ID {id_anggota_hapus} berhasil dihapus.")
                break

        else:
             # jika id tidak ada 
            print(f"ID Anggota {id_anggota_hapus} tidak ditemukan.")

    elif tekan == 4:
        # Tampilkan Data Anggota DPR
        if len(data_anggota_dpr) == 0:
            print("Belum ada Anggota DPR terdaftar.")
        else:
            # Tentukan lebar kolom sesuai dengan panjang maksimum data
            max_id_length = max(len(anggota.get_id()) for anggota in data_anggota_dpr)
            max_nama_length = max(len(anggota.get_name()) for anggota in data_anggota_dpr)
            max_bidang_length = max(len(anggota.get_bidang()) for anggota in data_anggota_dpr)
            max_partai_length = max(len(anggota.get_partai()) for anggota in data_anggota_dpr)

            # Menentukan lebar garis pembatas sesuai dengan panjang maksimum data
            line_length = sum([max_id_length, max_nama_length, max_bidang_length, max_partai_length]) + 20

            print("Daftar Anggota DPR:")
            print("| {:<{id_length}} | {:<{nama_length}} | {:<{bidang_length}} | {:<{partai_length}}  |".format(
                "ID", "Nama", "Bidang", "Partai",
                id_length=max_id_length + 2,
                nama_length=max_nama_length + 2,
                bidang_length=max_bidang_length + 2,
                partai_length=max_partai_length + 2
            ))
            print("|{:-^{line_length}}|".format("", line_length=line_length))  # Garis pembatas

            for anggota_dpr in data_anggota_dpr:
                print("| {:<{id_length}} | {:<{nama_length}} | {:<{bidang_length}} | {:<{partai_length}}  |".format(
                    anggota_dpr.get_id(), anggota_dpr.get_name(), anggota_dpr.get_bidang(), anggota_dpr.get_partai(),
                    id_length=max_id_length + 2,
                    nama_length=max_nama_length + 2,
                    bidang_length=max_bidang_length + 2,
                    partai_length=max_partai_length + 2
                ))
                print("|{:-^{line_length}}|".format("", line_length=line_length))  # Garis pembatas

    elif tekan == 5:
        # Keluar
        print("\nTerima kasih telah menggunakan aplikasi Data Anggota DPR.")
        break
    
    # Memulai ulang program
    print("")
    print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
    print("|                PILIHAN MENU                    |")
    print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
    print("| (1) Tambah Anggota DPR                         |")
    print("| (2) Edit Anggota DPR                           |")
    print("| (3) Hapus Anggota DPR                          |")
    print("| (4) Tampilkan Data Anggota DPR                 |")
    print("| (5) Keluar                                     |")
    print("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|")
    print("")
    print("Tekan angka untuk melanjutkan program \natau tekan 5 untuk mengakhiri program: ", end='')
    tekan = int(input())
