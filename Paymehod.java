class Paymethod{
    private Payment pay;

    public Paymethod(Payment pay) 
    {
        this.pay=pay;
    }
    public void pay(){
        pay.pay();
    }   
    
}