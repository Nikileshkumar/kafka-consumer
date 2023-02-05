package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@Bean
	public Consumer<String> consumer(){
		return System.out::println;
	}

	@Bean
	public Function<String,String> process(){
		System.out.println("process");
		return x-> {
			System.out.println(x);
			return x;
		};
	}

}
