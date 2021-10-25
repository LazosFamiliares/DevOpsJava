package udem.SampleJava.servingwebcontent;

import org.springframework.data.mongodb.repository.MongoRepository;
import udem.SampleJava.servingwebcontent.domain.Customer;

public interface CustomeRepository extends MongoRepository<Customer, String> {
}
