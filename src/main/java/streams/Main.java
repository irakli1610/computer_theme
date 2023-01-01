package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

		public final static Logger LOGGER=LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		
		List <Person> sampleList = new ArrayList<Person>();
		
		
		Person Shio = new Person("Shio", Gender.MALE ,26);
		Person Irakli = new Person ("Irakli", Gender.MALE,22);
		Person Lela = new Person ("Lela", Gender.FEMALE,24);
		
		sampleList.add(Lela);
		sampleList.add(Irakli);
		sampleList.add(Shio);
		
		
		sampleList.stream().forEach(p -> LOGGER.info(p.getName()));
		
		//using filter------------------------------------------------------------
		sampleList.stream()
		.filter(p-> p.getGender() == Gender.MALE).forEach(p-> LOGGER.info(p.getName()));
		
		
		sampleList.stream().filter(p-> p.getAge()>23).forEach(p-> LOGGER.info(p.getAge()));

		
		// using filter and map together---------------------------------------
		List <String> upperList=sampleList.stream().filter(ag->ag.getAge()<26)
				.map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
		LOGGER.info(upperList);
		
		
		//using map---------------------------------------------------------
		List<Integer> numbers = Arrays.asList(5,8,9,3,7,5);
		
		List<Integer> target=numbers.stream().map(number->number*3).collect(Collectors.toList());
		LOGGER.info(target);
		
		
		// using flatMap and filter----------------------------------
		List<Integer> list1= Arrays.asList(1,2,3);
		List<Integer> list2= Arrays.asList(4,5,7);
		List<Integer> list3= Arrays.asList(1,3,9);
		List<Integer> list4= Arrays.asList(2,2,8);
		
		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3,list4);
		
		List<Integer> results = finalList.stream().flatMap(ls->ls.stream()).filter(e->e>3).collect(Collectors.toList());
		
		LOGGER.info(results);

		//using distinct----------------------
		List<Integer> nums=Arrays.asList(1,8,6,4,9,2,7,1,6,4,8,2,3,9,1,3,4,7,6,4,2,3,9,4,1,2,3,6,4,8,9,6,5,7,1);
		List<Integer> finalNums=nums.stream().distinct().collect(Collectors.toList());
		LOGGER.info("Distinct numbers in \"nums\" list are: "+finalNums);
		

		//-----------------count----------------
		long numberOfNums=nums.stream().distinct().count();
		LOGGER.info("number of distinct elements in list is: "+numberOfNums);
		
		//-----------limit---------------
		List<Integer>fourInt=nums.stream().limit(4).collect(Collectors.toList());
		LOGGER.info("Limited objects inside list are: "+fourInt);
		
		//--------min--------------
		Optional <Integer> min = nums.stream().min((val1,val2)->{return val1.compareTo(val2);});
		LOGGER.info("min value in \"nums\" is: "+min.get());
		
		//--------max--------------
		Optional <Integer> max = nums.stream().max((val1,val2)->{return val1.compareTo(val2);});
		LOGGER.info("max value in \"nums\" is: "+max.get());
		
		//----------reduce-------------
		List<String> symbols=Arrays.asList("we","have","one ","weird ","man ","here","in","the","train");
		Optional<String> res = symbols.stream().reduce((val1,retValue)->{return val1+" "+retValue;});
		LOGGER.debug("reduced value of List \"symbols\" is: "+res.get());
		

		LOGGER.info(	"sum of the ages is: "+	
				sampleList.stream()
				.mapToInt(e-> e.getAge())
				.sum());
	}
}
