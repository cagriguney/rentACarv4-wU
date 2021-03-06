package turkcell.rentacar.business.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCarMaintenanceDto {

	private int maintenanceId;
		
	private String description;
	
	private LocalDate returnDate;
	
	private int carId;
}
