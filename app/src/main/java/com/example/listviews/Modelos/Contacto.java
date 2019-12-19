package com.example.listviews.Modelos;

import java.util.ArrayList;




public class Contacto {
    public String phone;
    public String nickname;
    public String image;

    public Contacto(String _phone, String _nickname, String _image) {
        this.phone = _phone;
        this.nickname = _nickname;
    }
    public String getSmallImagen(){
        return this.image;
    }


    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("981999923", "Alejandro", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-3.jpg"));
        collection.add(new Contacto("9859913923", "Prudencio", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"));
        collection.add(new Contacto("981914213", "Yeltsin", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-7.jpg"));

        collection.add(new Contacto("981999923", "Alvarez", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-3.jpg"));
        collection.add(new Contacto("9859913923", "Tabraj", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"));
        collection.add(new Contacto("981914213", "Jean", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg"));

        return collection;
    }
}
