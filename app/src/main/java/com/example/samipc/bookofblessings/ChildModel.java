package com.example.samipc.bookofblessings;

public class ChildModel {

    private String Title;
    private String Category;
    private String Blessing_Book;
    private int Pag;
    private String Blessing_Name1;
    private String Blessing_Name2;
    private String Blessing_Name3;
    private String Blessing_Name4;
    private String Blessing_Name5;

//    private int Thumbnail;


//    String  description;
//    Integer image;

//    public ChildModel(String family, String s, String nobook, int pag, int img_familyen){

//    }

//    public ChildModel(String title, String category, String blessing_Book, int pag,int thumbnail) {
    public ChildModel(String title, String category, String blessing_Book, int pag, String blessing_Name1, String blessing_Name2,
                      String blessing_Name3, String blessing_Name4, String blessing_Name5) {
        this.Title = title;
        this.Category = category;
        this.Blessing_Book = blessing_Book;
        this.Pag = pag;
        this.Blessing_Name1 = blessing_Name1;
        this.Blessing_Name2 = blessing_Name2;
        this.Blessing_Name3 = blessing_Name3;
        this.Blessing_Name4 = blessing_Name4;
        this.Blessing_Name5 = blessing_Name5;

//        this.Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getBlessing_Book() {
        return Blessing_Book;
    }

    public int getPag() {
        return Pag;
    }

    public String getBlessing_Name1(){
        return Blessing_Name1;
    }

    public String getBlessing_Name2(){
        return Blessing_Name2;
    }

    public String getBlessing_Name3(){
        return Blessing_Name3;
    }

    public String getBlessing_Name4(){
        return Blessing_Name4;
    }

    public String getBlessing_Name5(){
        return Blessing_Name5;
    }



//    public int getThumbnail() {
//        return Thumbnail;
//    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setBlessing_Book(String blessing_book) {
        Blessing_Book = blessing_book;
    }

    public void setPag(int pag) {
        Pag = pag;
    }

    public void setBlessing_Name1(String blessing_Name1) {
        Blessing_Name1 = blessing_Name1;
    }

    public void setBlessing_Name2(String blessing_Name2) {
        Blessing_Name2 = blessing_Name2;
    }

    public void setBlessing_Name3(String blessing_Name3) {
        Blessing_Name3 = blessing_Name3;
    }

    public void setBlessing_Name4(String blessing_Name4) {
        Blessing_Name4 = blessing_Name4;
    }

    public void setBlessing_Name5(String blessing_Name5) {
        Blessing_Name5 = blessing_Name5;
    }

//    public void setThumbnail(int thumbnail) {
//        Thumbnail = thumbnail;
//    }
}

