package com.example.khaibaobien

class SinhVien {
    private var HoTen:String
    private var DiaChi:String
    private var NamSinh:Int
    constructor(name:String, address:String, Year:Int)
    {
        HoTen = name;
        DiaChi = address;
        NamSinh = Year;
    }
    fun setYear(year:Int) {
        NamSinh = year;
    }
    fun getYear():Int{
        return NamSinh;
    }



}