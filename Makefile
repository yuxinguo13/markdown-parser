WordCount.class: WordCount.java
	javac WordCount.java

WordCountTest.class: WordCountTest.java WordCount.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar WordCountTest.java
	
