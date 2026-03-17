public abstract class Libraryitem{
    private String ttitle;
    private String aauthor;
    private int publicyear;

    public Libraryitem(String tt, String aa, int py){
        this.ttitle = tt;
        this.aauthor = aa;
        this.publicyear = py;
    }

    public getAAuthor(){
        return aauthor;
    }

    public getTTitle(){
        return ttitle;
    }

    public getPublicyear(){
        return publicyear;
    }

    public void setAAuthor(String addA){
        this.aauthor = addA;
    }

    public void setTTitle(String addT){
        this.ttitle = addT;
    }

    public void setPublicyear(int addY){
        this.publicyear = addY;
    }

    
}