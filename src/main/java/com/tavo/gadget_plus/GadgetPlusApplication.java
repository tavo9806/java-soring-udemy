package com.tavo.gadget_plus;

import com.tavo.gadget_plus.Entities.BillEntity;
import com.tavo.gadget_plus.Entities.OrderEntity;
import com.tavo.gadget_plus.Interfaces.BillRepository;
import com.tavo.gadget_plus.Interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class GadgetPlusApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private BillRepository billRepository;

	public static void main(String[] args) {
		SpringApplication.run(GadgetPlusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//this.orderRepository.findAll().forEach(order -> System.out.println(order));

		/*var bill = BillEntity.builder()
				.rfc("UVWX0123456X")
				.totalAmount(BigDecimal.TEN)
				.id("b-20")
				.build();

		//this.billRepository.save(bill);

		var order = OrderEntity.builder()
				.createdAt(LocalDateTime.now())
				.clientName("Alex Pereira")
				.bill(bill)
				.build();
		this.orderRepository.save(order);*/
	}
}
