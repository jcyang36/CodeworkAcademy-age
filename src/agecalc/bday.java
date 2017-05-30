package agecalc;
import java.time.LocalDateTime;
import java.util.Scanner;
public class bday{
    public static void main(String[] args){
        int bday=1;
        int bMonth=1;
        int bYear=0;
        LocalDateTime now=LocalDateTime.now();
        int currentDay=now.getDayOfMonth();
        int currentMonth=now.getMonthValue();
        int currentYear=now.getYear();
        int age=0;
        int ageTurning=0;
        String repeat="N";
        boolean flag=false;
        Scanner receiveInput=new Scanner(System.in);
        do{ 
            

            do{
                if (bYear!=(int)bYear){
                    flag=true;
                }

                 do{ 
                    if(bYear>currentYear){
                        flag=true;
                    }
                    if (flag==true){
                        System.out.println("Invalid value.  Year of birth: ");
                         receiveInput =new Scanner(System.in);
                        bYear = receiveInput.nextInt();
                        
                    }
                    else {System.out.println("Year of birth: ");
                     receiveInput = new Scanner(System.in);
                    bYear = receiveInput.nextInt();
                    
                    }
                }while(bYear>currentYear);
            }while(bYear!=(int)bYear  );
            
            flag=false;
            
            do{
                if(bMonth!=(int)bMonth){
                    flag=true;
                }
                do{
                    if (bMonth > 12 || bMonth < 1){
                        flag=true;
                    }
                    if (flag==true){
                        System.out.println("Invalid value.  Month of birth: ");
                        receiveInput =new Scanner(System.in);
                        bMonth = receiveInput.nextInt();
                        
                    }
                    else{ 
                        System.out.println("Month of birth: ");
                        receiveInput =new Scanner(System.in);
                        bMonth = receiveInput.nextInt();
                        
                        
                    } //end else
                    
                }while( bMonth > 12 || bMonth < 1);
            }while(bMonth!=(int)bMonth);
            flag=false;
            
            do{
            	if(bday!=(int)bday){
            	flag=true;
            	}
            	do {
            		if(bday>31 ||bday<1){
            			flag=true;
            			}
            		
            			if(bMonth==1){
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if (bMonth==2){
            				if(bday<1 ||bday>28){
            	            	flag=true;
            	            	} 
            			}else if (bMonth==3){
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if (bMonth ==4){
            				if(bday<1 ||bday>30){
            	            	flag=true;
            	            	} 
            			}else if (bMonth ==5) {
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if(bMonth ==6) {
            				if(bday<1 ||bday>30){
            	            	flag=true;
            	            	} 
            			}else if (bMonth ==7) {
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if (bMonth==8) {
                      		if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if (bMonth==9) {
            				if(bday<1 ||bday>30){
            	            	flag=true;
            	            	} 
            			}else if (bMonth==10) {
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	} 
            			}else if (bMonth ==11) {
            				if(bday<1 ||bday>30){
            	            	flag=true;
            	            	} 
            			}else if (bMonth ==12) {
            				if(bday<1 ||bday>31){
            	            	flag=true;
            	            	}
            			} 
            			 
            				if (flag==true){
                                 System.out.println("Invalid value.  Day of birth: ");
                                 receiveInput =new Scanner(System.in);
                                 bday = receiveInput.nextInt();
                                 
                             }
                             else{ 
                                 System.out.println("Day of birth: ");
                                 receiveInput =new Scanner(System.in);
                                 bday = receiveInput.nextInt();
                                 
                             }         
                             			 	
            	}while(bday>31 || bday<1);//end bday check for range
            }while(bday!=(int)bday); //end bday check for integer
            flag=false;
             ageTurning=currentYear-bYear;
            if (bMonth>currentMonth){
             	age=ageTurning-1;}
             else if (bMonth <currentMonth){
             	age=ageTurning;}
             else{
             	if (bday>currentDay){
             		age=ageTurning-1;
             	}
             	else{ age=ageTurning;
             	}
             }
            System.out.println("Your age is: "+age);
            System.out.println("Would you like to enter details for another client? Enter Y or N. ");
            receiveInput = new Scanner(System.in);
            repeat=receiveInput.next();
            if (repeat.equalsIgnoreCase("N")){
            	break;
            }
            flag=false;
        }while(repeat.equalsIgnoreCase("Y"));
        
        System.out.print("Thank you for using the age calculator!");
       
//} 
}
}