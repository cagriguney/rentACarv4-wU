package turkcell.rentacar.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import turkcell.rentacar.business.abstracts.InvoiceService;
import turkcell.rentacar.business.abstracts.RentalService;
import turkcell.rentacar.business.dtos.GetListInvoiceDto;
import turkcell.rentacar.business.dtos.ListInvoiceDto;
import turkcell.rentacar.business.requests.create.CreateInvoiceRequest;
import turkcell.rentacar.business.requests.delete.DeleteInvoiceRequest;
import turkcell.rentacar.business.requests.update.UpdateInvoiceRequest;
import turkcell.rentacar.core.utilities.mapping.ModelMapperService;
import turkcell.rentacar.core.utilities.results.DataResult;
import turkcell.rentacar.core.utilities.results.Result;
import turkcell.rentacar.core.utilities.results.SuccessDataResult;
import turkcell.rentacar.core.utilities.results.SuccessResult;
import turkcell.rentacar.dataAccess.abstracts.InvoiceDao;
import turkcell.rentacar.entities.concretes.Invoice;

@Service
public class InvoiceManager implements InvoiceService {

	private ModelMapperService modelMapperService;
	private InvoiceDao invoiceDao;
	private RentalService rentalService;
	
	@Override
	public Result add(CreateInvoiceRequest createInvoiceRequest) {
		Invoice invoice=this.modelMapperService.forRequest().map(createInvoiceRequest, Invoice.class);
		this.invoiceDao.save(invoice);
		return new SuccessResult("Invoice.added");
	}
	@Override
	public Result delete(DeleteInvoiceRequest deleteInvoiceRequest) {
		Invoice invoice=this.modelMapperService.forRequest().map(deleteInvoiceRequest, Invoice.class);
		this.invoiceDao.delete(invoice);
		return new SuccessResult("Invoice.deleted");
	}
	@Override
	public Result update(UpdateInvoiceRequest updateInvoiceRequest) {
		Invoice invoice=this.modelMapperService.forRequest().map(updateInvoiceRequest, Invoice.class);
		this.invoiceDao.save(invoice);
		return new SuccessResult("Invoice.updated");
	}
	@Override
	public DataResult<List<GetListInvoiceDto>> getById() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<ListInvoiceDto>> getAll() {
		List<Invoice> result=this.invoiceDao.findAll();
		List<ListInvoiceDto> response=result.stream()
				.map(invoice->this.modelMapperService.forDto().map(invoice, ListInvoiceDto.class)).collect(Collectors.toList());
		
		return new SuccessDataResult<List<ListInvoiceDto>>(response);
	}
	@Override
	public DataResult<List<ListInvoiceDto>> getByDate(LocalDate rentDate, LocalDate returnDate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<ListInvoiceDto>> getByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
