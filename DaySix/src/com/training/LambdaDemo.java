package com.training;


import java.util.function.Function;
import static java.lang.System.out;
public class LambdaDemo {
	public static void main(String... args) {
		Function<String, String> function = (str) -> str;
		out.println(function.apply("Hello!"));
	}
}
