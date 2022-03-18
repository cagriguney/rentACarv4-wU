package turkcell.rentacar.business.requests.update;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import turkcell.rentacar.business.requests.create.CreateBrandRequest;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInvoiceRequest {
	
	@NotNull
	@Positive
	private int invoiceId;
	@NotNull
	@Positive
	private LocalDate createdDate;
	@NotNull
	@Positive
	private LocalDate rentDate;
	@NotNull
	@Positive
	private LocalDate returnDate;
	@NotNull
	@Positive
	private int customerId;
	
}
