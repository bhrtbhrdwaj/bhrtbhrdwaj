package com.training.enums;

public class EnumDemo {
	public enum Level{
		HIGH(3) {
			@Override
			public String getLowerCase() {
				return HIGH.toString().toLowerCase();
			}
		},
		MEDIUM(2) {
			@Override
			public String getLowerCase() {
				return MEDIUM.toString().toLowerCase();
			}
		},
		LOW(1) {
			@Override
			public String getLowerCase() {
				return LOW.toString().toLowerCase();
			}
		};
		
		private final int levelCode;
		Level(int code){
			this.levelCode=code;
		}
		
		public int getLevelCode() {
			return levelCode;
		}
		
		public abstract String getLowerCase();
	}
	
	
	
	public static void main(String[] args) {
		Level level=Level.HIGH;
		System.out.println(level.getLevelCode());
		
		System.out.println(Level.valueOf("HIGH"));
		
		
	}
}
