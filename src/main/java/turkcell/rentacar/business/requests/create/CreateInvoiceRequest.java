package turkcell.rentacar.business.requests.create;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInvoiceRequest {

	/*(Fatura No, Oluşturma Tarihi, Kiralama tarihleri, Toplam kiralama gün sayısı, kiralama tutarı,musteri)*/
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
