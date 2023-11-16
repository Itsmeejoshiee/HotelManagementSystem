import java.time.*;

public class booking{
    protected String name,contactNum,email,room,payment;
    protected int pax;
    protected double days_stay,roomPrice,totalPrice;
   

    


    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public String getContactNum(){
        return contactNum;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.contactNum=phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public int getPax(){
        return pax;
    }

    public void setPax(int pax){
        this.pax=pax;
    }

    public void setRoom(String room,double roomPrice){
        this.room=room;
        this.roomPrice=roomPrice;
    }
    public String getRoom(){
        return room;
    }
    
    public double getRoomPrice(){
        return roomPrice;
    }
    
    public void setDays_Stay(double days_stay){
        this.days_stay=days_stay;
    }
    public double getDays_Stay(){
        return days_stay;
    }

    public void setPayment(String payment){
        this.payment=payment;
    }
    public String getPayment(){
        return payment;
    }



    public void display(){
        System.out.println("\n--Booking Receipt--");
        System.out.println("Name: "+getName());
        System.out.println("Phone Number: "+getContactNum());
        System.out.println("Email Address: "+getEmail());
        System.out.println("Contact Number: "+getContactNum());

    }

}
