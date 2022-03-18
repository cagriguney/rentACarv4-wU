package turkcell.rentacar.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import turkcell.rentacar.business.dtos.GetListRentDto;
import turkcell.rentacar.business.dtos.ListRentDto;
import turkcell.rentacar.business.requests.create.CreateRentalRequest;
import turkcell.rentacar.business.requests.delete.DeleteRentalRequest;
import turkcell.rentacar.business.requests.update.UpdateRentalRequest;
import turkcell.rentacar.core.concretes.BusinessException;
import turkcell.rentacar.core.utilities.results.DataResult;
import turkcell.rentacar.core.utilities.results.Result;
import turkcell.rentacar.entities.concretes.Rental;

public interface RentalService {
	Result add(CreateRentalRequest createRentRequest) ;
	Result delete(DeleteRentalRequest deleteRentRequest) ;
	Result update(UpdateRentalRequest updateRentRequest);
		
	DataResult<List<ListRentDto>> getAll();
	DataResult<List<ListRentDto>> getAllPaged(int pageNo , int pageSize);
	DataResult<List<ListRentDto>> getAllSorted(Sort.Direction direction);	
	
	DataResult<GetListRentDto> getByRentId(int rentalId) ;
	List<ListRentDto> getByCar_CarId(int carId) ;
	
	//boolean checkRentCarReturnDate(int carId);
	boolean checkRentCarExists(int carId);
	boolean checkRentCarDate(int carId) throws BusinessException;	
	
	double calculatorTotalPrice(Rental rental ,List<Integer> additionalServiceId ,
			int carId ,int rentalCityId , int returnCityId);
	//double calculatorTotalPrice(Rental rental ,int additionalServiceId , int carId ,int rentalCityId , int returnCityId) ;
	
	boolean IsCarUsed(int carId) ;
	
	
	void updateCarKm(int carId , int lastKm);
}

