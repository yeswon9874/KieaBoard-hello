package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.utils.CurrentInfo;
import org.tain.utils.Flag;
import org.tain.working.BoardWorking;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class KieaBoard00Hello00Application implements CommandLineRunner {

	public static void main(String[] args) {
		log.info("YEWON-20210518 >>>>> {} {}", CurrentInfo.get());
		SpringApplication.run(KieaBoard00Hello00Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (Flag.flag) job01();
	}
	
	@Autowired
	private BoardWorking boardWorking;

	private void job01() {
		log.info("YEWON-20210518 >>>>> {} {}", CurrentInfo.get());
		
		if (Flag.flag) boardWorking.loading();
		if (Flag.flag) boardWorking.selecting();
	}
}
