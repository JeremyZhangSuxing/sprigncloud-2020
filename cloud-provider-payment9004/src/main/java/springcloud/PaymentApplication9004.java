package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author suxing.zhang
 * @date 2021/8/1 20:38
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9004.class, args);
    }
}
