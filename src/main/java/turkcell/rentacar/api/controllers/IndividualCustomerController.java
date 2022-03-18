package turkcell.rentacar.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import turkcell.rentacar.business.abstracts.IndividualCustomerService;
import turkcell.rentacar.business.dtos.ListIndividualCustomerDto;
import turkcell.rentacar.business.requests.create.CreateIndividualCustomerRequest;
import turkcell.rentacar.business.requests.update.UpdateIndividualCustomerRequest;
import turkcell.rentacar.core.utilities.results.DataResult;
import turkcell.rentacar.core.utilities.results.Result;

@RestController
@RequestMapping("/api/IndividualCustomers")
public class IndividualCustomerController {

	private IndividualCustomerService individualCustomerService;

	@Autowired
	public IndividualCustomerController(IndividualCustomerService individualCustomerService) {
		this.individualCustomerService = individualCustomerService;
	}

	@GetMapping("/getAll")
	DataResult<List<ListIndividualCustomerDto>> getAll() {
		return this.individualCustomerService.getAll();

	}

	@GetMapping("/get/IndividualCustomerId")
	DataResult<ListIndividualCustomerDto> getById(int id) {
		return this.individualCustomerService.getById(id);
	}

	@PostMapping("/add/IndividualCustomer")
	public Result add(@RequestBody @Valid CreateIndividualCustomerRequest createIndividualCustomerRequest) {
		return this.individualCustomerService.add(createIndividualCustomerRequest);
	}

	@PutMapping("/update/IndividualCustomer")
	public Result update(@RequestBody @Valid UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
		return this.individualCustomerService.update(updateIndividualCustomerRequest);
	}

}
