package com.android.topic.javaprograms;

class JavaInheritance {
    public static void main(String[] args) {
        CC aa = new CC();
        aa.show();
    }
}

class AA {

    static String Aaa = "this is string AA";

    void show(){
        System.out.println("AA : Show");
    }
}

class BB extends AA {
    static String Aaa = "this is string BB";
    void show(){
        System.out.println("BB : Show");
    }
}

class CC extends BB {
    static  String Aaa = "this is string CC";
    void show(){
        System.out.println("CC : Show");
    }
}