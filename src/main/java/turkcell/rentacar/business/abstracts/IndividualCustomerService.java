package turkcell.rentacar.business.abstracts;

import java.util.List;

import turkcell.rentacar.business.dtos.ListIndividualCustomerDto;
import turkcell.rentacar.business.requests.create.CreateIndividualCustomerRequest;
import turkcell.rentacar.business.requests.delete.DeleteCorporateCustomerRequest;
import turkcell.rentacar.business.requests.delete.DeleteIndividualCustomerRequest;
import turkcell.rentacar.business.requests.update.UpdateIndividualCustomerRequest;
import turkcell.rentacar.core.utilities.results.DataResult;
import turkcell.rentacar.core.utilities.results.Result;

public interface IndividualCustomerService {
	Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest);
	Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);	
	Result delete(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest);
	DataResult<List<ListIndividualCustomerDto>> getAll();
	DataResult<ListIndividualCustomerDto> getById(int id);
	
	boolean checkIndividualCustomerExists(int id);
	
}
