#Saya Nur Ainun 2202046 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. 

#class declaration.
class Dpr:

    __id = ""
    __name = ""
    __bidang = ""
    __partai = ""

    #constructor
    def __init__(self, id = " ", name = "", bidang = "", partai = ""):
        self.__id = id
        self.__name = name
        self.__bidang = bidang
        self.__partai = partai

    # Getter & setter
    # Get id
    def get_id(self):
        return self.__id
    # Set id
    def set_id(self, id):
        self.__id = id

    # Get name
    def get_name(self):
        return self.__name
    # Set name
    def set_name(self, name):
        self.__name = name
    
    # get bidang
    def get_bidang(self):
        return self.__bidang
    # Set bidang
    def set_bidang(self, bidang):
        self.__bidang = bidang
    
    # Get partai
    def get_partai(self):
        return self.__partai
    # Set Partai
    def set_partai(self, partai):
        self.__partai = partai
