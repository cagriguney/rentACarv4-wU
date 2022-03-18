package turkcell.rentacar.business.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListInvoiceDto {
	
	private int invoiceId;
	private int customerId;
	private int rentalId;
	private LocalDate createdDate;
	
	private LocalDate rentDate;
	private LocalDate returnDate;
	private int rentDays;
	private double totalPrice;
	
	
	
}
