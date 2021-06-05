package com.training.stringInnerClass;

class InvaliedAgeException extends Exception{
	public static final long serialVersionUID = 1l;
	public InvaliedAgeException(String s) {
		super(s);
	}

	@Override
	public String getMessage() {
		return "MY MEssage";
	}
}


class TestCustomException{
	public static void validate(int age) throws InvaliedAgeException {
		if(age<18) {
			throw new InvaliedAgeException("Not valied age");
		}
		else
			System.out.println("Everything is ok for vote");
	}
}





public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			TestCustomException.validate(12);

		}
		catch (InvaliedAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

