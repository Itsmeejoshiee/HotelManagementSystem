import java.text.DecimalFormat;

public class hotelRoom extends booking{
    DecimalFormat df= new DecimalFormat("###,###.##");
    final static String[] rooms={"Standard Delight Room","Premium Delight Room","Standard Family Room","Premium Family Room","Executive Suite","Presidential Suite"};
    //                               0                          1                    2                        3                 4                  5
    final static double[] roomsPrice={5000,7500,10000,12500,20000,25000};
    //                              0     1    2     3     4     5
    public double totalPrice(double days_stay){
        totalPrice=roomPrice*days_stay;
        return totalPrice;
    }
    public static void hotelRoomDisplay(int pax){
        if(pax>=1 && pax<=2){
            System.out.println("\n[1]Standard Delight Room\nDescription:\nA standard room that houses one to two persons.\nThis room includes a comfortable bed, a TV, and a mini fridge\n");
            System.out.println("\n[2]Premium Delight Room\nDescription:\nA premium room that houses one to two persons.\nThis room has a stylish decor and includes a smart TV, a luxury bed, and a mini bar.\n");
            System.out.println("[3]Go Back");
        }else if(pax>=2 && pax<=4){
            System.out.println("\n[1]Standard Family Room\nDescription:\nA standard room that houses three to four persons.\nThis room includes a bunk bed, a sofa bed, a mini fridge, and a microwave.\n");
            System.out.println("\n[2]Premium Family Room\nDescription:\nA premium room that house three to four persons.\nThis room includes a king-sized bed, a sofa bed, and a kitchenette\n");
            System.out.println("[3]Go Back");
        }else if(pax>=4 && pax<=8){
            System.out.println("\n[1]Executive Suite\nDescription:\nA spacious and elegant suite with a separate living room, a work desk, and a king-sized bed.This suite can house five to eight persons.\nThe suite features a 55-inch smart TV, a Nespresso machine, and a minibar. The bathroom has a rain shower, a bathtub, and a bidet.\nThe suite also offers a stunning view of the city skyline\n");
            System.out.println("\n[2]Presidential Suite\nDescription:\nA luxurious and exclusive suite with a large living room, a dining area, and a master bedroom.This suite can house for five to eight persons.\nThe suite features a 65-inch smart TV, a Bose sound system, and a wine cooler. The bathroom has a jacuzzi, a sauna, and a steam room.\nThe suite also has a private balcony with a hot tub and a panoramic view of the city.\n");
            System.out.println("[3]Go Back");
        }else{
            System.out.println("The maximum a hotel room can accomodate is eight person");
        }
    }
    public void display(){
        super.display();    
        System.out.println("Type of Room: "+getRoom());
        System.out.println("Days of Stay: "+getDays_Stay());
        System.out.println("Mode of Payment: "+getPayment());
        System.out.println("Total Price: P"+df.format(totalPrice(days_stay))); 
    }


}
