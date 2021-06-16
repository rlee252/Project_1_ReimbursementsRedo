package com.revature.reimbursement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.revature.reimbursement")
//@EnableJpaRepositories("com.revature.reimbursement.dao")
@SpringBootApplication
@EntityScan("com.revature.reimbursement.model")
public class ReimbursementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReimbursementApplication.class, args);
	}

}
