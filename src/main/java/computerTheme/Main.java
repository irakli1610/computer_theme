package computerTheme;

import java.util.function.BiConsumer;

import Interfaces.IEmail;
import enums.Continents;
import enums.DaysOfTheWeek;
import enums.Months;
import lambda.IAdd;
import lambda.IMove;
import lambda.IPrint;
import lambda.IAction;

public class Main {

	public static void main(String[] args) {
		
		//objects for computer, PC and Laptop class
		CPU intelCpu = new CPU("intel", 2.8 ,16);
		FAN spinnerFan = new FAN("spinner", 49);
		GPU prodGPU = new GPU("GPU production",16,true);
		PowerSupply powSupply = new PowerSupply("power", 120);
		HeadPhone headPhoneez = new HeadPhone("headphhoneeez", 32.6,false,17);
		Keyboard kkeybsKeyboard = new Keyboard("keybs",65,false,false);
		Monitor monzzMonitor = new Monitor("1920X1080", 49 ,"monzzz");
		MotherBoard motherBoard = new MotherBoard("motheeeer","AR14CH");
		Mouse mouseMousee = new Mouse("mouseee", 97,false);
		RAM spkRam = new RAM("spk",16,3.7);
		Speaker speakerSpeaksint = new Speaker(80.8, "speakersint",34);
		TouchPad touch_2 = new TouchPad(1.6, 2);
		Memory memoryMems = new Memory("mems","SSD");
		User compUser = new User(null, "12623");
		User receiver = new User ("Beglari", "bego1248");
		
		//constructing pc and laptop
		PC myPC = new PC(intelCpu,spinnerFan,prodGPU,kkeybsKeyboard,memoryMems,monzzMonitor,motherBoard,powSupply,spkRam,headPhoneez,mouseMousee,compUser);
		
       Laptop firstLaptopInMyLife = new Laptop(intelCpu,spinnerFan,prodGPU,kkeybsKeyboard,memoryMems,monzzMonitor,motherBoard,powSupply,spkRam,touch_2,speakerSpeaksint,compUser);
      
       //firstLaptopInMyLife.emailSomeone("here is your message", receiver);
       
       
       // displaying toString method------------------------
       
      // System.out.println(myPC);
       //System.out.println(firstLaptopInMyLife);  
       
       //polymorphism with interfaces----------------------
       
       //IFold intLaptop = new Laptop();
       	//		intLaptop.fold();
       //ITurnonGameMode gamingpc = new PC();
       	//		gamingpc.turnonGameMode();
       //IReboot examLaptop = new Laptop();
       	//		examLaptop.reboot();
       //IEmail workLaptop = new Laptop();
       	//		((Computer) workLaptop).setUser(compUser);
       		//	workLaptop.emailSomeone("hi there", receiver);
       	
       			
       	//polymorphism with abstract classes----------------
       	Computer samsungPC= new PC();
       	Laptop lenovoLap = new Laptop();
       	

       //	firstLaptopInMyLife.reboot(6, 15 );

       	//firstLaptopInMyLife.isOpen =true;
       //	myPC.emailSomeone("here", receiver);
       	//myPC.powerComputer();
       	
       	DaysOfTheWeek day1 = DaysOfTheWeek.MONDAY;
       	System.out.println(day1);
       	
       	System.out.println(Continents.AFRICA.getArea());
       	System.out.println(Months.DECEMBER);
       	
       	//--------------------------
       	IMove catMove = () -> System.out.println("cat is moving");
		catMove.move();
		
		
		double firstNumber = 5.47;
		double secondNumber = 3.73; 

		
		IAdd adder =(x,y) -> x +y;
       	System.out.println(adder.add(firstNumber,secondNumber));
       	
       	BiConsumer<String,String > message = (K ,V) -> System.out.println(K+V);
       	message.accept("random ", "test");
       	
       	IPrint printer =  () -> System.out.println("happyy");
       	printer.print();
       	
       	//----------------------------------------------------
       	IAction planetPrint = ()-> System.out.println("MARS");
       	planetPrint.action();
       	
    	IAction animalName = ()-> System.out.println("bear");
       	animalName.action();
       	
    	IAction printWhatever = ()-> System.out.println("we can use one interface and define different implementation using lambda");
    	printWhatever.action();
       	//-------------------
       	
	}
}

