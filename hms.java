import java.util.Scanner;
import java.util.InputMismatchException;
public class hms {
    public static void main(String[] args) throws DataException {
        String decorator= "=";
        Scanner input= new Scanner(System.in);
        try{
            while(true){
                System.out.println("\nHello! My name is Reilosh, the virtual assistant of Reilosh Tranquility Hotel!\nPress Enter to start!");
                input.nextLine();
                hotelRoom guest = new hotelRoom();
                System.out.print(decorator.repeat(20)+"\nMenu:\n[1]Booking\n[2]List of Room Types\n[3]Exit\n"+decorator.repeat(20)+"\nChoice: ");
                int menuInput= input.nextInt();
                if(menuInput==1){
                    input.nextLine();
                    while(true){
                        System.out.print("Booking:\nEnter your Full Name: ");
                        guest.setName(input.nextLine());
                        System.out.print("Enter your Phone Number: ");
                        guest.setPhoneNumber(input.nextLine());
                        System.out.print("Enter your Email Address: ");
                        guest.setEmail(input.nextLine());
                        
                        System.out.println("Name: "+guest.getName());
                        System.out.println("Phone Number: "+guest.getContactNum());
                        System.out.println("Email Address: "+guest.getEmail());
                        System.out.print("Is this information written correct?[Y/N]: ");
                        String userInput= input.nextLine().toUpperCase();
                        if(userInput.equals("Y")){
                            System.out.println("\n==Please do keep in mind 8 is the max person per room==");
                            System.out.print("How many person will be staying?\nChoice: ");
                            int pax= input.nextInt();
                            if(pax>8 || pax<1){
                                throw new DataException(errorMessage.msg[1]);
                            }else{
                            System.out.println("Finding the best room for you...\n");
                                hotelRoom.hotelRoomDisplay(pax);
                                System.out.print("Choice: ");
                                menuInput=input.nextInt();
                                while(menuInput==3){
                                    System.out.println("\n==Please do keep in mind 8 is the max person per room==");
                                    System.out.print("How many person will be staying?\nChoice: ");
                                    pax= input.nextInt();       
                                    if(pax>8 || pax<1){
                                        throw new DataException(errorMessage.msg[1]);
                                    }
                                        System.out.println("Finding the best room for you...\n");
                                    hotelRoom.hotelRoomDisplay(pax);
                                    System.out.print("Choice: ");
                                    menuInput=input.nextInt();
                                }
                                if(pax>=1 && pax<=2){
                                    if(menuInput==1){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[0]+"\nPrice: "+hotelRoom.roomsPrice[0]);
                                        guest.setRoom(hotelRoom.rooms[0], hotelRoom.roomsPrice[0]);
                                    }
                                    else if(menuInput==2){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[1]+"\nPrice: "+hotelRoom.roomsPrice[1]);
                                        guest.setRoom(hotelRoom.rooms[1], hotelRoom.roomsPrice[1]);
                                    }
                                    else{
                                        throw new DataException(errorMessage.msg[0]);
                                    }
                                }
                                if(pax>=3 && pax<=4){
                                    if(menuInput==1){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[2]+"\nPrice: "+hotelRoom.roomsPrice[2]);
                                        guest.setRoom(hotelRoom.rooms[2], hotelRoom.roomsPrice[2]);
                                    }
                                    else if(menuInput==2){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[3]+"\nPrice: "+hotelRoom.roomsPrice[3]);
                                        guest.setRoom(hotelRoom.rooms[3], hotelRoom.roomsPrice[3]);
                                    }
                                    else{
                                        throw new DataException(errorMessage.msg[0]);
                                    }
                                }
                                if(pax>=5 && pax<=8){
                                    if(menuInput==1){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[4]+"\nPrice: "+hotelRoom.roomsPrice[4]);
                                        guest.setRoom(hotelRoom.rooms[4], hotelRoom.roomsPrice[4]);
                                    }
                                    else if(menuInput==2){
                                        System.out.println("\nYou have chosen:\n"+hotelRoom.rooms[5]+"\nPrice: "+hotelRoom.roomsPrice[5]);
                                        guest.setRoom(hotelRoom.rooms[5], hotelRoom.roomsPrice[5]);
                                    }
                                    else{
                                        throw new DataException(errorMessage.msg[0]);
                                    }
                                }
                                System.out.print("\n How many days will you be staying?\nChoice: ");
                                double days=input.nextDouble();
                                if(days>30){
                                    throw new DataException(errorMessage.msg[2]);
                                }
                                guest.setDays_Stay(days);  
                                
                                System.out.println("\nMode of Payment:");
                                System.out.print("[1]Credit Card\n[2]Paymaya\n[3]Gcash\n[4]Cash on Hand\nChoice:");
                                menuInput=input.nextInt();
                                if(menuInput==1){
                                    guest.setPayment("Credit Card");
                                }else if(menuInput==2){
                                    guest.setPayment("Paymaya");
                                }else if(menuInput==3){
                                    guest.setPayment("Gcash");
                                }else if(menuInput==4){
                                    guest.setPayment("Cash on Hand");
                                }else{
                                    throw new DataException(errorMessage.msg[0]);
                                }
                                guest.display();
                                break;
                            }
                            
 
                        }
                        else if (userInput.equals("N")){
                            System.out.println("\n");
                        }else{
                            throw new DataException(errorMessage.msg[0]);
                        }
                    }   
                }
                else if(menuInput==2){
                    System.out.println(decorator.repeat(20));
                    System.out.println("\nList of Rooms available:\n");
                    for(int i=0;i<4;i++){
                        System.out.println("1."+hotelRoom.rooms[i]);
                    }
                    System.out.print(decorator.repeat(20)+"\nMenu:\n[1]Go Back\n[2]Exit\n"+decorator.repeat(20)+"\nChoice: ");
                    menuInput=input.nextInt();
                    if(menuInput==2)
                        System.exit(0);
                    
                }

                else if(menuInput==3){
                    System.exit(0);
                }else{
                    throw new DataException(errorMessage.msg[0]);
                }
            }   
        }catch(InputMismatchException e){
            System.out.println(errorMessage.msg[0]);
        }catch(DataException e){
            System.out.println(e.getMessage());
        }
    }
}
