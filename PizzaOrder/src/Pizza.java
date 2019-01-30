public class Pizza {
    private String Base ;
    private String Topping;

    public Pizza(String base, String topping)
    {
        this.Base = base;
        this.Topping = topping;
    }

    public void setBase(String base){
        Base = base;
    }

    public String getBase()
    {
        return Base;
    }

    public void setTopping(String topping)
    {
        Topping = topping;
    }

    public String getTopping()
    {
        return Topping;
    }
}
