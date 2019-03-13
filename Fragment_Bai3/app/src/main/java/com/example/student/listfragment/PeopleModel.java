package com.example.student.listfragment;

import java.util.ArrayList;

public class PeopleModel {

    public static ArrayList<People> getListPeopleDemo(){

        ArrayList<People> arrayList = new ArrayList<People>();
        arrayList.add(new People("Nguyễn Trọng Hiền","1994","Hà Nội","nguyentronghien@gmail.com"));
        arrayList.add(new People("Nguyễn Trọng Khôi","1987","TP. Hồ Chí Minh","nguyentrongkhoi@gmail.com"));
        arrayList.add(new People("Nguyễn Tấn Sỹ","1985","TP. Hồ Chí Minh","nguyentansy@gmail.com"));
        arrayList.add(new People("Bùi Thị Mãi","1976","Đà Nẵng","buithimai@gmail.com"));
        arrayList.add(new People("Trần Thị Tuyết Mai","1976","Nha Trang","buithimai@gmail.com"));
        arrayList.add(new People("Trần Thị Ánh Tuyết","1976","Đà Nẵng","buithimai@gmail.com"));

        return arrayList;
    }
}
