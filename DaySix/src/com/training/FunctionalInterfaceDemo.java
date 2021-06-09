package com.training;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@FunctionalInterface
interface MyInterface{
	public void display(String name);
}


public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		MyInterface display = (name)-> out.println(name);
		display.display("Bharat");
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		
		List<Integer> filtered = numbers.stream().filter((num)-> {
			if((num % 2) == 0) { return true;}else{return false;}}).collect(Collectors.toList());
		filtered.forEach((i)-> out.println(i));
	}

}
